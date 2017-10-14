package com.example.javiertorres.guorlin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotonews (View view){

        Intent intent = new Intent(this, news.class);
        startActivity(intent);

    }

    public void gotoexp (View view){

        Intent intent = new Intent(this, exp.class);
        startActivity(intent);

    }

    public void gotocontacts (View view){

        Intent intent = new Intent(this, contacts.class);
        startActivity(intent);

    }

    public void gotopass (View view){

        Intent intent = new Intent(this, pass.class);
        startActivity(intent);

    }

    public void gotoguorlin (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.guorlin.wordpress.com"));
        startActivity(intent);

    }

}

