package com.example.ecommercespringboot.controller;
import com.example.ecommercespringboot.dto.ProductDto;
import com.example.ecommercespringboot.entity.Product;
import com.example.ecommercespringboot.services.ProductService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
  private ProductService productService;
  @PostMapping
    public ResponseEntity<Product> save(@RequestBody ProductDto  dto){
    Product productSaved = productService.save(dto);
    return ResponseEntity.status(HttpStatus.CREATED).body(productSaved);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable UUID id){
      Product product = productService.getById(id);
      return ResponseEntity.status(HttpStatus.OK).body(product);
    }
    @GetMapping("/pageable")
    public ResponseEntity<Page<Product>> getProductsPageable(@RequestParam int page, @RequestParam int size){
      Pageable pageable = PageRequest.of(page, size);
      Page<Product> products =  productService.getProduct(pageable);
      return ResponseEntity.status(HttpStatus.OK).body(products);
    }
    //getAllproduct filtrador por precio, con ordenamiendo y paginable
  @GetMapping
  public ResponseEntity<Page<Product>> getProductsPageableFiltered(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "20") int size,
      @RequestParam Double minPrice,
      @RequestParam Double maxPrice,
      @RequestParam(defaultValue = "id") String sourField,
      @RequestParam(defaultValue = "asc") String sortOrder
  ){
    Sort sort = Sort.by(Sort.Direction.fromString(sortOrder),sourField);
    Pageable pageable = PageRequest.of(page, size, sort);

    Page<Product> products =  productService.getProductFiltered(minPrice, maxPrice,pageable);
    return ResponseEntity.status(HttpStatus.OK).body(products);
  }
}

