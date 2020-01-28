package com.example.write_text;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.widget.Toast;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class APPLY_AUGMENTED_REALITY
{


    public  HashMap<String,Image_Detail1> All_detail;
    public  HashMap<String,Integer> size_detail_text;
    public  HashMap<String,Integer> size_detail_image;

    public  Image_Detail1 IMG_AR;
    public  Bitmap[] showimages;

    Context c;


    public APPLY_AUGMENTED_REALITY(Context f)
    {
        c = f;
        showimages  = new Bitmap[50];
        All_detail = new HashMap<>();
        size_detail_text = new HashMap<String, Integer>();
        size_detail_image = new HashMap<String, Integer>();
        SET_SIZE();
    }
    private void SET_SIZE()
    {
        size_detail_text.put("Short Minimum",10);
        size_detail_text.put("Minimum",20);
        size_detail_text.put("Medium",30);
        size_detail_text.put("Maximum",40);
        size_detail_text.put("Full Maximum",50);
        size_detail_image.put("Short Minimum",50);
        size_detail_image.put("Minimum",100);
        size_detail_image.put("Medium",150);
        size_detail_image.put("Maximum",200);
        size_detail_image.put("Full Maximum",250);
    }

    public boolean SET_AR_FILE_PATH(String  filepath)
    {
        File file = null;

        file = new File(filepath);

        FileInputStream fiIn = null;
        try
        {
            fiIn = new FileInputStream(file);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return false;
        }
        try
        {
            BufferedInputStream boi = new BufferedInputStream(fiIn);
            ObjectInputStream objectin = new ObjectInputStream(boi);
            All_detail = (HashMap<String,Image_Detail1>) objectin.readObject();
            objectin.close();
            boi.close();
            fiIn.close();
        }
        catch (IOException e)
        {
            return false;
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            return false;
        }
        if(All_detail.size()>0)
        System.out.println("FOUND TRUE RESULT");

        return true;

    }


    public Bitmap APPLY_AUGMENTED(String path)
    {

        Uri source = getImageContentUri(c,new File(path));
        Cursor returnCursor = c.getContentResolver().query(source, null, null, null, null);
        int nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
        int sizeIndex = returnCursor.getColumnIndex(OpenableColumns.SIZE);
        returnCursor.moveToFirst();
        IMG_AR = All_detail.get( returnCursor.getString(nameIndex));
        if(IMG_AR==null)
        {
            return null;
        }
        else
        {

            Bitmap processedBitmap = ProcessingBitmap(source);
            if (processedBitmap != null)
            {
                return processedBitmap;
            }
            else
            {
                return null;
            }
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    public static Uri getImageContentUri(Context context, File imageFile)
    {
        String filePath = imageFile.getAbsolutePath();
        Cursor cursor = context.getContentResolver().query(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                new String[] { MediaStore.Images.Media._ID },
                MediaStore.Images.Media.DATA + "=? ",
                new String[] { filePath }, null);
        if (cursor != null && cursor.moveToFirst()) {
            int id = cursor.getInt(cursor.getColumnIndex(MediaStore.MediaColumns._ID));
            cursor.close();
            return Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "" + id);
        } else {
            if (imageFile.exists()) {
                ContentValues values = new ContentValues();
                values.put(MediaStore.Images.Media.DATA, filePath);
                return context.getContentResolver().insert(
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
            } else {
                return null;
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    private Bitmap ProcessingBitmap(Uri source1)
    {
        Bitmap bm1 = null;
        Bitmap newBitmap = null;

        try {
            bm1 = BitmapFactory.decodeStream(c.getContentResolver().openInputStream(source1));
            Bitmap.Config config = bm1.getConfig();
            if(config == null)
            {
                config = Bitmap.Config.ARGB_8888;
            }

            newBitmap = Bitmap.createBitmap(bm1.getWidth(), bm1.getHeight(), config);
            Canvas newCanvas = new Canvas(newBitmap);

            newCanvas.drawBitmap(bm1, 0, 0, null);

            String captionString = IMG_AR.image_name;
            String p = IMG_AR.image_name;

            if(captionString != null)
            {

                for(int i=0; i<IMG_AR.file_text.size();i++)
                {

                    Paint paintText = new Paint(Paint.ANTI_ALIAS_FLAG);
                    String size_set = IMG_AR.file_text_size.get(i);
                    paintText.setTextSize(size_detail_text.get(size_set));
                    paintText.setStyle(Paint.Style.FILL);
                    paintText.setShadowLayer(10f, 10f, 10f, Color.BLACK);
                    Rect rectText = new Rect();
                    paintText.getTextBounds(captionString, 0, captionString.length(), rectText);
                    paintText.setColor(Color.parseColor(IMG_AR.file_text_color_code.get(i)));
                    newCanvas.drawText(IMG_AR.file_text.get(i),Integer.decode(IMG_AR.file_text_x.get(i)),Integer.decode(IMG_AR.file_text_y.get(i)),paintText);
                }
                for(int i=0; i<IMG_AR.imge_path.size();i++)
                {
                    String size_set = IMG_AR.image_size.get(i);
                    int siz = size_detail_image.get(size_set);
                    showimages[i] = BitmapFactory.decodeFile(IMG_AR.imge_path.get(i));
                    showimages[i] = ResizedImage(showimages[i],siz,siz);
                    newCanvas.drawBitmap(showimages[i],Integer.decode(IMG_AR.image_x.get(i)),
                            Integer.decode(IMG_AR.image_y.get(i)),null);
                    ///newCanvas.drawColor(Color.RED);
                    //  paintText.set
                }

            }
            else
            {
                Toast.makeText(c, "caption empty!", Toast.LENGTH_LONG).show();
            }

        } catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return newBitmap;




    }
    public Bitmap ResizedImage(Bitmap img,int reqwidth,int reqheight)
    {
        Matrix work = new Matrix();
        RectF src = new RectF(0,0,img.getWidth(),img.getHeight());
        RectF des = new RectF(0,0,reqwidth,reqheight);
        work.setRectToRect(src,des,Matrix.ScaleToFit.CENTER);
        return    Bitmap.createBitmap(img,0,0,img.getWidth(),img.getHeight(),work,true);
    }








}
