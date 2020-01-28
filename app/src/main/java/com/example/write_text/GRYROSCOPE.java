package com.example.write_text;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class GRYROSCOPE extends AppCompatActivity implements SensorEventListener {

    SensorManager sm1;

    Sensor val;

    boolean val1=false , val2=false;


    TextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gryroscope);
        text = findViewById(R.id.txtcheck);

        sm1 = (SensorManager) getSystemService(SENSOR_SERVICE);
        val = sm1.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        if(val!=null)
        sm1.registerListener(this,val,SensorManager.SENSOR_DELAY_NORMAL);
        else
            text.setText("YOU DONT HAVE GYROSCOPE");
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        float a  = (float) event.values[0];
        float b = (float) event.values[1];
        float c = (float) event.values[2];
        text.setText("\nX:" + a + "\nY:" + b + "\nZ:" + c);

        if(event.values[0]>6)
        {

        }
        if(event.values[2]<-4)
        {
                val1 = true;
        }
        if(event.values[2]>7)
        {

                if(val1)
                {
                    Toast.makeText(getApplicationContext(),"Shift",Toast.LENGTH_LONG).show();

                }
                val1 = false;
        }

    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
