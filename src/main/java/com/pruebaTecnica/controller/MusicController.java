package com.pruebaTecnica.controller;

import com.pruebaTecnica.model.Music;
import com.pruebaTecnica.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    @RequestMapping("lists")
    public ResponseEntity<List<Music>> findAll() {
        return ResponseEntity.ok(musicService.findAll());
    }

}
