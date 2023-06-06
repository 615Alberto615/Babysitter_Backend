package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.FavoriteDto;
import com.softbabysi.demo.dao.FavoriteDao;
import com.softbabysi.demo.dao.FavoriteRepository;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Favorite;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavoriteBl {
    /*@Autowired
    private FavoriteDao favoriteDao;

    public List<FavoriteDto> getAllFavorite(){
        List<Favorite> favorites=favoriteDao.getAllFavorite();

        List<FavoriteDto> res= new ArrayList<>();
        favorites.forEach(favorite -> {
            res.add(new FavoriteDto(favorite.getFavoriteId(),favorite.getTutor().getTutorId(),
                    favorite.getBabysitter().getBabysitterId()));
        });
        return res;
    }*/

    @Autowired
    private FavoriteRepository favoriteRepository;

    //Crear un favorito
    public FavoriteDto createFavorite(FavoriteDto favoriteDto){
        Favorite favorite = new Favorite();
        Tutor tutor = new Tutor();
        Babysitter babysitter = new Babysitter();
        tutor.setTutorId(favoriteDto.getTutorId());
        favorite.setTutor(tutor);
        babysitter.setBabysitterId(favoriteDto.getBabysitterId());
        favorite.setBabysitter(babysitter);
        favoriteRepository.save(favorite);
        return favoriteDto;
    }

    //Buscar todos los favoritos por id de tutor
    public List<Favorite> getAllFavoriteByTutorId(Integer tutorId){
        List<Favorite> favorites = favoriteRepository.findFavoriteByTutorId(tutorId);
        return favorites;
    }
}
