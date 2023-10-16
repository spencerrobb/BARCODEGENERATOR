package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private String userId;
    @Column(name = "First_Name",nullable = false)
    private String firstName;
    @Column(name = "Middle_Name",nullable = false)
    private String middleName;
    @Column(name = "Last_Name",nullable = false)
    private String lastName;
    @Column(name = "User_Name",nullable = false)
    private String username;
    @Column(name = "User_Email",nullable = false)
    private String email;
    @Column(name = "Pswd",nullable = false)
    private String password;
    @Column(name = "Points_Earned",nullable = false)
    private double pointsEarned;
    @Column(name= "Role",nullable = false)
    private String role;
    @Column(name="For_Approval",nullable = false)
    private String forAproval;
    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Date createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(nullable = false)
    private String fullName;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public User setFullName(String fullName){
        this.fullName = fullName;
        return this;
    }

    public User setPassword(String password){
        this.password=password;
        return this;
    }

    public User setEmail(String email){
        this.email = email;
        return this;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
