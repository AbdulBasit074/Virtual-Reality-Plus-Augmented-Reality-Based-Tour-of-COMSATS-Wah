package com.example.write_text;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IMU extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private Sensor mMagnetometer;
    private float[] mLastAccelerometer = new float[3];
    private float[] mLastMagnetometer = new float[3];
    private boolean mLastAccelerometerSet = false;
    private boolean mLastMagnetometerSet = false;
    private float[] mR = new float[9];
    private float[] mOrientation = new float[3];
    private float mCurrentDegree = 0f;

    Sensor acceleometer,gyro,magno;

    SensorManager sm;

    TextView textget,txt3 ;
    boolean val1=false,val2=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imu);
        textget = findViewById(R.id.txt);
        txt3 = findViewById(R.id.txt2);
        ///////////////////////////////ACCELEMETER////////////////////////////////////
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        //////////////////////////////////////////////////////////////////////////////
        acceleometer = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this,acceleometer,SensorManager.SENSOR_DELAY_NORMAL);
        gyro = sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        sm.registerListener(this,gyro,SensorManager.SENSOR_DELAY_NORMAL);
        magno = sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        sm.registerListener(this,magno,SensorManager.SENSOR_STATUS_ACCURACY_HIGH);
        //////////////////////////////////////////////////////////////////////////////

        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mMagnetometer = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);


    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {

    if (event.sensor == mAccelerometer)
    {
        System.arraycopy(event.values, 0, mLastAccelerometer, 0, event.values.length);
        textget.setText("\nX:   " + Math.round(event.values[0]) +
                "\nY:   " +  Math.round(event.values[1]) +
                "\nZ:   " +  Math.round(event.values[2]));

        mLastAccelerometerSet = true;
    }
    else if (event.sensor == mMagnetometer)
    {
        System.arraycopy(event.values, 0, mLastMagnetometer, 0, event.values.length);
        mLastMagnetometerSet = true;
    }
        if (mLastAccelerometerSet && mLastMagnetometerSet) {
            SensorManager.getRotationMatrix(mR, null, mLastAccelerometer, mLastMagnetometer);
            SensorManager.getOrientation(mR, mOrientation);
            float azimuthInRadians = mOrientation[0];
            float azimuthInDegress = (float)(Math.toDegrees(azimuthInRadians)+360)%360;
//            textget.setText(Float.toString(azimuthInDegress));
            mCurrentDegree = -azimuthInDegress;
        }


    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
