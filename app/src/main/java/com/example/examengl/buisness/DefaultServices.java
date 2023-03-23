package com.example.examengl.buisness;

import com.example.examengl.beans.User;
import com.example.examengl.dao.UserDao;

public class DefaultServices implements Services{

    private UserDao userDao;
    private static DefaultServices instance;
    public static DefaultServices getInstance(UserDao userDao) {
        if (instance == null)
            instance = new DefaultServices(userDao);
        return instance;
    }
    private DefaultServices(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public User Login(String login, String password) {
        return null;
    }

    @Override
    public User Register(String name, Long phone, String email, String password1, String password2) {
        return null;
    }
}
