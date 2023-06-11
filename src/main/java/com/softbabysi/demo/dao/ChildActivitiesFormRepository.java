package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ChildActivitiesForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChildActivitiesFormRepository extends JpaRepository<ChildActivitiesForm, Long> {

    //actividad por id
    @Query("SELECT c FROM ChildActivitiesForm c WHERE c.childActivitieFormId = ?1")
    ChildActivitiesForm findByChildActivitiesFormId(Integer id);

    //Todas las actividades del niño por id de niño
    @Query("SELECT c FROM ChildActivitiesForm c WHERE c.child.childId = ?1")
    List<ChildActivitiesForm> findByChildId(Integer id);
}
