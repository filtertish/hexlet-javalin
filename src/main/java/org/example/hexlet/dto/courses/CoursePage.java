package org.example.hexlet.dto.courses;

import org.example.hexlet.model.Course;

import java.util.List;

public class CoursePage {
    private final List<Course> courses;
    private final String header;

    public CoursePage(List<Course> course, String header) {
        this.courses = course;
        this.header = header;
    }

    public CoursePage(String header) {
        this.courses = List.of(
                new Course(1, "Java", "Backend"),
                new Course(2, "Typescript", "Frontend"),
                new Course(3, "Postgres", "Database")
        );
        this.header = header;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getHeader() {
        return header;
    }
}
