package com.mddesai.hunrydeveloper;

import static java.sql.DriverManager.println;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView startersCard;
    CardView mainCard;
    TextView textViewstarter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.cardView1);
        mainCard = findViewById(R.id.cardView2);
        textViewstarter= findViewById(R.id.main_view123);

//        on click
        startersCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                    startActivity(startersActivityIntent);
                }
            });
        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCourseActivityIntent = new Intent(MainActivity.this, MainCourse.class);
                startActivity(mainCourseActivityIntent);
            }
        });
        textViewstarter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("hello world");
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:msdesai32@gmail.com"));
                startActivity(emailIntent);
            }
        });
        }
}