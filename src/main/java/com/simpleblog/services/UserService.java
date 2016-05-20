package com.simpleblog.services;


import com.simpleblog.models.Blog;
import com.simpleblog.models.Item;
import com.simpleblog.models.Role;
import com.simpleblog.models.User;
import com.simpleblog.repository.BlogRepository;
import com.simpleblog.repository.ItemRepository;
import com.simpleblog.repository.RoleRepository;
import com.simpleblog.repository.UserRepository;
import com.simpleblog.springform.UserForm;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService
{
    @Inject
    UserRepository userRepository;

    @Inject
    BlogRepository blogRepository;

    @Inject
    ItemRepository itemRepository;

    @Inject
    RoleRepository roleRepository;

    public List<User> findAll()
    {
        return userRepository.findAll();
    }

    public User findOne(int id)
    {
        return userRepository.findOne(id);
    }

    @Transactional
    public User findOneWithBlog(int id)
    {
        User user = findOne(id);
        List<Blog> blogs = blogRepository.findByUser(user);
        for (Blog blog : blogs)
        {
            List<Item> items = itemRepository.findByBlog(blog, new PageRequest(0, 10, Sort.Direction.DESC,
                    "publisheddate"));
            blog.setItems(items);
        }
        user.setBlogs(blogs);

        return user;
    }

    public void save(UserForm userForm)
    {
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(userForm.getPassword()));
        user.setEnabled(true);

        List<Role> roleList = new ArrayList<>();
        roleList.add(roleRepository.findByName("ROLE_USER"));
        user.setRoles(roleList);

        userRepository.save(user);
    }

    public User findOneWithBlog(String name)
    {
        User user = userRepository.findByName(name);

        return findOneWithBlog(user.getId());
    }

    public void delete(int id)
    {
        userRepository.delete(id);
    }

    public User findOne(String username)
    {
        return userRepository.findByName(username);
    }
}
