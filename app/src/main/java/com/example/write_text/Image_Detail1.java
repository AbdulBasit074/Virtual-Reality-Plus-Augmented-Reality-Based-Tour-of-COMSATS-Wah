package com.example.write_text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Image_Detail1 implements Serializable
{
    private static final long serialVersionUID = 1L;
    String image_name;
    ////////////// FOR TEXT ////////////////////
    List<String> file_text;
    List<String>  file_text_x;
    List<String>  file_text_y;
    List<String>  file_text_color_code;
    List<String>  file_text_size;
    ///////////////FOR IMAGE//////////////////
    List<String>  imge_path;
    List<String>  image_x;
    List<String>  image_y;
    List<String>  image_size;

    public Image_Detail1()
    {
        file_text = new ArrayList<>();
        file_text_x = new ArrayList<>();
        file_text_y = new ArrayList<>();
        file_text_color_code = new ArrayList<>();
        file_text_size = new ArrayList<>();
        ///////////////FOR IMAGE//////////////////
        imge_path = new ArrayList<>();
        image_x = new ArrayList<>();
        image_y = new ArrayList<>();
        image_size = new ArrayList<>();

    }



}
