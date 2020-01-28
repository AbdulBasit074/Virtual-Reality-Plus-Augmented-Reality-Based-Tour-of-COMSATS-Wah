package com.example.write_text;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Request_List_adobter extends BaseAdapter {
    Context mContext;
    List<String> list;
    int[] Lst1;


    public Request_List_adobter(Context applicationContext, List<String> file_name, int[] file_image) {
        this.mContext = applicationContext;
        this.list = file_name;
        this.Lst1 = file_image;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext,R.layout.single_item,null);
        ImageView img =  v.findViewById(R.id.image1);
        TextView txt = v.findViewById(R.id.name1);

        ///////////////Set Data//////////////////////////
        txt.setText(list.get(position));

        Glide.with(mContext).load(Lst1[position]).into(img);
        return v;
    }
}
