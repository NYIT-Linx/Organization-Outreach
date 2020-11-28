package com.example.organizationoutreach;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class clubAdapter extends ArrayAdapter<club> {
    private Context cContext;
    private int cResource;

    public clubAdapter(@NonNull Context context, int resource, @NonNull ArrayList<club> objects) {
        super(context, resource, objects);
        this.cContext = context;
        this.cResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(cContext);

        convertView = layoutInflater.inflate(cResource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.image1);

        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtDes = convertView.findViewById(R.id.txtSub1);

        imageView.setImageResource(getItem(position).getImage());
        txtName.setText(getItem(position).getName());
        txtDes.setText(getItem(position).getDes());

        return convertView;
    }
}
