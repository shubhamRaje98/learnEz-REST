package com.learnez.platformez.controller;

import com.learnez.platformez.model.Course;
import com.learnez.platformez.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getAllCourses()
    {
        return courseService.getAllCourses();
    }
    @PostMapping("/add-course")
    public Course saveCourse(@RequestBody Course course)
    {
        System.out.println("Adding new course: "+course.getTitle());
        return courseService.saveCourse(course);
    }
    @PutMapping("/update-course")
    public Course updateEmployee(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }
    @DeleteMapping("/delete-course/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return "Record deleted successfully";
    }
}
