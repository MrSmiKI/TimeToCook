package com.example.nuuuuuuuuuu;

import android.graphics.drawable.Drawable;

public class Step {
    private String steps;
    private Drawable photo;

    public Step(String steps, Drawable photo) {
        this.steps = steps;
        this.photo = photo;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }
}
