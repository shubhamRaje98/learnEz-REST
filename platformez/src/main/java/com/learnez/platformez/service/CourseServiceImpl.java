package com.learnez.platformez.service;

import com.learnez.platformez.model.Course;
import com.learnez.platformez.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepo;
    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
    @Override
    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

}
