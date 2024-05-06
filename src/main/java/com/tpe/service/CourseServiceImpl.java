package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository repository;

    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }
}
