package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ReportBabysitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReportBabysitterRepository extends JpaRepository<ReportBabysitter, Long> {
    //obtener por id de tutor
    @Query("SELECT r FROM ReportBabysitter r WHERE r.tutor.tutorId = ?1")
    List<ReportBabysitter> getReportBabysitterByTutorId(Integer tutorId);
}
