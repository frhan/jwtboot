package me.farhan.jwtboot.repositories;


import me.farhan.jwtboot.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByUserName(String name);
}
