package com.eduralti.urlshortener.utils;


public class RandomString {
  private static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

  public static String create(int length) {
    StringBuilder randomString = new StringBuilder();
    for (int i = 0; i < length; i++) {
      randomString.append(SOURCE.charAt((int)(Math.random() * SOURCE.length())));
    }
    return randomString.toString();
  }
}
