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
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListViewStepsAdapter extends RecyclerView.Adapter<ListViewStepsAdapter.ViewHolder>{
     List<Step> stepList;
     Context context;

    public ListViewStepsAdapter(List<Step> stepList, Context context) {
        this.stepList = stepList;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewStepsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.step_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewStepsAdapter.ViewHolder holder, int position) {
        Step step = stepList.get(position);
        holder.stepTextView.setText(step.getSteps());
        if(step.getPhoto()!=null){
            holder.stepPhotoImageView.setImageDrawable(step.getPhoto());
        }else{
            holder.stepPhotoImageView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return stepList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView stepTextView;
        public ImageView stepPhotoImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            stepTextView = (TextView) itemView.findViewById(R.id.stepTextView);
            stepPhotoImageView = (ImageView) itemView.findViewById(R.id.stepPhotoImageView);
        }
    }

}
