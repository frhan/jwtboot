package me.farhan.jwtboot.service;

import me.farhan.jwtboot.exceptions.EmailExistsException;
import me.farhan.jwtboot.model.dto.UserDto;
import me.farhan.jwtboot.model.entity.User;

public interface UserService {
  public User registerUser(UserDto userDto) throws EmailExistsException;
}
