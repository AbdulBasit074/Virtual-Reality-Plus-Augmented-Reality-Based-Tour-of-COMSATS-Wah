package com.example.write_text;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CIVIALBLOCK
{
    public Boolean forward = false;
    public Boolean backward = false;
    public HashMap<String,IMAGE_DETAIL> forward_path;
    public HashMap<String,String> path_joint;
    public HashMap<String,String> path_joint_out;

    public Boolean Is_joint_path_active = false;
    public boolean joint_forward = false;


    public HashMap<String,String> path_on_joint__images;
    public HashMap<String,String> path_joint_backward_images;




    final int TOTAL_PICS = 0;
    public Context c;



    public CIVIALBLOCK(Context f)
    {
        c = f ;
        String Department_path = "/storage/9887-2D8C/VrVideo/CIVIALBLOCK/";
        forward_path = new HashMap<>();
        path_joint  = new HashMap<>();
        path_joint_out  = new HashMap<>();

        path_on_joint__images = new HashMap<>();
        path_joint_backward_images = new HashMap<>();


        IMAGE_DETAIL img = new IMAGE_DETAIL();
        img.name = "FRONT_CIVIALBLOCK1.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK2.jpeg";
        img.backward_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK1.jpeg",img);
        /////F1
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_CIVIALBLOCK1.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK2.jpeg";
        img.backward_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK1.jpeg",img);
        /////F1

        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////

        img.name = "FRONT_CIVIALBLOCK2.jpeg";
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_CIVIALBLOCK3.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK8.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK1.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = true;
        img.backward_left_image = "FRONT_CIVIALBLOCK1.jpeg";
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK2.jpeg",img);

        //////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CIVIALBLOCK2.jpeg";
        // img.name = "FRONT_CS_FACULTY1.jpg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK8.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK1.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_CIVIALBLOCK3.jpeg";
        img.backward_left_Any_path = true;
        img.backward_left_image = "FRONT_CIVIALBLOCK3.jpeg";
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK2.jpeg",img);
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////
        path_joint.put("FRONT_CIVIALBLOCK2.jpeg","FRONT_CIVIALBLOCK3.jpeg");
        path_joint.put("BACK_CIVIALBLOCK2.jpeg","FRONT_CIVIALBLOCK3.jpeg");


        path_joint_out.put("FRONT_CIVIALBLOCK3.jpeg","BACK_CIVIALBLOCK2.jpeg");
        path_joint_out.put("BACK_CIVIALBLOCK3.jpeg","BACK_CIVIALBLOCK2.jpeg");




        path_on_joint__images.put("BACK_CIVIALBLOCK2.jpeg"+true,"FRONT_CIVIALBLOCK2.jpeg");
        path_on_joint__images.put("BACK_CIVIALBLOCK2.jpeg"+false,"BACK_CIVIALBLOCK2.jpeg");



        //////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////


        path_joint.put("FRONT_CIVIALBLOCK8.jpeg","FRONT_CIVIALBLOCK9.jpeg");
        path_joint.put("BACK_CIVIALBLOCK8.jpeg","FRONT_CIVIALBLOCK9.jpeg");


        path_joint_out.put("FRONT_CIVIALBLOCK9.jpeg","BACK_CIVIALBLOCK8.jpeg");
        path_joint_out.put("BACK_CIVIALBLOCK9.jpeg","BACK_CIVIALBLOCK8.jpeg");




        path_on_joint__images.put("BACK_CIVIALBLOCK8.jpeg"+true,"FRONT_CIVIALBLOCK8.jpeg");
        path_on_joint__images.put("BACK_CIVIALBLOCK8.jpeg"+false,"BACK_CIVIALBLOCK8.jpeg");


















        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "FRONT_CIVIALBLOCK3.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK4.jpeg";
        img.backward_path = true;
        img.backward_tog  = false;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_CIVIALBLOCK2.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK3.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "BACK_CIVIALBLOCK3.jpeg";
        img.forwarda_path  = true;
        img.forward_image  = "FRONT_CIVIALBLOCK4.jpeg";
        img.backward_path  = true;
        img.backward_tog   = true;
        img.forwarda_tog   = false ;
        img.backward_image = "BACK_CIVIALBLOCK2.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK3.jpeg",img);
        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "FRONT_CIVIALBLOCK4.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK5.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK3.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false ;
        img.forwarda_tog = true ;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK4.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "BACK_CIVIALBLOCK4.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK5.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK3.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK4.jpeg",img);
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "FRONT_CIVIALBLOCK5.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK6.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK4.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK5.jpeg",img);

        img=null;
        img = new IMAGE_DETAIL();


        img.name = "BACK_CIVIALBLOCK5.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK6.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK4.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK5.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "FRONT_CIVIALBLOCK6.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK7.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK5.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK6.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CIVIALBLOCK6.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK7.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK5.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK6.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();


        img.name = "FRONT_CIVIALBLOCK7.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.backward_image = "BACK_CIVIALBLOCK6.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK7.jpeg",img);
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_CIVIALBLOCK7.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.backward_image = "BACK_CIVIALBLOCK6.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK7.jpeg",img);
        /////////////////////////////////////////////////

        /////////////////////////////////////////////////

        path_joint.put("FRONT_CIVIALBLOCK8.jpeg","FRONT_CIVIALBLOCK9.jpeg");
        path_joint.put("BACK_CIVIALBLOCK8.jpeg","FRONT_CIVIALBLOCK9.jpeg");


        path_joint_out.put("FRONT_CIVIALBLOCK9.jpeg","BACK_CIVIALBLOCK2.jpeg");
        path_joint_out.put("BACK_CIVIALBLOCK3.jpeg","BACK_CIVIALBLOCK2.jpeg");




        path_on_joint__images.put("BACK_CIVIALBLOCK2.jpeg"+true,"FRONT_CIVIALBLOCK2.jpeg");
        path_on_joint__images.put("BACK_CIVIALBLOCK2.jpeg"+false,"BACK_CIVIALBLOCK2.jpeg");




        //////////////////////////////////////////////////
        //////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();
        img.name = "FRONT_CIVIALBLOCK8.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK10.jpeg";
        img.forward_left_Any_path = true ;
        img.forward_left_image = "FRONT_CIVIALBLOCK9.jpeg";
        img.forward_right_Any_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK2.jpeg";
        img.backward_right_Any_path = true ;
        img.backward_right_image = "FRONT_CIVIALBLOCK9.jpeg";
        img.backward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK8.jpeg",img);
        /////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        /////////////////////////////////////////////
        img.name = "BACK_CIVIALBLOCK8.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK10.jpeg";
        img.forward_left_Any_path = true ;
        img.forward_left_image = "FRONT_CIVIALBLOCK9.jpeg";
        img.forward_right_Any_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK2.jpeg";
        img.backward_right_Any_path = true ;
        img.backward_right_image = "FRONT_CIVIALBLOCK9.jpeg";
        img.backward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.image_path = Department_path;forward_path.put("BACK_CIVIALBLOCK8.jpeg",img);

        /////////////////////////////////////////////////
        ///////////////////////DONE 8/////////////////////////
        /////////////////////////////////////////////////


        img=null;
        img = new IMAGE_DETAIL();

        img.name = "FRONT_CIVIALBLOCK9.jpeg";
        img.forwarda_path = false;

        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK8.jpeg";
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=true;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK9.jpeg",img);

        ///////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        ////////////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img.name = "BACK_CIVIALBLOCK9.jpeg";
        img.forwarda_path = false;

        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK8.jpeg";
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=true;

        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK9.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img.name = "FRONT_CIVIALBLOCK10.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK11.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK8.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;

        forward_path.put("FRONT_CIVIALBLOCK10.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_CIVIALBLOCK10.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK11.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK8.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK10.jpeg",img);



        /////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "FRONT_CIVIALBLOCK11.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK12.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK10.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK11.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_CIVIALBLOCK11.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK12.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK10.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK11.jpeg",img);



        /////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "FRONT_CIVIALBLOCK12.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK11.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVIALBLOCK12.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_CIVIALBLOCK12.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK11.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        img.image_path = Department_path;forward_path.put("BACK_CIVIALBLOCK12.jpeg",img);
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////







    }
}
