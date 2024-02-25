package com.learnez.platformez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_enrollment")
public class Enrollment {
    @Id
    @GeneratedValue
    @Column(name = "enrollment_id")
    public Long id;
//enr_id, usr id, course id, progress
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="course_id")
    private Course course;

    @Column(name = "progress")
    private int progress;
}