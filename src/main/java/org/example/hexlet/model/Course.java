package org.example.hexlet.model;

public record Course(long id, String name, String description) {

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", username='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
