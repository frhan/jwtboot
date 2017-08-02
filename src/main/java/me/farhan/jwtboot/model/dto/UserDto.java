package me.farhan.jwtboot.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Value
public class UserDto implements UserDetails {

  private final String firstName;
  private final String lastName;
  private final String userName;
  private final String password;
  private final String email;
  private final boolean isEnambled;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @JsonIgnore
  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return userName;
  }

  @JsonIgnore
  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @JsonIgnore
  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @JsonIgnore
  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }
}
