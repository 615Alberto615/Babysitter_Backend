package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    //todos los favoritos de un usuario por tutor
    @Query("SELECT i FROM Favorite i WHERE i.tutor.tutorId = ?1")
    public List<Favorite> findFavoriteByTutorId(Integer id);
}
