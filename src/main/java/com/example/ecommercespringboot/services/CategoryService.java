package com.example.ecommercespringboot.services;

import com.example.ecommercespringboot.entity.Category;
import java.util.List;
import java.util.UUID;

public interface CategoryService {
  List<Category> getAll();
  Category getById(UUID id);
}
