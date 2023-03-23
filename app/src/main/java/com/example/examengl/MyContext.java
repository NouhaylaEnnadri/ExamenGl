package com.example.examengl;

import android.app.Application;

import com.example.examengl.buisness.DefaultServices;
import com.example.examengl.buisness.Services;
import com.example.examengl.dao.UserDaoMemory;

public class MyContext extends Application {
    private Services services ;
    @Override
    public void onCreate() {
        super.onCreate();

        services = DefaultServices.getInstance(UserDaoMemory.getInstance());
    }
    public Services getServices() {
        return services;
    }
}
