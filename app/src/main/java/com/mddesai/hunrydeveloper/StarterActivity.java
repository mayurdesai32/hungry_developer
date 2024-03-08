package com.mddesai.hunrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView starterList= findViewById(R.id.listview);

//        String[] dishes=new String[20];
        String[] dishes={
                    "Spaghetti Carbonara",
                    "Chicken Tikka Masala",
                    "Vegetable Stir-fry",
                    "Margherita Pizza",
                    "Caesar Salad",
                    "Beef Burger",
                    "Sushi Platter",
                    "Tom Yum Soup",
                    "Grilled Salmon",
                    "Mushroom Risotto",
                    "Pad Thai",
                    "BBQ Ribs",
                    "Fish and Chips",
                    "Chicken Alfredo",
                    "Beef Stroganoff",
                    "Tandoori Chicken",
                    "Caprese Salad",
                    "Shrimp Scampi",
                    "Lamb Curry",
                    "Greek Salad",
                    "Eggplant Parmesan",
                    "Pesto Pasta",
                    "Steak Frites",
                    "Chicken Shawarma",
                    "Vegetable Lasagna",
                    "Sashimi Assortment",
                    "Beef Wellington",
                    "Lobster Bisque",
                    "Vegetarian Curry",
                    "Chicken Caesar Wrap",
                    "Philly Cheesesteak",
                    "Falafel Platter",
                    "Margherita Flatbread",
                    "Beef Tacos",
                    "Chicken Kebabs",
                    "Cobb Salad",
                    "Vegetable Tempura",
                    "Seafood Paella",
                    "Ratatouille",
                    "Pulled Pork Sandwich"};

        ArrayAdapter<String> dishesAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);

        starterList.setAdapter(dishesAdapter);
    }
}