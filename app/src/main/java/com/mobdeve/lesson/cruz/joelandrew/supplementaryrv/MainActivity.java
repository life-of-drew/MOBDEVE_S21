package com.mobdeve.lesson.cruz.joelandrew.supplementaryrv;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Our RecyclerView reference
    RecyclerView recyclerView;

    //Our Data
    ArrayList<PlanetsModel> planetModels = new ArrayList<>();
    int[] planetImages = {R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars,
            R.drawable.jupiter, R.drawable.saturn, R.drawable.uranus, R.drawable.neptune};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        displayItems();

        // Set the Adapter. We have to define our own Adapter so that we can properly set the
        // information into the item layout we created. It is typical to pass the data we want
        // displayed into the adapter. There are other variants of RecyclerViews that query data
        // from online sources in batches (instead of passing everything), but we'll get to that
        // when we reach accessing remote DBs.

        MyAdapter myAdapter = new MyAdapter(this, planetModels);
        recyclerView.setAdapter(myAdapter);

        // Set the LayoutManager. This can be set to different kinds of LayoutManagers but we're
        // keeping things simple with a LinearLayout.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void displayItems() {
        String [] planetNames = getResources().getStringArray(R.array.planet_names);
        String [] numberMoons = getResources().getStringArray(R.array.number_moons);

        //Create a loop to extract the details.
        for (int i = 0; i <planetNames.length; i++){
            planetModels.add(new PlanetsModel(planetNames[i],
                    numberMoons[i], planetImages[i]));
        }

    }
}