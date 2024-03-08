package com.mddesai.hunrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView startersCard;
    CardView mainCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.cardView1);
        mainCard = findViewById(R.id.cardView2);

//        on click
        startersCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                    startActivity(startersActivityIntent);
                }
            });

        }
}