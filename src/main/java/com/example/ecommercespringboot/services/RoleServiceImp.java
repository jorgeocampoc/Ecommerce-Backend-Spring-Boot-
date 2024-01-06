package com.example.ecommercespringboot.services;

import com.example.ecommercespringboot.entity.Role;
import com.example.ecommercespringboot.repositories.RoleRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImp implements RoleService{
  private RoleRepository roleRepository;
  @Override
  public Role getByName(String name) {
    return roleRepository.findByName(name).orElseThrow(()->new EntityNotFoundException("Role not found"));
  }
}
