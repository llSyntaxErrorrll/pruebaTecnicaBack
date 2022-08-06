package com.pruebaTecnica.service;

import com.pruebaTecnica.model.PlayList;
import com.pruebaTecnica.repository.PlayListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayListService {

    public PlayListService(PlayListRepository playListRepository) {
        this.playListRepository = playListRepository;
    }

    @Autowired
    private PlayListRepository playListRepository;

    public List<PlayList> findAll() {
        return playListRepository.findAll();
    }

    public PlayList findPlayListByName(String listName) {
        return playListRepository.findPlayListByName(listName);
    }

    public PlayList save(PlayList playList) {
        return playListRepository.save(playList);
    }

    public PlayList deleteByName(String listName) {
        PlayList playList = findPlayListByName(listName);
        if(playList != null){
            playListRepository.delete(playList);
        }
        return new PlayList();
    }
}