package com.example.ecommercespringboot;

import com.example.ecommercespringboot.entity.Category;
import com.example.ecommercespringboot.entity.Role;
import com.example.ecommercespringboot.repositories.CategoryRepository;
import com.example.ecommercespringboot.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(EcommerceSpringBootApplication.class, args);
  }
//  @Bean
//  public CommandLineRunner setData(CategoryRepository categoryRepository, RoleRepository roleRepository){
//    return arg ->{
//      Category category = new Category();
//      category.setName("Travel");
//      category.setDescription("Category description about travels");
//
//      Category category2 = new Category();
//      category2.setName("Sport");
//      category2.setDescription("category description about Sport");
//
//      Role role = new Role();
//      role.setName("USER");
//      role.setDescription("This role is USER");
//
//      Role admin = new Role();
//      admin.setName("ADMIN");
//      admin.setDescription("this role is ADMIN");
//
//      categoryRepository.save(category);
//      categoryRepository.save(category2);
//      roleRepository.save(role);
//      roleRepository.save(admin);
//    };
//  }

}
