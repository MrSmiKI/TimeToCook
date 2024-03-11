package com.example.nuuuuuuuuuu;

import android.graphics.drawable.Drawable;

public class ListData {
    private String name;
    private Drawable drawable;
    private String Ingredients;
    private String time;
    private String steps;

    public ListData(String name, Drawable drawable, String ingredients, String time, String steps) {
        this.name = name;
        this.drawable = drawable;
        Ingredients = ingredients;
        this.time = time;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }
}
