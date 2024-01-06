package com.example.ecommercespringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Types;
import java.util.UUID;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;
    @Column
    private String name;
    private String description;
    private String imgUrl;
    private Double price;
    private Integer stock;
    private Boolean state;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
