package com.example.ecommercespringboot.dto;

import jakarta.persistence.Column;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ProductDto {

  @Column
  private String name;
  private String description;
  private String imgUrl;
  private double price;
  private int stock;
  private boolean state;
  private UUID categoryId;

}
