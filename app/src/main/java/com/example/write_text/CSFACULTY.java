package com.example.write_text;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSFACULTY
{


    public Boolean forward = false;
    public Boolean backward = false;
    public HashMap<String,IMAGE_DETAIL> forward_path;

    final int TOTAL_PICS = 0;

    public Context c;

    public CSFACULTY(Context f)
    {

        c= f;
        Toast.makeText(f,"NOT SET TRY AGAIN",Toast.LENGTH_LONG).show();
        String Department_path = "/storage/9887-2D8C/VrVideo/CSFACULTY/";
        forward_path = new HashMap<>();
        IMAGE_DETAIL img = new IMAGE_DETAIL();
        img.name = "FRONT_CS_FACULTY1.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY2.jpg";
        img.backward_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY1.jpg",img);
        /////F1
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_CS_FACULTY1.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY2.jpg";
        img.backward_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CS_FACULTY1.jpeg",img);
        /////F1

        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY2.jpg";
        // img.name = "FRONT_CS_FACULTY1.jpg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY1.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_CS_FACULTY3.jpg";
        img.backward_left_Any_path = true;
        img.backward_left_image = "BACK_CS_FACULTY1.jpeg";
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY2.jpg",img);
        //////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CS_FACULTY2.jpeg";
        // img.name = "FRONT_CS_FACULTY1.jpg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY1.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_CS_FACULTY3.jpg";
        img.backward_left_Any_path = true;
        img.backward_left_image = "FRONT_CS_FACULTY1.jpg";
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CS_FACULTY2.jpeg",img);
        //////////////////////////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "FRONT_CS_FACULTY3.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY4.jpg";
        img.backward_path = true;
        img.backward_tog  = false;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_CS_FACULTY2.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY3.jpg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "BACK_CS_FACULTY3.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY4.jpg";
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_image = "BACK_CS_FACULTY2.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CS_FACULTY3.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY4.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY5.jpg";
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY3.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY4.jpg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CS_FACULTY4.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY5.jpg";
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY3.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CS_FACULTY4.jpeg",img);

        //////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY5.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY6.jpg";
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY4.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;

        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY5.jpg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CS_FACULTY5.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY6.jpg";
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY4.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CS_FACULTY5.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY6.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY7.jpg";
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY5.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY6.jpg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CS_FACULTY6.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY7.jpg";
        img.backward_path = true;
        img.backward_image = "BACK_CS_FACULTY5.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CS_FACULTY6.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY7.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY8.jpg";
        img.backward_path = true;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.backward_image = "BACK_CS_FACULTY6.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY7.jpg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CS_FACULTY7.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY8.jpg";
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.backward_image = "BACK_CS_FACULTY6.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CS_FACULTY7.jpeg",img);
        /////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY8.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY9.jpg";
        img.backward_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.backward_right_image = "BACK_CS_FACULTY7.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=true;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY8.jpg",img);

        ///////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        ////////////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY9.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY10.jpg";
        img.backward_path = true;
        img.backward_image = "FRONT_CS_FACULTY8.jpg";
        img.backward_tog  = false;
        img.forwarda_tog = false;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY9.jpg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY10.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY11.jpg";
        img.backward_path = true;
        img.backward_image = "FRONT_CS_FACULTY9.jpg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = false;

        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY10.jpg",img);


        /////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY11.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CS_FACULTY12.jpg";
        img.backward_path = true;
        img.backward_image = "FRONT_CS_FACULTY10.jpg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY11.jpg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "FRONT_CS_FACULTY12.jpg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "FRONT_CS_FACULTY11.jpg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CS_FACULTY12.jpg",img);

    }
}
