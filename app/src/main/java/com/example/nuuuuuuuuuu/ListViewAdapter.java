package com.example.nuuuuuuuuuu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<ListData> {

    Context context;
    ArrayList<ListData> list;
    View v;


    public ListViewAdapter(@NonNull Context context, ArrayList<ListData> list) {
        super(context, R.layout.list_item, list);
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ListData listdata =this.list.get(position);

        LayoutInflater inflater = LayoutInflater.from(this.context);
        v = inflater.inflate(R.layout.list_item,null,false);

        TextView textView = v.findViewById(R.id.textView);
        ShapeableImageView photoImageView = v.findViewById(R.id.photoImageView);
        TextView timeTextView = v.findViewById(R.id.timeTextView);
        textView.setText(listdata.getName());
        photoImageView.setImageDrawable(listdata.getDrawable());
        String time = listdata.getTime();
        if(time.contains("час") && time.contains("мин")){
            time = time.replace("мин"," м.").replace("час", " ч.");
        }else{
            time = time.replace("мин"," мин").replace("час", " час");
        }
        timeTextView.setText(time);


        return  v;
    }
}
