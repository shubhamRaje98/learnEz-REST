package com.learnez.platformez.service;

import com.learnez.platformez.model.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();
    public Course saveCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(Long id);
}
