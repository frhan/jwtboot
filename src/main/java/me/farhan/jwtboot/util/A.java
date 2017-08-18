package me.farhan.jwtboot.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by farhan on 8/3/17.
 */

public class A {

  private int x;
  private int y;

  static{
    System.out.println("static A");
  }

  {
    System.out.println("block A1");
  }
  {
    System.out.println("block A2");
  }

  A(int x, int y) {
    this.x = x;
    this.y = x;
    System.out.println("Constructor A");
  }

  public static void main(String... args) {

    new C();
  }


}

class B extends A{
  static {
    System.out.println("static B");
  }
  {
    System.out.println("block B");
  }

  public B(int a,int b){
    super(a,b);
    System.out.println("Construct0r B");
  }

  void slam() {
  }
}

class C extends B{

  static {
    System.out.println("static C");
  }
  {
    System.out.println("block C");
  }
  public C(){
   super(10,10);
    System.out.println("Constructor C");
  }

  void slam() {
  }
}