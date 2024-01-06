package com.example.ecommercespringboot.services;

import com.example.ecommercespringboot.dto.ProductDto;
import com.example.ecommercespringboot.entity.Product;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
  Product save(ProductDto product);
  Product getById(UUID uuid);
  Page<Product> getProduct(Pageable pageable);
  Page<Product> getProductFiltered(Double minPrice, Double maxPrice, Pageable pageable);

}
