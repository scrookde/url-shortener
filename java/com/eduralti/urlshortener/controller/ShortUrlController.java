package com.eduralti.urlshortener.controller;

import com.eduralti.urlshortener.dto.ShortUrlCreationRequest;
import com.eduralti.urlshortener.model.ShortUrl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ShortUrlController {
  private Map<String, ShortUrl> shortenUrls = new HashMap<>();

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @PostMapping("/")
  public ResponseEntity<String> createShortUrl(@RequestBody ShortUrlCreationRequest creationRequest) {
    ShortUrl url = ShortUrl.create(creationRequest.getTarget());
    shortenUrls.put(url.getId(), url);
    return new ResponseEntity<>(url.getId(), HttpStatus.CREATED);
  }

  @GetMapping("{id}")
  public void getUrl(HttpServletResponse response, @PathVariable String id) throws IOException {
    response.sendRedirect(shortenUrls.get(id).getTarget());
  }

}
