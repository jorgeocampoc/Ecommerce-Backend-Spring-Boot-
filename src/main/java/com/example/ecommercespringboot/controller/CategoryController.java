package com.example.ecommercespringboot.controller;

import com.example.ecommercespringboot.entity.Category;
import com.example.ecommercespringboot.services.CategoryService;
import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
  private CategoryService categoryService;
  @GetMapping
  public ResponseEntity<List<Category>> getAll(){
    List<Category> categories = categoryService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(categories);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Category> getById(@PathVariable UUID id){
    Category category = categoryService.getById(id);
    return ResponseEntity.status(HttpStatus.OK).body(category);
  }
}
