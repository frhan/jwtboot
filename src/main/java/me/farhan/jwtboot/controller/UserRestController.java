package me.farhan.jwtboot.controller;

import me.farhan.jwtboot.model.dto.UserDto;
import me.farhan.jwtboot.security.JwtTokenUtil;
import me.farhan.jwtboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
public class UserRestController {

  @Value("${jwt.header}")
  private String tokenHeader;

  @Autowired
  private JwtTokenUtil jwtTokenUtil;

  @Autowired
  private UserDetailsService userDetailsService;

  @Autowired
  private UserService userService;



  @GetMapping(value = "/user")
  public UserDto getAuthenticatedUser(HttpServletRequest request) {
    String token = request.getHeader(tokenHeader);
    String username = jwtTokenUtil.getUsernameFromToken(token);
    UserDto user = (UserDto) userDetailsService.loadUserByUsername(username);
    return user;
  }

  @PostMapping("/register")
  public ResponseEntity<?> registerUser(@RequestBody UserDto user){
    userService.registerUser(user);
    return ResponseEntity.ok(null);
  }

}
