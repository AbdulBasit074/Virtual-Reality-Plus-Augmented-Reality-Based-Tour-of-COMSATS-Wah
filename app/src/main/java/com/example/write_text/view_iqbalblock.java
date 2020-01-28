package com.example.write_text;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class view_iqbalblock extends AppCompatActivity implements SensorEventListener {
    SensorManager sm;
    Boolean test1 = false;
    boolean rotate = false;
    public VrPanoramaView mVrPanoramaView1;

    IMAGE_DETAIL next_image = null;


    public Sensor sensor;
    boolean set = false;
    public SensorManager sensorManager;
    int backward_Boundry;

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


    Sensor acceleometer, gyro, magno;
    int Degress;
    int azimuthFinalDegress;
    float azimuthFinalRadian;

    int Head_Position;
    int left_bound, right_bound, front_bound;

    Boolean BLOCK;
    IQBALBLOCK ROTATE;
    String SET_LOCATION;
    String imagepath;
    VrPanoramaView.Options ioptionsfor = new VrPanoramaView.Options();


    IMAGE_DETAIL image_detail;
    boolean turn = false;
    /////////////////////////AUGMENTED /////////////////////////////////////////////////////////////
    Boolean AR_ACTIVE = false;
    ///////////////////////////////////////////////////////////////////
    Bundle data;


    APPLY_AUGMENTED_REALITY AR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SENSOR_CONTROL();
        setContentView(R.layout.activity_view_civil);

        data = getIntent().getExtras();
        Sensor found = SensorControl();//Sensor Control
        if (found != null) {

            AR_PHASE();

            ADJUSTMENT();
            ROTATE = new IQBALBLOCK(getApplicationContext());

        } else {
            Toast.makeText(getApplicationContext(), "IMU NOT SUPPORTED DEVICE", Toast.LENGTH_LONG).show();

        }
    }

    private void AR_PHASE() {

        AR = new APPLY_AUGMENTED_REALITY(getApplicationContext());
        boolean sd = AR.SET_AR_FILE_PATH("//storage//9887-2D8C//VrVideo//IQBALBLOCK//quiadblock.txt");

        if (sd) {
            AR_ACTIVE = true;
        } else {
            AR_ACTIVE = false;
            Toast.makeText(getApplicationContext(), "CHECK: AR FILE NOT FOUND", Toast.LENGTH_LONG).show();

        }

    }

    private void ADJUSTMENT() {

        BLOCK = data.getBoolean("BLOCK");
        SET_LOCATION = imagepath = data.getString("LOCATION");
        Head_Position = data.getInt("DIRECTION");
        Initview();


    }

    private void SHOW_IMAGE_PROCEDURE() {


        azimuthFinalDegress = Degress;
        image_detail = ROTATE.forward_path.get("FRONT_BBA_MAIN.jpeg");
        ROTATE.forward = true;
        turn = true;
        IMAGE_CHANGE(image_detail.image_path + image_detail.name);


    }


    private void SENSOR_CONTROL() {
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        //////////////////////////////////////////////////////////////////////////////
        acceleometer = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this, acceleometer, SensorManager.SENSOR_DELAY_NORMAL);
        gyro = sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        sm.registerListener(this, gyro, SensorManager.SENSOR_DELAY_NORMAL);
        magno = sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        sm.registerListener(this, magno, SensorManager.SENSOR_STATUS_ACCURACY_HIGH);
        //////////////////////////////////////////////////////////////////////////////
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mMagnetometer = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
    }


    public void Initview() {
        mVrPanoramaView1 = findViewById(R.id.pano_view);
    }

    /////////////////////////////////////Sensor Control///////////////////////////////////////////////////
    public Sensor SensorControl() {
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        return sensor;
    }

    ///////////////////////////-----END----------///////////////////////////////////////////////////

    ///////////////////////////-----IMU SENSOR PHASE------//////////////////////////////////////////////
    @Override
    public void onSensorChanged(SensorEvent event) {

        if (event.sensor == mAccelerometer) {

            System.arraycopy(event.values, 0, mLastAccelerometer, 0, event.values.length);
            mLastAccelerometerSet = true;
        } else if (event.sensor == mMagnetometer) {
            System.arraycopy(event.values, 0, mLastMagnetometer, 0, event.values.length);
            mLastMagnetometerSet = true;

        }
        if (mLastAccelerometerSet && mLastMagnetometerSet) {
            SensorManager.getRotationMatrix(mR, null, mLastAccelerometer, mLastMagnetometer);
            SensorManager.getOrientation(mR, mOrientation);
            float azimuthInRadians = mOrientation[0];
            azimuthFinalRadian = azimuthInRadians;
            Float azimuthInDegress = (float) (Math.toDegrees(azimuthInRadians) + 360) % 360;
            Degress = Math.round(azimuthInDegress);
            if (!set && Degress != 0)
            {
                set = true;
                SHOW_IMAGE_PROCEDURE();
            }
            mCurrentDegree = -azimuthInDegress;
            if (set) {
                int boundry1;
                if (azimuthFinalDegress + 180 > 360) {
                    boundry1 = azimuthFinalDegress + 180;
                    backward_Boundry = boundry1 - 360;
                } else {
                    backward_Boundry = azimuthFinalDegress + 180;
                }
                if (Degress > backward_Boundry - 10 && Degress < backward_Boundry + 10) {
                    azimuthFinalDegress = Degress;

                    if (ROTATE.forward) {
                        ROTATE.forward = false;

                    } else if (!ROTATE.forward) {
                        ROTATE.forward = true;
                    }
                    Toast.makeText(getApplicationContext(), "ROTATE", Toast.LENGTH_LONG).show();

                    //  MOVE(image_detail);

                }

            }

        }
        if (event.sensor == mAccelerometer && set) {
            next_image = null;
            int boundr1;
            front_bound = azimuthFinalDegress;

            if (azimuthFinalDegress + 80 > 360) {
                boundr1 = azimuthFinalDegress + 80;
                right_bound = boundr1 - 360;
            }
            else
            {
                right_bound = azimuthFinalDegress + 80;
            }
            if (azimuthFinalDegress - 80 < 0) {
                boundr1 = azimuthFinalDegress - 80;
                left_bound = 360 + boundr1;
            }
            else
            {
                left_bound = azimuthFinalDegress - 80;
            }

            if (event.values[0] > 3 && event.values[2] < 2) {

                if (ROTATE.forward) {

                    if (image_detail.forwarda_path) {
                        if (Degress < front_bound + 8 && Degress > front_bound - 8) {
                            test1 = true;
                        }
                    } else if (image_detail.forward_left_Any_path) {

                        if (Degress < left_bound + 8 && Degress > left_bound - 8) {
                            test1 = true;

                        }

                    } else if (image_detail.forward_right_Any_path) {

                        if (Degress < right_bound + 8 && Degress > right_bound - 8) {
                            test1 = true;
                        }

                    }
                }
                if (!ROTATE.forward) {

                    if (image_detail.backward_path) {
                        if (Degress < front_bound + 8 && Degress > front_bound - 8) {
                            test1 = true;
                        }
                    }
                    if (image_detail.backward_left_Any_path) {

                        if (Degress < left_bound + 8 && Degress > left_bound - 8) {
                            test1 = true;
                        }

                    }
                    if (image_detail.backward_right_Any_path) {
                        if (Degress < right_bound + 8 && Degress > right_bound - 8) {
                            test1 = true;
                        }
                    }
                }

            }
            if (event.values[2] > 1 && event.values[0] < 7) {

                if (ROTATE.forward) {


                    if (image_detail.forwarda_path) {
                        if (Degress < front_bound + 8 && Degress > front_bound - 8) {
                            if (test1) {

                                test1 = false;
                                azimuthFinalDegress = Degress;
                                next_image = ROTATE.forward_path.get(image_detail.forward_image);
                                if (ROTATE.Is_joint_path_active)
                                {
                                    if (ON_JOINT(next_image, image_detail))
                                    {
                                        turn = image_detail.forwarda_tog;

                                    }
                                    else
                                        {

                                        image_detail = next_image;
                                        turn = image_detail.forwarda_tog;
                                    }

                                } else {
                                    IS_ANY_JOINT(next_image, image_detail);
                                    image_detail = ROTATE.forward_path.get(image_detail.forward_image);
                                }
                                MOVE(image_detail);
                            }
                        }
                    }
                    if (image_detail.forward_left_Any_path) {
                        if (Degress < left_bound + 8 && Degress > left_bound - 8) {
                            if (test1) {
                                azimuthFinalDegress = Degress;
                                test1 = false;
                                next_image = ROTATE.forward_path.get(image_detail.forward_left_image);

                                if (ROTATE.Is_joint_path_active) {
                                    if (ON_JOINT(next_image, image_detail)) {
                                        turn = image_detail.forwarda_tog;
                                    } else {
                                        image_detail = next_image;
                                        turn = image_detail.forwarda_tog;
                                    }

                                } else {
                                    IS_ANY_JOINT(next_image, image_detail);
                                    image_detail = ROTATE.forward_path.get(image_detail.forward_left_image);
                                }

                                MOVE(image_detail);

                            }
                        }
                    }
                    if (image_detail.forward_right_Any_path) {
                        if (Degress < right_bound + 8 && Degress > right_bound - 8) {

                            if (test1) {

                                azimuthFinalDegress = Degress;
                                test1 = false;
                                next_image = ROTATE.forward_path.get(image_detail.forward_right_image);
                                if (ROTATE.Is_joint_path_active) {
                                    if (ON_JOINT(next_image, image_detail)) {
                                        turn = image_detail.forwarda_tog;
                                    } else {
                                        image_detail = next_image;
                                        turn = image_detail.forwarda_tog;
                                    }

                                } else {
                                    IS_ANY_JOINT(next_image, image_detail);
                                    image_detail = ROTATE.forward_path.get(image_detail.forward_right_image);
                                    turn = image_detail.forwarda_tog;
                                }

                                MOVE(image_detail);

                            }
                        }
                    }

                }
                if (!ROTATE.forward) {

                    if (image_detail.backward_path) {
                        if (Degress < front_bound + 8 && Degress > front_bound - 8) {
                            if (test1) {
                                test1 = false;
                                azimuthFinalDegress = Degress;
                                next_image = ROTATE.forward_path.get(image_detail.backward_image);
                                if (ROTATE.Is_joint_path_active) {
                                    if (ON_JOINT(next_image, image_detail)) {
                                        turn = image_detail.backward_tog;

                                    } else {
                                        image_detail = next_image;
                                        turn = image_detail.backward_tog;
                                    }
                                } else {
                                    IS_ANY_JOINT(next_image, image_detail);
                                    image_detail = ROTATE.forward_path.get(image_detail.backward_image);
                                    turn = image_detail.backward_tog;
                                }

                                MOVE(image_detail);
                            }
                        }
                    } else if (image_detail.backward_left_Any_path) {
                        if (Degress < left_bound + 8 && Degress > left_bound - 8) {
                            if (test1) {
                                test1 = false;
                                azimuthFinalDegress = Degress;

                                next_image = ROTATE.forward_path.get(image_detail.backward_left_image);
                                if (ROTATE.Is_joint_path_active) {
                                    if (ON_JOINT(next_image, image_detail))
                                    {
                                        turn = image_detail.backward_tog;
                                    }
                                    else
                                    {
                                        image_detail = next_image;
                                        turn = image_detail.backward_tog;
                                    }
                                } else {
                                    IS_ANY_JOINT(next_image, image_detail);
                                    image_detail = ROTATE.forward_path.get(image_detail.backward_left_image);
                                    turn = image_detail.backward_tog;
                                }
                                MOVE(image_detail);
                            }
                        }
                    } else if (image_detail.backward_right_Any_path) {
                        if (Degress < right_bound + 8 && Degress > right_bound - 8) {
                            if (test1) {
                                test1 = false;
                                azimuthFinalDegress = Degress;
                                next_image = ROTATE.forward_path.get(image_detail.backward_right_image);
                                if (ROTATE.Is_joint_path_active)
                                {
                                    if (ON_JOINT(next_image, image_detail)) {
                                        turn = image_detail.backward_tog;
                                    } else {
                                        image_detail = next_image;
                                        turn = image_detail.backward_tog;
                                    }
                                } else {
                                    IS_ANY_JOINT(next_image, image_detail);
                                    image_detail = ROTATE.forward_path.get(image_detail.backward_right_image);
                                    turn = image_detail.backward_tog;
                                }

                                MOVE(image_detail);
                            }
                        }
                    }
                }
            }
            if (Degress > azimuthFinalDegress + 3 && Degress < azimuthFinalDegress - 3) {
                if (test1) {
                    test1 = false;
                }
            }

        }
    }


    private void MOVE(IMAGE_DETAIL image_det) {
        image_detail = image_det;
        //rotate = false ;

        if (image_detail != null) {
            String par = image_detail.image_path + image_detail.name;
            IMAGE_CHANGE(par);
        }


    }

    private void IMAGE_CHANGE(String imagepath) { // bit = null;

        Bitmap bitmap12 = null;

        if (AR_ACTIVE) {
            bitmap12 = AR.APPLY_AUGMENTED(imagepath);

            if (bitmap12 != null) {
                ImageViewer(bitmap12);
            } else {
                bitmap12 = BitmapFactory.decodeFile(imagepath);
                ImageViewer(bitmap12);
            }
        } else {

            bitmap12 = BitmapFactory.decodeFile(imagepath);
            ImageViewer(bitmap12);
        }

    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    public void ImageViewer(Bitmap bitmap) {
        turn = true;
        if (turn) {
            mVrPanoramaView1.pauseRendering();
            ioptionsfor.inputType = VrPanoramaView.Options.TYPE_MONO;
            mVrPanoramaView1.loadImageFromBitmap(bitmap, ioptionsfor);
            mVrPanoramaView1.resumeRendering();
            turn = false;
        } else {
            ioptionsfor.inputType = VrPanoramaView.Options.TYPE_MONO;
            mVrPanoramaView1.loadImageFromBitmap(bitmap, ioptionsfor);
        }
        azimuthFinalDegress = Degress;
    }

    @Override
    public void onPause() {
        mVrPanoramaView1.pauseRendering();


        super.onPause();
    }

    @Override
    public void onResume() {
        mVrPanoramaView1.resumeRendering();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        // Destroy the widget and free memory.
        mVrPanoramaView1.shutdown();
        super.onDestroy();
    }


    public boolean IS_ANY_JOINT(IMAGE_DETAIL next, IMAGE_DETAIL current) {

        if (ROTATE.path_joint.containsKey(current.name)) {

            if (ROTATE.path_joint.get(current.name).equals(next.name)) {

                ROTATE.joint_forward = ROTATE.forward;
                ROTATE.forward = true;
                ROTATE.Is_joint_path_active = true;

            }

        }


        return false;

    }

    private boolean ON_JOINT(IMAGE_DETAIL nexti, IMAGE_DETAIL current) {

        if (ROTATE.path_joint_out.containsKey(current.name))
        {

            if (ROTATE.path_joint_out.get(current.name).equals(nexti.name))
            {

                ROTATE.forward = ROTATE.joint_forward;
                String next_name = ROTATE.path_on_joint__images.get(nexti.name + ROTATE.joint_forward);
                image_detail = ROTATE.forward_path.get(next_name);
                ROTATE.Is_joint_path_active = false;
                return true;
            } else {
                return false;
            }

        }

        return false;
    }


}


