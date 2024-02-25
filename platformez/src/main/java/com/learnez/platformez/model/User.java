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
@Table(name="tbl_user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    public Long id;

    @Column(name = "user_name")
    public String username;

    @Column(name = "user_password")
    public String password;

    @Column(name = "user_email")
    public String email;
}
