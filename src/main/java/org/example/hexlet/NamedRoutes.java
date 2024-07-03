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

    public static String sessionsRoot() {
        return "/sessions";
    }

    public static String buildSessionsRoot() {
        return "/sessions/build";
    }

    public static String carsRoot() {
        return "/cars";
    }

    public static String showCarsRoot(Long id) {
        return "/cars/" + id;
    }

    public static String showCarsRoot(String id) {
        return "/cars/" + id;
    }

    public static String buildCarsRoot() {
        return "/cars/build";
    }
}
