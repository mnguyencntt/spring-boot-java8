package com.anz.platform.util.java8.function;

@FunctionalInterface
public interface Interface2 {
  void method2();

  default void log(String str) {
    System.out.println("I2 logging::" + str);
  }

}
