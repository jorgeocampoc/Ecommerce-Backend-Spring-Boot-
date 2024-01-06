package com.example.ecommercespringboot.services;

import com.example.ecommercespringboot.dto.ProductDto;
import com.example.ecommercespringboot.entity.Category;
import com.example.ecommercespringboot.entity.Product;
import com.example.ecommercespringboot.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class ProductServiceImp implements ProductService{
  private ProductRepository productRepository;
  private CategoryService categoryService;
  @Override
  public Product save(ProductDto dto) {
    Category category = categoryService.getById(dto.getCategoryId());
    Product product = new Product();
    product.setName(dto.getName());
    product.setDescription(dto.getDescription());
    product.setPrice(dto.getPrice());
    product.setStock(dto.getStock());
    product.setState(dto.isState());
    product.setImgUrl(dto.getImgUrl());
    product.setCategory(category);
    return productRepository.save(product);
  }

  @Override
  public Product getById(UUID uuid) {
    return productRepository.findById(uuid).orElseThrow(()->new EntityNotFoundException("Product not found"));

  }

  @Override
  public Page<Product> getProduct(Pageable pageable) {
    return productRepository.findAll(pageable);
  }

  @Override
  public Page<Product> getProductFiltered(Double minPrice, Double maxPrice, Pageable pageable) {
    return productRepository.findByPriceBetween(minPrice, maxPrice, pageable);
  }
}
