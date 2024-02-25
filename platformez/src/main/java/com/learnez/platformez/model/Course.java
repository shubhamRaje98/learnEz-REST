package com.learnez.platformez.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_course")
public class Course {
    @Id
    @GeneratedValue
    @Column(name="course_id")
    private Long id;

    @Column(name="course_title")
    private String title;

    @Column(name="course_desc")
    private String description;

    @Column(name="course_author")
    private String author;
}
