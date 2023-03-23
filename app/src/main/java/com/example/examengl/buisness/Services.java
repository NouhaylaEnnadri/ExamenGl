package com.example.examengl.buisness;

import com.example.examengl.beans.User;

public interface Services {
    User Login(String login, String password);
    User Register(String name,Long phone , String email ,  String password1 , String password2);

}
