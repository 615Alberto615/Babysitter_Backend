package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteDao {
    @Autowired
    private FavoriteRepository favoriteRepository;

    public List<Favorite> getAllFavorite(){
        return favoriteRepository.findAll();
    }
}
