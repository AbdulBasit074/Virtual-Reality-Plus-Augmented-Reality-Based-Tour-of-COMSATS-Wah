package com.example.write_text;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.karan.churi.PermissionManager.PermissionManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    PermissionManager permissionManager;
    Button strt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

            setContentView(R.layout.activity_main);
            permissionManager = new PermissionManager() {};
            permissionManager.checkAndRequestPermissions(this);


            strt =  findViewById(R.id.str);
            strt.setOnClickListener(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        permissionManager.checkResult(requestCode,permissions,grantResults);
    }
    @Override
    public void onClick(View v) {
        Intent start = new Intent(getApplicationContext(),mainpage.class);
        startActivity(start);
        finish();
    }
}
