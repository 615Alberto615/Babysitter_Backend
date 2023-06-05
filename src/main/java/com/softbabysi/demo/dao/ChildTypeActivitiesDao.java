package com.softbabysi.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildTypeActivitiesDao {
    @Autowired
    private ChildTypeActivitiesRepository childTypeActivitiesRepository;
}
