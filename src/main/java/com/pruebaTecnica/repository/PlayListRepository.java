package com.pruebaTecnica.repository;

import com.pruebaTecnica.model.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayListRepository extends JpaRepository<PlayList, Integer>{

    PlayList findPlayListByName(String name);

}
