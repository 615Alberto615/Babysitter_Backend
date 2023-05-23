package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Booking;
import com.softbabysi.demo.entity.ReportTutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportTutorRepository extends JpaRepository<ReportTutor, Long> {
}
