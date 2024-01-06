package com.example.ecommercespringboot.services;

import com.example.ecommercespringboot.entity.Role;

public interface RoleService {
  Role getByName(String name);
}
