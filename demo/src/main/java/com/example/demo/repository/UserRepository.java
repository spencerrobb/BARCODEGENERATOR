package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUserId(long userid);

    @Query(
            value="select * from tbl_users where user_id = ?1 AND password = ?2",
            nativeQuery = true)
    User authenticateUser(long userid, String password);

    public Optional<User> findByEmail(String email);
}
