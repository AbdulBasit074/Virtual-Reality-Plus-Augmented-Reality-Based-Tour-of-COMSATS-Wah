package com.example.write_text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class mainpage extends AppCompatActivity{

    Button location;
    ImageView view_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_mainpage);
        location = findViewById(R.id.location);
        view_logo = findViewById(R.id.view_log);
        Glide.with(getApplicationContext()).load(R.drawable.gifilogo).into(view_logo);


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start1 = new Intent(getApplicationContext(), locationSelect.class);
                startActivity(start1);
            }
        });
    }
}
