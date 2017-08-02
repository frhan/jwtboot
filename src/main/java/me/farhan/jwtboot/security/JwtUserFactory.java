package me.farhan.jwtboot.security;


import java.util.List;
import java.util.stream.Collectors;

import me.farhan.jwtboot.model.dto.UserDto;
import me.farhan.jwtboot.model.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public final class JwtUserFactory {

  private JwtUserFactory() {
  }

  public static UserDto create(User user) {
    return new UserDto(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword(),user.isEnabled());
  }

//  private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
//    return authorities.stream()
//            .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
//            .collect(Collectors.toList());
//  }
}
