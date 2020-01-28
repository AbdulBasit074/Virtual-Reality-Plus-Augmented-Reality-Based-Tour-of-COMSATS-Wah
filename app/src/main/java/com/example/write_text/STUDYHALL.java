package com.example.write_text;

import android.content.Context;

import java.util.HashMap;

public class STUDYHALL
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



    public STUDYHALL(Context f)
    {
        c = f ;
        String Department_path = "/storage/9887-2D8C/VrVideo/STUDYHALL/";
        forward_path = new HashMap<>();
        path_joint  = new HashMap<>();
        path_joint_out  = new HashMap<>();

        path_on_joint__images = new HashMap<>();
        path_joint_backward_images = new HashMap<>();


        IMAGE_DETAIL img = new IMAGE_DETAIL();
        img.name = "FRONT_STUDYHALL1.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_STUDYHALL2.jpeg";
        img.backward_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_STUDYHALL1.jpeg",img);
        /////F1
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_STUDYHALL1.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_STUDYHALL2.jpeg";
        img.backward_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_STUDYHALL1.jpeg",img);
        /////F1
///////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "FRONT_STUDYHALL2.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_STUDYHALL3.jpeg";
        img.backward_path = true;
        img.backward_image ="BACK_STUDYHALL1.jpeg";
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_STUDYHALL2.jpeg",img);
        /////F1
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_STUDYHALL2.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_STUDYHALL3.jpeg";
        img.backward_path = true;
        img.backward_image ="BACK_STUDYHALL1.jpeg";
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_STUDYHALL2.jpeg",img);
        /////F1
//////////////////////////////////////
        //////////////////////
        //////////////////////
        //////////////////
        //////////////////
        ///////////////
        //////////////////
        /////////////////////

        ////////////////////////////
        /////////////////////////////
        //////////////////////////

        ///////////////////////////
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////

        img.name = "FRONT_STUDYHALL3.jpeg";
        img.forward_right_Any_path = true;
        img.forward_right_image ="FRONT_STUDYHALL4.jpeg" ;
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_STUDYHALL2.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = true;
        img.backward_left_image = "FRONT_STUDYHALL4.jpeg";
        img.image_path = Department_path;
        forward_path.put("FRONT_STUDYHALL3.jpeg",img);

        //////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_STUDYHALL3.jpeg";
        img.forward_right_Any_path = true;
        img.forward_right_image ="FRONT_STUDYHALL4.jpeg" ;
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_STUDYHALL2.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = true;
        img.backward_left_Any_path = true;
        img.backward_left_image = "FRONT_STUDYHALL4.jpeg";
        img.image_path = Department_path;
        forward_path.put("BACK_STUDYHALL3.jpeg",img);
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////


        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "FRONT_STUDYHALL4.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_STUDYHALL5.jpeg";
        img.backward_path = true;
        img.backward_tog  = false;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_STUDYHALL3.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_STUDYHALL4.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "BACK_STUDYHALL4.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_STUDYHALL5.jpeg";
        img.backward_path = true;
        img.backward_tog  = false;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_STUDYHALL3.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_STUDYHALL4.jpeg",img);
        //////////////////////////////////////////////////        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////


        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "FRONT_STUDYHALL5.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_STUDYHALL4.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_STUDYHALL6.jpeg";
        img.backward_left_Any_path = true;
        img.backward_left_image = "BACK_STUDYHALL6.jpeg";
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_STUDYHALL5.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "BACK_STUDYHALL5.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_STUDYHALL4.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_STUDYHALL6.jpeg";
        img.backward_left_Any_path = true;
        img.backward_left_image = "BACK_STUDYHALL6.jpeg";
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_STUDYHALL5.jpeg",img);

        //////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        //////////////////////////////////////////////////        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////


        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "FRONT_STUDYHALL6.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_STUDYHALL5.jpeg";

        img.forward_left_Any_path = true;
        img.forward_left_image = "FRONT_STUDYHALL5.jpeg";
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=true;
        img.backward_right_image = "BACK_STUDYHALL5.jpeg";
        img.image_path = Department_path;
        forward_path.put("FRONT_STUDYHALL6.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////

        img.name = "BACK_STUDYHALL6.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = true ;
        img.backward_image = "BACK_STUDYHALL5.jpeg";
        img.forward_left_Any_path = true;
        img.forward_left_image = "FRONT_STUDYHALL5.jpeg";
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=true;
        img.backward_right_image = "BACK_STUDYHALL5.jpeg";
        img.image_path = Department_path;
        forward_path.put("BACK_STUDYHALL6.jpeg",img);

        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////



    }
}
