package com.pruebaTecnica.controller;

import com.pruebaTecnica.model.PlayList;
import com.pruebaTecnica.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("playlist")
public class PlayListController {

    public PlayListController(PlayListService playListService) {
        this.playListService = playListService;
    }

    @Autowired
    private PlayListService playListService;

    @GetMapping("lists")
    public ResponseEntity<List<PlayList>> findAll() {
        return ResponseEntity.ok(playListService.findAll());
    }

    @GetMapping("lists/{listName}")
    public ResponseEntity<PlayList> findPlayListByName(@PathVariable String listName) {
        return ResponseEntity.ok(playListService.findPlayListByName(listName));
    }

    @PostMapping("lists")
    public ResponseEntity<PlayList> save(@RequestBody PlayList playList){
        return ResponseEntity.ok(playListService.save(playList));
    }

    @DeleteMapping("lists/{listName}")
    public ResponseEntity<PlayList> deleteByName(@PathVariable String listName){
        return ResponseEntity.ok(playListService.deleteByName(listName));
    }
}
