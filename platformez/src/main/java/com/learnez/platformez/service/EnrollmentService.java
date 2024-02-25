package com.learnez.platformez.service;

import com.learnez.platformez.model.Enrollment;
import java.util.List;


public interface EnrollmentService {
    public List<Enrollment> getAllEnrollment();
    public Enrollment saveEnrollment(Enrollment enrollment);
    public Enrollment updateEnrollment(Enrollment enrollment);
    public void deleteEnrollment(Long id);
}
