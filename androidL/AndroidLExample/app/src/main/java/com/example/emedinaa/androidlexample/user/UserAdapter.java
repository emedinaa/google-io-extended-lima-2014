package com.example.emedinaa.androidlexample.user;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emedinaa.androidlexample.R;
import com.example.emedinaa.androidlexample.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emedinaa on 23/08/2014.
 */
public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<UserEntity> data;
    private int layout;

    public  UserAdapter(List<UserEntity> data,  int layout){
        this.data = data;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        UserEntity course = data.get(position);
        viewHolder.name.setText(course.getName());
        viewHolder.skills.setText(course.getSkills());
        viewHolder.itemView.setTag(course);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder   {

        public ImageView image;
        public TextView name;
        public TextView skills;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.iviUser);
            name = (TextView) itemView.findViewById(R.id.tviName);
            skills = (TextView) itemView.findViewById(R.id.tviSkill);
        }

    }

}
