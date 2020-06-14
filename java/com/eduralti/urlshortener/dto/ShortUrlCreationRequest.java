package com.eduralti.urlshortener.dto;

public class ShortUrlCreationRequest {
  private String target;
  private long expiryTime;

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public long getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(long expiryTime) {
    this.expiryTime = expiryTime;
  }

  @Override
  public String toString() {
    return "ShortUrlCreationRequest{" +
            "target='" + target + '\'' +
            ", expiryTime=" + expiryTime +
            '}';
  }
}
