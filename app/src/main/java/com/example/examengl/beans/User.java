package com.example.examengl.beans;

public class User {
    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    private String login;
    private String pwd;

    private String name;
    private long phone ;
    public User(String login, String pwd, String name , long phone) {
        this.login = login;
        this.pwd = pwd;
        this.name = name;
        this.phone = phone ;
    }


}
