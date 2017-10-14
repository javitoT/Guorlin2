package com.example.javiertorres.guorlin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.javiertorres.guorlin.R.id.activity_main;

/**
 * Created by javiertorres on 10/9/17.
 */

public class news extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);

    }

    public void gotomenu (View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
