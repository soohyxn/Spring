package com.sparta.week02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // lombok이 getter 자동 생성
@NoArgsConstructor // 기본생성자를 대신 생성
@Entity // 그냥 클래스 아니고 DB의 테이블 역할을 하는 클래스라는 것을 알려줌
public class Course extends Timestamped{

    @Id // ID 값, Primary Key로 사용하겠다는 의미
    @GeneratedValue(strategy = GenerationType.AUTO) // id 생성시 자동으로 증가해줌
    private Long id;

    @Column(nullable = false) // = not null, 컬럼 값이 null이 아니고 반드시 값이 존재해야 함을 나타냅니다.
    private String title;

    @Column(nullable = false)
    private String tutor;

    public Course(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }

    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }

    public void update(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }
}