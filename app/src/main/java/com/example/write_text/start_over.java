package com.example.write_text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;



public class start_over extends AppCompatActivity {
    Button gt,mall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start_over);
        gt=findViewById(R.id.mall);
        mall =findViewById(R.id.gt);
        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start1 = new Intent(getApplicationContext(),view.class);
                Bundle b = new Bundle();
                b.putString("LOCATION","MALL");
                start1.putExtras(b);
                startActivity(start1);

            }
        });
        mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2 = new Intent(getApplicationContext(),view.class);
                Bundle b = new Bundle();
                b.putString("LOCATION","GT");
                start2.putExtras(b);
                startActivity(start2);

            }
        });



    }
}
