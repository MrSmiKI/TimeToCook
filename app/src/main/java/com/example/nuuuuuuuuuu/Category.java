package com.example.nuuuuuuuuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity implements View.OnClickListener{
    CardView breakFastCardView, lunchCardView, dinnerCardView, dessertCardView,beveragesCardView,sauceCardView,snacksCardView;
    Button homeButton, categoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_category);
        addInfo();
        workWork();
    }
    private void addInfo(){
        homeButton = findViewById(R.id.homeButton);
        categoryButton = findViewById(R.id.categoryButton);
        sauceCardView = (CardView) findViewById(R.id.sauceCardView);
        snacksCardView = (CardView) findViewById(R.id.snacksCardView);
        beveragesCardView = (CardView) findViewById(R.id.beveragesCardView);
        breakFastCardView = (CardView) findViewById(R.id.breakFastCardView);
        lunchCardView = (CardView) findViewById(R.id.lunchCardView);
        dinnerCardView = (CardView) findViewById(R.id.dinnerCardView);
        dessertCardView = (CardView) findViewById(R.id.dessertCardView);
        dessertCardView.setOnClickListener(this);
        sauceCardView.setOnClickListener(this);
        snacksCardView.setOnClickListener(this);
        beveragesCardView.setOnClickListener(this);
        dinnerCardView.setOnClickListener(this);
        breakFastCardView.setOnClickListener(this);
        lunchCardView.setOnClickListener(this);
    }
    private void workWork(){
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.beveragesCardView:
                i = new Intent(this, Beverages.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.snacksCardView:
                i = new Intent(this, Snacks.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.sauceCardView:
                i = new Intent(this, Sauce.class);
                startActivity(i);
                break;
        }
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