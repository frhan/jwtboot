package me.farhan.jwtboot.model.dto;


import lombok.Value;

@Value
public class UserDto {

  private final String firstName;
  private final String lastName;
  private final String userName;
  private final String email;
  private final boolean isEnambled;
}
