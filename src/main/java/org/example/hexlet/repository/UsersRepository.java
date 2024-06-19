package org.example.hexlet.repository;

import org.example.hexlet.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    private final List<User> users = new ArrayList<>();
    private long id = 1;

    public List<User> getUsers() {
        return users;
    }

    public void addUser(String username, String email, String password) {
        users.add(new User(id, username, email, password));
        id += 1;
    }
}
