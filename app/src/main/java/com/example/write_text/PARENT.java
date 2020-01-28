package com.example.write_text;

import android.content.Context;

import java.util.HashMap;

public class PARENT {



    public Boolean forward = false;
    public Boolean backward = false;

    public HashMap<String,IMAGE_DETAIL> forward_path;

    public HashMap<String,String> joint_point;
    public Boolean joint_direction_forward = false;


    final int TOTAL_PICS = 0;

    public Context c;

    public PARENT(Context f)
    {
        c=f;
    }
    /////////////////////////////////////FOR CIVIAL/////////////////////////////////////////////////

    public void LOAD_CIVIALBLOCK()
    {
        String Department_path = "/storage/9887-2D8C/VrVideo/CIVIALBLOCK/";
        forward_path = new HashMap<>();
        forward_path = new HashMap<>();
        IMAGE_DETAIL img = new IMAGE_DETAIL();
        img.name = "FRONT_CIVIALBLOCK1.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVIALBLOCK2.jpeg";
        img.backward_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = false;
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
        img.forwarda_tog = false;
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
        // img.name = "FRONT_CS_FACULTY1.jpg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK1.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_CIVIALBLOCK3.jpeg";
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
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "BACK_CIVIALBLOCK1.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_right_Any_path = true;
        img.forward_right_image = "FRONT_CIVIALBLOCK3.jpeg";
        img.backward_left_Any_path = true;
        img.backward_left_image = "FRONT_CIVIALBLOCK1.jpeg";
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVIALBLOCK2.jpeg",img);
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////
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
        img.backward_tog  = true ;
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
        img.name = "BACK_CIVILBLOCK4.jpeg";
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
        img.backward_image = "BACK_CIVILBLOCK5.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK6.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        //////////////////////////////////////////////////
        img.name = "BACK_CIVILBLOCK6.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVILBLOCK7.jpeg";
        img.backward_path = true;
        img.backward_image = "BACK_CIVILBLOCK5.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVILBLOCK6.jpeg",img);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();


        img.name = "FRONT_CIVILBLOCK7.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = false;
        img.forwarda_tog = true;
        img.backward_image = "BACK_CIVILBLOCK6.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK7.jpeg",img);
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "BACK_CIVILBLOCK7.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_tog  = true;
        img.forwarda_tog = false;
        img.backward_image = "BACK_CIVILBLOCK6.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("BACK_CIVILBLOCK7.jpeg",img);
        /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        img.name = "FRONT_CIVILBLOCK8.jpeg";

        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVILBLOCK10.jpeg";

        img.forward_left_Any_path = true ;
        img.forward_left_image = "FRONT_CIVILBLOCK9.jpeg";


        img.forward_right_Any_path = false;


        img.backward_path = true;
        img.backward_image = "BACK_CIVILBLOCK2.jpeg";


        img.backward_right_Any_path = true ;
        img.backward_right_image = "FRONT_CIVILBLOCK9.jpeg";


        img.backward_left_Any_path = false;

        img.backward_tog  = false;
        img.forwarda_tog = true;

        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK8.jpeg",img);
        /////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        /////////////////////////////////////////////
        img.name = "BACK_CIVILBLOCK8.jpeg";

        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVILBLOCK10.jpeg";

        img.forward_left_Any_path = true ;
        img.forward_left_image = "FRONT_CIVILBLOCK9.jpeg";

        img.forward_right_Any_path = false;

        img.backward_path = true;
        img.backward_image = "BACK_CIVILBLOCK2.jpeg";


        img.backward_right_Any_path = true ;
        img.backward_right_image = "FRONT_CIVILBLOCK10.jpeg";


        img.backward_left_Any_path = false;

        img.backward_tog  = true;
        img.forwarda_tog = false;

        img.image_path = Department_path;
        forward_path.put("BACK_CIVILBLOCK8.jpeg",img);

        /////////////////////////////////////////////////
        ///////////////////////DONE 8/////////////////////////
        /////////////////////////////////////////////////


        img=null;
        img = new IMAGE_DETAIL();

        img.name = "FRONT_CIVILBLOCK9.jpeg";
        img.forwarda_path = false;

        img.backward_path = true;
        img.backward_image = "BACK_CIVILBLOCK9";


        img.backward_tog  = false;
        img.forwarda_tog = true;

        img.backward_right_image = "BACK_CIVILBLOCK7.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=true;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK8.jpeg",img);

        ///////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();

        ////////////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img.name = "FRONT_CIVILBLOCK9.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVILBLOCK10.jpeg";
        img.backward_path = true;
        img.backward_image = "FRONT_CIVILBLOCK8.jpeg";
        img.backward_tog  = false;
        img.forwarda_tog = false;
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK9.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        img.name = "FRONT_CIVILBLOCK10.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVILBLOCK11.jpeg";
        img.backward_path = true;
        img.backward_image = "FRONT_CIVILBLOCK9.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = false;

        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK10.jpeg",img);


        /////////////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "FRONT_CIVILBLOCK11.jpeg";
        img.forwarda_path = true;
        img.forward_image = "FRONT_CIVILBLOCK12.jpeg";
        img.backward_path = true;
        img.backward_image = "FRONT_CIVILBLOCK10.jpeg";
        img.forward_left_Any_path = false;
        img.forward_right_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK11.jpeg",img);

        //////////////////////////////////////////////////
        img=null;
        img = new IMAGE_DETAIL();
        //////////////////////////////////////////////////
        img.name = "FRONT_CIVILBLOCK12.jpeg";
        img.forwarda_path = false;
        img.backward_path = true;
        img.backward_image = "FRONT_CIVILBLOCK11.jpeg";
        img.forward_left_Any_path = false;
        img.backward_tog  = false;
        img.forwarda_tog = false;
        img.forward_right_Any_path = false;
        img.backward_left_Any_path = false;
        img.backward_right_Any_path=false;
        img.image_path = Department_path;
        forward_path.put("FRONT_CIVILBLOCK12.jpeg",img);

        //////////////////////////////////////////////////
        /////////////////////////////////////////////////////////

    }



    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////FOR CSFACULTY///////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

}
