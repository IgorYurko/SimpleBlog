package com.simpleblog.controllers;

import com.simpleblog.models.Blog;
import com.simpleblog.models.User;
import com.simpleblog.repository.UserRepository;
import com.simpleblog.services.BlogService;
import com.simpleblog.services.UserService;
import com.simpleblog.springform.BlogForm;
import com.simpleblog.springform.UserForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
public class HomeController
{

    @Inject
    private UserService userService;

    @Inject
    private BlogService blogService;

    @ModelAttribute(value = "userForm")
    public UserForm userFormController()
    {
        return new UserForm();
    }

    @ModelAttribute(value = "blogForm")
    public BlogForm blogFormController()
    {
        return new BlogForm();
    }

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String home(Locale locale, Model model)
    {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);


        return "index";
    }

    @RequestMapping(value = {"/users"}, method = RequestMethod.GET)
    public String users(Model model)
    {
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);

        return "users";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String usersFromId(@PathVariable int id, Model model)
    {
        User user = userService.findOneWithBlog(id);
        model.addAttribute(user);

        return "user-detail";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration()
    {
        return "registration";
    }

    @RequestMapping(value = "/registration/valid", method = RequestMethod.GET)
    @ResponseBody
    public String registrationValid(@RequestParam(name = "name") String name)
    {
        Boolean valid = userService.findOne(name) == null;
        return valid.toString();
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String doRegistration(@Valid @ModelAttribute UserForm userForm,
                                 BindingResult bindingResult,
                                 Model model)
    {
        if (bindingResult.hasErrors())
        {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            List<String> errors = fieldErrors.stream().map(FieldError::getField).collect(Collectors.toList());
            model.addAttribute("errors", errors);
//            model.addAttribute("bindingResult", bindingResult);
            return "registration";
        }

        userService.save(userForm);
        return "redirect:/registration.html?success=true";
    }

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String account(Model model, Principal principal)
    {
        String name = principal.getName();
        model.addAttribute("user", userService.findOneWithBlog(name));
        return "account";
    }

    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public String doAddBlog(@Valid @ModelAttribute BlogForm blogForm,
                            BindingResult bindingResult,
                            Principal principal,
                            Model model)
    {
        if (bindingResult.hasErrors())
        {
//            String name = principal.getName();
//            model.addAttribute("user", userService.findOneWithBlog(name));
            return account(model, principal);
        }

        String name = principal.getName();
        blogService.save(blogForm, name);
        return "redirect:/account.html";

    }

    @RequestMapping(value = "/blog/remove/{id}", method = RequestMethod.GET)
    public String blogRemove(@PathVariable int id)
    {
        Blog blog = blogService.findOne(id);
        blogService.delete(blog);
        return "redirect:/account.html";
    }

    @RequestMapping(value = "/user/remove/{id}", method = RequestMethod.GET)
    public String userRemove(@PathVariable int id)
    {
        userService.delete(id);
        return "redirect:/users.html";
    }
}
