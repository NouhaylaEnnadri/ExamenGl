package com.example.examengl.dao;

import com.example.examengl.beans.User;

import java.util.List;

public interface UserDao {

    User get(String login);
    User insert(User task);
    List<User> getAll();
}

