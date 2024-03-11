package com.example.nuuuuuuuuuu;

import android.content.Context;
import android.content.SharedPreferences;

public class Auth {
    private Context context;
    private static boolean readyButtonClicked = false;

    public Auth(Context context) {
        this.context = context;
    }

    public  boolean isReadyButtonClicked() {
        if(!readyButtonClicked){
            SharedPreferences sp = context.getSharedPreferences("data",Context.MODE_PRIVATE);
            readyButtonClicked = sp.getBoolean("readyButtonClicked",readyButtonClicked);
        }
        return readyButtonClicked;
    }

    public  void readyButtonClicked(boolean readyButtonClicked) {
        Auth.readyButtonClicked = readyButtonClicked;
        SharedPreferences sp = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean("readyButtonClicked", readyButtonClicked);
        edit.apply();
    }




}
