package com.pruebaTecnica.service;

import com.pruebaTecnica.model.Music;
import com.pruebaTecnica.repository.MusicRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;
    
    public List<Music> findAll() {
        return musicRepository.findAll();
    }
   
}
