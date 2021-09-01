package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// DB의 sql 역할을 대신해줌
public interface CourseRepository extends JpaRepository<Course, Long> { // 사용할 클래스, id의 type
}