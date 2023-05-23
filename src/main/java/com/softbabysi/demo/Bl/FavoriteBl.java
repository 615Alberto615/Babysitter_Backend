package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.FavoriteDto;
import com.softbabysi.demo.dao.FavoriteDao;
import com.softbabysi.demo.entity.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavoriteBl {
    @Autowired
    private FavoriteDao favoriteDao;

    public List<FavoriteDto> getAllFavorite(){
        List<Favorite> favorites=favoriteDao.getAllFavorite();

        List<FavoriteDto> res= new ArrayList<>();
        favorites.forEach(favorite -> {
            res.add(new FavoriteDto(favorite.getFavoriteId(),favorite.getTutor().getTutorId(),
                    favorite.getBabysitter().getBabysitterId()));
        });
        return res;
    }
}
