package me.farhan.jwtboot.exceptions;

/**
 * Created by farhan on 8/18/17.
 */
public class EmailExistsException extends Exception {
  public EmailExistsException(String msg){
    super(msg);
  }
}
