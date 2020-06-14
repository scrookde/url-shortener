package com.eduralti.urlshortener.model;

import com.eduralti.urlshortener.utils.RandomString;

public class ShortUrl {
  private String id;
  private String target;

  private ShortUrl(String id, String target) {
    this.id = id;
    this.target = target;
  }

  public static ShortUrl create(String target) {
    return new ShortUrl(RandomString.create(6), target);
  }

  public String getId() {
    return id;
  }

  public String getTarget() {
    return target;
  }

}
