package org.example.hexlet.repository;

import org.example.hexlet.model.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    private static final List<User> users = new ArrayList<>();
    private static long id = 1;

    public static List<User> getUsers() {
        return users;
    }

    public static void addUser(String username, String email, String password) {
        users.add(new User(id, username, email, password));
        id += 1;
    }
}
