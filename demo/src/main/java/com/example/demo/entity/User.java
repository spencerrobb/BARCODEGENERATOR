package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String userId;
    @Column(name = "First_Name")
    String firstName;
    @Column(name = "Middle_Name")
    String middleName;
    @Column(name = "Last_Name")
    String lastName;
    @Column(name = "User_Name")
    String username;
    @Column(name = "User_Email")
    String userEmail;
    @Column(name = "Pswd")
    String password;
    @Column(name = "Points_Earned")
    double pointsEarned;
}
