package com.anz.platform.api.service;

import org.springframework.stereotype.Service;

@Service
public class AlbumService {
  public String getAlbumList() {
    return "{ \"userId\": 1, \"id\": 1, \"title\": \"mock test\" }";
  }
}
