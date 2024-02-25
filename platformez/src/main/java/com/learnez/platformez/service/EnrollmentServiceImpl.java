package com.learnez.platformez.service;

import com.learnez.platformez.model.Enrollment;
import com.learnez.platformez.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{
    @Autowired
    EnrollmentRepository enrRepo;

    @Override
    public List<Enrollment> getAllEnrollment() {
        return enrRepo.findAll();
    }

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrRepo.save(enrollment);
    }

    @Override
    public Enrollment updateEnrollment(Enrollment enrollment) {
        return enrRepo.save(enrollment);
    }

    @Override
    public void deleteEnrollment(Long id) {
        enrRepo.deleteById(id);
    }
}
