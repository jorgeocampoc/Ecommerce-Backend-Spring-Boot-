package com.example.ecommercespringboot.services;

import com.example.ecommercespringboot.entity.Category;
import com.example.ecommercespringboot.repositories.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CategoryServiceImp implements CategoryService{

  //@Autowired
  private CategoryRepository categoryRepository;
  //inyector a nivel  cosntructor puede ser reemplazado por lombok
//  public CategoryServiceImp(CategoryRepository categoryRepository){
//    this.categoryRepository = categoryRepository;
//  }
  @Override
  public List<Category> getAll() {
    return categoryRepository.findAll();
  }

  @Override
  public Category getById(UUID id) {
    return categoryRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Category not found"));
  }
}
