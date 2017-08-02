package me.farhan.jwtboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

  @RequestMapping(path = "/get",method = RequestMethod.GET)
  public String getVal(){
    return "OK";
  }
}
