package com.example.ecommercespringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.sql.Types;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;
import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;

@Entity
@Table(name = "categories")
public class Category {

  @Id
  @GeneratedValue
  @JdbcTypeCode(Types.VARCHAR)
  private UUID id;
  @Column(name = "name",nullable = false, length = 30)
  private String name;
  @Column(length = 50)
  private String description;
  @Column(name = "date_created")
  private LocalDate dateUp;
  @Column(name = "date_modification")
  private LocalDate dateModification;


  public Category() {
  }

  public Category(UUID id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public LocalDate getDateUp() {
    return dateUp;
  }

  public void setDateUp(LocalDate dateUp) {
    this.dateUp = dateUp;
  }

  public LocalDate getDateModification() {
    return dateModification;
  }

  public void setDateModification(LocalDate dateModification) {
    this.dateModification = dateModification;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void afterPersistDateUp() {
    this.dateUp = LocalDate.now();
  }

  public void afterPersistDateModification() {
    this.dateModification = LocalDate.now();
  }

  @Override
  public String toString() {
    return "Category{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return id.equals(category.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
