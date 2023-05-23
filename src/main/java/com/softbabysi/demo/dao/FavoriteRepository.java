package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}
