package com.example.examengl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    Button login ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login.setOnClickListener(view->{
            Intent intent= new Intent(this,LoginActivity.class);
            startActivity(intent);
        });

    }
}

