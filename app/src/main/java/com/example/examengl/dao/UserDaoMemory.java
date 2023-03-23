package com.example.examengl.dao;

import com.example.examengl.beans.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMemory implements UserDao {

    private List<User> users;
    private static UserDaoMemory instance;
    public static UserDao getInstance() {
        if (instance == null) {
            instance = new UserDaoMemory();
        }
        return instance;
    }
    private UserDaoMemory() {
        users = new ArrayList<>();
    }
    @Override
    public User get(String email) {
        for (User u :users)
            if(u.getLogin().equals(email))
                return u;
        return null;

    }

    @Override
    public User insert(User task) {
        users.add(task);
        return task;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
