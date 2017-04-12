package in.thepolymath.dehradunhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Places button
        RelativeLayout places = (RelativeLayout) findViewById(R.id.places);

        // Set a click listener on that View
        places.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesIntent);
            }
        });

        // Find the utility button
        RelativeLayout utility = (RelativeLayout) findViewById(R.id.utility);

        // Set a click listener on that View
        utility.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent utilityIntent = new Intent(MainActivity.this, UtilityActivity.class);
                startActivity(utilityIntent);
            }
        });

        // Find the leisure button
        RelativeLayout leisure = (RelativeLayout) findViewById(R.id.leisure);

        // Set a click listener on that View
        leisure.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent leisureIntent = new Intent(MainActivity.this, LeisureActivity.class);
                startActivity(leisureIntent);
            }
        });

        // Find the food button
        RelativeLayout food = (RelativeLayout) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });

    }
}

