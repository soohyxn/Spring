package com.sparta.week01.prac;

public class Prac {
    public static void main(String[] args) {
        Course course = new Course();
        course.title = "웹개발의 봄, Spring";
        System.out.println(course.title);
        System.out.println(course.tutor);

        Course course2 = new Course("웹개발의 봄 스프링", "남병관", 35);
        System.out.println(course2.title);
        System.out.println(course2.tutor);
        System.out.println(course2.days);

        Course course3 = new Course();

        System.out.println(course3.getTitle());
        System.out.println(course3.getTutor());
        System.out.println(course3.getDays());

        course3.setTitle("웹개발의 봄 스프링");
        course3.setTutor("남병관");
        course3.setDays(35);

        System.out.println(course3.getTitle());
        System.out.println(course3.getTutor());
        System.out.println(course3.getDays());
    }
}
