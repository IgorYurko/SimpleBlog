package com.simpleblog.services;


import com.simpleblog.models.Blog;
import com.simpleblog.models.Item;
import com.simpleblog.models.Role;
import com.simpleblog.models.User;
import com.simpleblog.repository.BlogRepository;
import com.simpleblog.repository.ItemRepository;
import com.simpleblog.repository.RoleRepository;
import com.simpleblog.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class InitDbService
{
    @Inject
    private UserRepository userRepository;

    @Inject
    private RoleRepository roleRepository;

    @Inject
    private ItemRepository itemRepository;

    @Inject
    private BlogRepository blogRepository;

    @PostConstruct
    public void init()
    {
        Role roleAdmin = new Role();
        roleAdmin.setName("ROLE_ADMIN");
        roleRepository.save(roleAdmin);

        Role roleUser = new Role();
        roleUser.setName("ROLE_USER");
        roleRepository.save(roleUser);

        User user = new User();
        user.setName("Igor");
        user.setEnabled(true);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode("1111"));
        user.setEmail("igor.yurko.mail@gmail.com");
        List<Role> roleList = new ArrayList<>();
        roleList.add(roleAdmin);
        roleList.add(roleUser);
        user.setRoles(roleList);
        userRepository.save(user);

        Blog blog = new Blog();
        blog.setName("JPA");
        blog.setUrl("blog_JPA");
        blog.setUser(user);
        blogRepository.save(blog);

        Item itemJpa  = new Item();
        itemJpa.setTitle("Spring in action JPA");
        itemJpa.setBlog(blog);
        itemJpa.setPublishedDate(new Date());
        itemJpa.setDescription("Description");
        itemJpa.setLink("http://igor-yurko/");
        itemRepository.save(itemJpa);

        Item itemSpring = new Item();
        itemSpring.setTitle("Jpa - is good");
        itemSpring.setBlog(blog);
        itemSpring.setPublishedDate(new Date());
        itemSpring.setDescription("Description");
        itemSpring.setLink("http://igor-yurko/");
        itemRepository.save(itemSpring);
    }

    public UserRepository getUserRepository()
    {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public RoleRepository getRoleRepository()
    {
        return roleRepository;
    }

    public void setRoleRepository(RoleRepository roleRepository)
    {
        this.roleRepository = roleRepository;
    }

    public ItemRepository getItemRepository()
    {
        return itemRepository;
    }

    public void setItemRepository(ItemRepository itemRepository)
    {
        this.itemRepository = itemRepository;
    }

    public BlogRepository getBlogRepository()
    {
        return blogRepository;
    }

    public void setBlogRepository(BlogRepository blogRepository)
    {
        this.blogRepository = blogRepository;
    }
}
