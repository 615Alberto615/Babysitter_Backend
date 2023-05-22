package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Child;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
}
