package org.example.hexlet.dto.courses;

import org.example.hexlet.model.Course;

import java.util.List;

public class CoursePage {
    private final List<Course> courses;
    private final String header;
    private final String term;

    public CoursePage(List<Course> courses, String header, String term) {
        this.courses = courses;
        this.header = header;
        this.term = term;
    }

    public CoursePage(String header) {
        this.courses = List.of(
                new Course(1, "Java", "Backend"),
                new Course(2, "Typescript", "Frontend"),
                new Course(3, "Postgres", "Database")
        );
        this.header = header;
        term = null;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getHeader() {
        return header;
    }

    public String getTerm() {
        return term;
    }
}
