package com.example.ecommercespringboot.controller;

import com.example.ecommercespringboot.entity.Role;
import com.example.ecommercespringboot.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/roles")
public class RoleController {
  private RoleService roleService;
  @GetMapping("/name/{name}")
  public ResponseEntity<Role> getByName(@PathVariable String name){
    Role role = roleService.getByName(name);
    return ResponseEntity.status(HttpStatus.OK).body(role);
  }
}
