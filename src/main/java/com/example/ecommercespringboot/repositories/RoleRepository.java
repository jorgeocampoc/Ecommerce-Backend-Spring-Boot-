package com.example.ecommercespringboot.repositories;

import com.example.ecommercespringboot.entity.Role;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {


//    //query nativas
//  @Query(value = "select * from roles where name = ?1", nativeQuery = true)
//  Optional<Role> findRoleByName(String name);


//  //JPQL =  hace referencia a objetos no a tablas, (roles no, role si)
//  @Query(value = "select r from Role r where r.name = ?1")
//  Optional<Role> getRolByName(String name);


  //query metodos
  Optional<Role> findByName(String name);
}
