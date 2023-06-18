package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.BabysitterAbility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BabysitterAbilityRepository extends JpaRepository<BabysitterAbility, Long> {

    // por id
    @Query("SELECT i FROM BabysitterAbility i WHERE i.babysitterAbilityId = ?1")
    BabysitterAbility findById(Integer id);

    //por id de la babysitter
    @Query("SELECT i FROM BabysitterAbility i WHERE i.babysitter.babysitterId = ?1")
    BabysitterAbility findByBabysitterId(Integer id);
}
