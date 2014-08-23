package com.gdglima.myapp.user;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gdglima.myapp.R;
import com.gdglima.myapp.entity.UserEntity;
import com.gdglima.myapp.utils.ImageUtils;

import java.util.List;

/**
 * Created by ALUMNO on 23/08/2014.
 */
public class UserAdapter extends ArrayAdapter<UserEntity> {

    private Context context;
    private List<UserEntity> data;
    public UserAdapter(Context context, int resource, List<UserEntity> objects) {
        super(context, resource, objects);

        this.context = context;
        this.data = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_user, null);
            ViewHolder holder = new ViewHolder();
            holder.iviUser = (ImageView)v.findViewById(R.id.iviUser);
            holder.tviName = (TextView)v.findViewById(R.id.tviName);
            holder.tviSkills = (TextView)v.findViewById(R.id.tviSkill);
            v.setTag(holder);
        }
        UserEntity entry = data.get(position);
        if(entry != null)
        {
            Bitmap bm= BitmapFactory.decodeResource(context.getResources(), entry.getImg());
            Bitmap aux= ImageUtils.getCircularBitmap(bm);

            ViewHolder holder = (ViewHolder)v.getTag();
            holder.tviName.setText(entry.getName());
            holder.tviSkills.setText(entry.getSkills());
          //  holder.iviUser.setImageResource(entry.getImg());
            holder.iviUser.setImageBitmap(aux);
        }

        return v;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public UserEntity getItem(int position) {
        return data.get(position);
    }

    static class ViewHolder
    {
        ImageView iviUser;
        TextView tviName;
        TextView tviSkills;
    }

}
