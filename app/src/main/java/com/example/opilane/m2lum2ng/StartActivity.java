package com.example.opilane.m2lum2ng;

import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    Button alusta;
    EditText nimi1, nimi2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    ImageView uno, dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Animation animationl = AnimationUtils.loadAnimation(getApplicationContext()R.anim.blink);
        uno.startAnimation(animationl);
        dos.startAnimation(animationl);

        nimi1 = findViewById(R.id.mängija1);
        nimi2 = findViewById(R.id.mängija2);
        alusta = findViewById(R.id.mängi);
        sharedPreferences = getSharedPreferences("nimed", MODE_PRIVATE);
    }
}
