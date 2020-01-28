package com.example.write_text;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class locationSelect extends AppCompatActivity {

    private ListView Grid_image;
    List<String> FILE_NAME;
    List<Integer> FILE_IMAGE;
    Request_List_adobter adb;


    public String [] FIELD_NAME_INDEX ={"CIVIALBLOCK","CSFACULTY",
            "QUIADBLOCK","IQBALBLOCK","STUDYHALL"
    };
    public int [] BLOCK_DIRECTION ={290,290,0,0,0};


    private int [] IMAGES ={R.drawable.seveal,R.drawable.csfaculty
            ,R.drawable.quid,R.drawable.quid,R.drawable.study};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_location_select);
                FILE_NAME = new ArrayList<>();
                FILE_NAME.add("CIVIL BLOCK");
                FILE_NAME.add("CS FACULTY");
                FILE_NAME.add("QUIAD BLOCK");
                FILE_NAME.add("IQBAL BLOCK");
                FILE_NAME.add("STUDY HALL");


        //////////////////////////////

                Grid_image = findViewById(R.id.grid);

                 adb = new Request_List_adobter(getApplicationContext(),FILE_NAME,IMAGES);

                Grid_image.setAdapter(adb);

                Grid_image.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {

                        Intent intent = null;
                        switch (position)
                        {
                            case 0:
                                intent = new Intent(getBaseContext(), view_civil.class);
                                break;
                            case 1:
                                intent = new Intent(getBaseContext(), view.class);
                                break;
                            case 2:
                                intent = new Intent(getBaseContext(), view_quidblock.class);
                                break;
                            case 3:
                                intent = new Intent(getBaseContext(), view_iqbalblock.class);
                                break;
                            case 4:
                                intent = new Intent(getBaseContext(), view_studyhall.class);
                                break;
                        }
                        Bundle b = new Bundle();
                        b.putString("LOCATION", FIELD_NAME_INDEX[position]);
                        b.putInt("DIRECTION", BLOCK_DIRECTION[position]);
                        b.putBoolean("BLOCK", true);
                        intent.putExtras(b);
                        startActivity(intent);
                    }
                });
    }
}

