package com.sparta.week06.repository;

import com.sparta.week06.model.User;
import com.sparta.week06.model.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {
    UserTime findByUser(User user);
}