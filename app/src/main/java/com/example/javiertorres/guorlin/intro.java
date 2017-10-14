package com.example.javiertorres.guorlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void gotointro (View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
