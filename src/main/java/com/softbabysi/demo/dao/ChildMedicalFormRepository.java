package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ChildMedicalForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChildMedicalFormRepository extends JpaRepository<ChildMedicalForm, Long>{

    //Todos los registros medicos por id de niño
    @Query("select c from ChildMedicalForm c where c.child.childId = ?1")
    public ChildMedicalForm findByChildId(Integer id);
}
