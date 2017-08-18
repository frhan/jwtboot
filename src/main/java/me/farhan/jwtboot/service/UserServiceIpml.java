package me.farhan.jwtboot.service;

import me.farhan.jwtboot.exceptions.EmailExistsException;
import me.farhan.jwtboot.model.dto.UserDto;
import me.farhan.jwtboot.model.entity.User;
import me.farhan.jwtboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceIpml implements UserService {

  @Autowired
  private PasswordEncoder bCryptPasswordEncoder;


  @Autowired
  private UserRepository userRepository;

  @Transactional
  @Override
  public User registerUser(UserDto accountDto) throws EmailExistsException {
    if (emailExist(accountDto.getEmail())) {
      throw new EmailExistsException("There is an account with that email address:"+ accountDto.getEmail());
    }
    User user = new User();
    user.setEmail(accountDto.getEmail());
    user.setPassword(bCryptPasswordEncoder.encode(accountDto.getPassword()));
    user.setEmail(accountDto.getEmail());
    return userRepository.save(user);
  }

  private boolean emailExist(final String userName){
    User user = userRepository.findByUserName(userName);
    if (user != null) {
      return true;
    }
    return false;
  }


}
