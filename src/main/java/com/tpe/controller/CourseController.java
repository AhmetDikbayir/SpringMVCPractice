package com.tpe.controller;

import com.tpe.domain.Course;
import com.tpe.service.CourseService;
import com.tpe.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")//courses requests is mapping with this controller
public class CourseController {

    @Autowired
    private CourseService service;

    //Display Form
    @GetMapping("/form")//
    public String displayCourseForm(@ModelAttribute("course")Course course){
        return "courseForm";
    }


}
