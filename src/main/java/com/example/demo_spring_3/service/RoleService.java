package com.example.demo_spring_3.service;


import com.example.demo_spring_3.model.Role;

public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);
}
