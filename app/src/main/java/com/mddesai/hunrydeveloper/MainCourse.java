package com.mddesai.hunrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCourse extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);
        ListView listview_mainCourse= findViewById(R.id.listview_mainCourse);
        Dish[] Dishes={ new Dish("Spaghetti1 Carbonara","this ifdgs Spaghetti Carbonara",4444),
                new Dish("Spaghetti2 Carbonara","this is Spgdfgdaghetti Carbonara",4444),
                new Dish("Spaghetti3 Carbonara","this is Spaghetgdfgti Carbonara",4444),
                new Dish("Spaghetti4 Carbonara","this is Spaghetti Carbonara",4444)};

        ArrayAdapter<Dish> MainCourseAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Dishes);

        listview_mainCourse.setAdapter(MainCourseAdapter);







    }
}
