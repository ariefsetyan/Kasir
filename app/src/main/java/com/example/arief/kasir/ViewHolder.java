package com.example.arief.kasir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    public TextView name,dec;
    public LinearLayout linearLayout;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        image = (ImageView)itemView.findViewById(R.id.imageView_id);
        name = (TextView) itemView.findViewById(R.id.name_textview);
        dec = (TextView) itemView.findViewById(R.id.desc_textview);
        linearLayout = (LinearLayout)itemView.findViewById(R.id.recycleritem_id);
    }
}
