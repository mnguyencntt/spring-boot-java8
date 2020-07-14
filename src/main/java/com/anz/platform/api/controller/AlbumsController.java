package com.anz.platform.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anz.platform.api.service.AlbumService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AlbumsController {
  @Autowired
  private AlbumService albumService;

  @GetMapping("/albums")
  public String albums() {
    String response = albumService.getAlbumList();
    log.info("{}", response);
    return response;
  }
}
