package com.example.nuuuuuuuuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class Main extends AppCompatActivity implements View.OnClickListener {
    CardView breakFastCardView, lunchCardView, dinnerCardView, dessertCardView;
    SearchView searchView;
    ShapeableImageView accImageView;
    Button homeButton, categoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
        Auth memory = new Auth(getApplicationContext());
        if(!memory.isReadyButtonClicked()){
            Intent wellcomeIntent = new Intent(Main.this,WellcomeActivity.class);
            startActivity(wellcomeIntent);
        }
        addInfo();
        workWork();
    }
    private void addInfo(){
        homeButton = findViewById(R.id.homeButton);
        accImageView = findViewById(R.id.accImageView);
        categoryButton = findViewById(R.id.categoryButton);
        breakFastCardView = (CardView) findViewById(R.id.breakFastCardView);
        lunchCardView = (CardView) findViewById(R.id.lunchCardView);
        dinnerCardView = (CardView) findViewById(R.id.dinnerCardView);
        dessertCardView = (CardView) findViewById(R.id.dessertCardView);
        searchView = findViewById(R.id.searchView);
        dessertCardView.setOnClickListener(this);
        dinnerCardView.setOnClickListener(this);
        breakFastCardView.setOnClickListener(this);
        lunchCardView.setOnClickListener(this);
    }
    private void workWork(){
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        categoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,Category.class);
                startActivity(intent);
            }
        });
        accImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this, AboutActivty.class);
                startActivity(intent);
            }
        });

    }



    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.breakFastCardView:
                i = new Intent(this, Breakfast.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.lunchCardView:
                i = new Intent(this, Lunch.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.dinnerCardView:
                i = new Intent(this, Dinner.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.dessertCardView:
                i = new Intent(this, Dessert.class);
                startActivity(i);
                break;
        }
    }
}