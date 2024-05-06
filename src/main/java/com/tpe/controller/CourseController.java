package com.tpe.controller;

import com.tpe.domain.Course;
import com.tpe.service.CourseService;
import com.tpe.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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

    //Submit Button / Save Course
    public String createCourse(@ModelAttribute("courses")Course course, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "courseForm";
        service.saveCourse(course);
        return "redirect:/courses"; //redirecting all courses page
    }


}
