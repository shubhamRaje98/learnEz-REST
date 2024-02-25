package com.learnez.platformez.controller;

import com.learnez.platformez.model.Enrollment;
import com.learnez.platformez.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrService;
    @GetMapping("/enrollments")
    public List<Enrollment> getAllEnrollment()
    {
        return enrService.getAllEnrollment();
    }
    @PostMapping("/add-enrollment")
    public Enrollment saveCourse(@RequestBody Enrollment enrollment)
    {
        System.out.println("Adding new course: "+enrollment.getId());
        return enrService.saveEnrollment(enrollment);
    }
    @PutMapping("/update-enrollment")
    public Enrollment updateEmployee(@RequestBody Enrollment enrollment) {
        return enrService.updateEnrollment(enrollment);
    }
    @DeleteMapping("/delete-enrollment/{id}")
    public String deleteCourse(@PathVariable Long id) {
        enrService.deleteEnrollment(id);
        return "Record deleted successfully";
    }
}
