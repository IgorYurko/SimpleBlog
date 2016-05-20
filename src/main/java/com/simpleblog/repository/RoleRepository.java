package com.simpleblog.repository;

import com.simpleblog.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>
{
    Role findByName(String name);
}
