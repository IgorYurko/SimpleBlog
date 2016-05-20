package com.simpleblog.repository;

import com.simpleblog.models.Blog;
import com.simpleblog.models.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer>
{
    List<Blog> findByUser(User user);
}
