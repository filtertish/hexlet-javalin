package org.example.hexlet;

public class NamedRoutes {
    public static String helloRoute() {
        return "/hello";
    }

    public static String usersRoute() {
        return "/users";
    }

    public static String buildUsersRoot() {
        return "/users/build";
    }

    public static String coursesRoot() {
        return "/courses";
    }

    public static String coursesRoot(Long id) {
        return "/courses/" + id;
    }
}
