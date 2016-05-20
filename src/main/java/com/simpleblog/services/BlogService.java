package com.simpleblog.services;


import com.simpleblog.models.Blog;
import com.simpleblog.models.User;
import com.simpleblog.repository.BlogRepository;
import com.simpleblog.repository.UserRepository;
import com.simpleblog.springform.BlogForm;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class BlogService
{
    @Inject
    BlogRepository blogRepository;

    @Inject
    UserRepository userRepository;

    public void save(BlogForm blogForm, String name)
    {
        User user = userRepository.findByName(name);
        Blog blog = new Blog();
        blog.setName(blogForm.getName());
        blog.setUrl(blogForm.getUrl());
        blog.setUser(user);
        blogRepository.save(blog);
    }

    @PreAuthorize("#blog.user.name == authentication.name or hasRole('ROLE_ADMIN')")
    public void delete(@P(value = "blog")Blog blog)
    {
        blogRepository.delete(blog);
    }

    public Blog findOne(int id)
    {
        return blogRepository.findOne(id);
    }
}
