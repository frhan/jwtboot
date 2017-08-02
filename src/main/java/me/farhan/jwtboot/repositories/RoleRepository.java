package me.farhan.jwtboot.repositories;


import me.farhan.jwtboot.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
  Role findByName(String name);

}
