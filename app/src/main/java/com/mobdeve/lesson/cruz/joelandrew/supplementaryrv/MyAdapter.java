package com.mobdeve.lesson.cruz.joelandrew.supplementaryrv;

/*  An Adapter is the "middle man" that helps bind our data to the item view holder. Our Adapter
    extends the RecyclerView's Adapter class (an abstract class). We need to specify the generics
    tag so that it knows which ViewHolder to model after. Some walkthroughs integrate the custom
    ViewHolder into the Adapter class. In this walkthroughs, we create a separate file for the
    custom ViewHolder.

    The RecyclerView's Adapter class requires three methods to be implemented:
        onCreateViewHolder -> What happens when the ViewHolder is created
        onBindViewHolder -> What happens when binding data to the ViewHolder
        getItemCount -> The total data items
* */


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private Context context;
    private ArrayList<PlanetsModel> planetModels;

    public MyAdapter(Context context, ArrayList<PlanetsModel> planetModels) {
        this.context = context;
        this.planetModels = planetModels;
    }

    @NonNull
    @Override
     /*  onCreateViewHolder requires in two parameters:
            parent -> Which is the parent View where this adapter is associated with; this is
                      typically the RecyclerView
                      recall: recyclerView.adapter = MyAdapter(this.characterList)
            viewType -> This parameter refers to the appearance of the view
    * */
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Create a LayoutInflater using the parent's (i.e. RecyclerView's) context
        // Inflate a new View given the item_layout.xml item view we created.
        // Return a new instance of our MyViewHolder passing the View object we created

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false));
    }

        /*  Whenever the RecyclerView feels the need to bind data, onBindViewHolder is called. Here, we
        gain access to the specific ViewHolder instance and the position in our data that we should
        be binding to the view.
        * */

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Assigning value to the views we created in the item_layout file
        //Based on the position of the recycler view
        holder.planetTv.setText(planetModels.get(position).getPlanetName());
        holder.numMoonsTv.setText(planetModels.get(position).getNoMoons());
        holder.imageView.setImageResource(planetModels.get(position).getImage());

    }

    //The recycler view just wants to know how many items you want displayed
    @Override
    public int getItemCount() {
        return planetModels.size();
    }
}
