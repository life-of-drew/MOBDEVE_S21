package com.mobdeve.lesson.cruz.joelandrew.supplementaryrv;

/*  This is our custom ViewHolder class. Please note that the primary constructor of RecyclerView's
    ViewHolder requires an itemView to be passed (think of this as a super class constructor call).
    So we need to make sure we access that too. This class is usually instantiated in the
    onCreateViewHolder of the Adapter.
* */

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


// In our item layout, we need two references -- an ImageView and a TextView. Please note that
// the itemView is the RecyclerView -- which has context that we can use to find View instances.
public class MyViewHolder extends RecyclerView.ViewHolder {

    //Grab the views from our item_layout file
    ImageView imageView;
    TextView planetTv;
    TextView numMoonsTv;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

      imageView = itemView.findViewById(R.id.planetsIv);
      planetTv = itemView.findViewById(R.id.planetNameTv);
      numMoonsTv = itemView.findViewById(R.id.noMoonsTv);

    }
}
