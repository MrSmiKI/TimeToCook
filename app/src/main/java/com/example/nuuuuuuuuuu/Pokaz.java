package com.example.nuuuuuuuuuu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class Pokaz extends AppCompatActivity {
    AlertDialog dialog;
    ImageView drawbleImageView;
    NestedScrollView scview;
    TextView nameTextView, timeTextView,ingredientsTextView,timeTitleTextView;
    RecyclerView stepListView;
    ListViewStepsAdapter adapter;

    ArrayList<Drawable> photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_pokaz);
        addInfo();
        get();
        scview.scrollTo(0,0);
    }
    public void zoomOnQuestItemImageTap(View view) {

        AlertDialog.Builder zoomDialog = new AlertDialog.Builder(Pokaz.this);
        View dialogView = LayoutInflater.from(Pokaz.this).inflate(R.layout.dialog_zoom_quest_item, null);
        ImageView previewImageFull = dialogView.findViewById(R.id.zoomQuestItemImageView);

        ShapeableImageView previewFromView = (ShapeableImageView) view;
        previewImageFull.setImageDrawable(previewFromView.getDrawable());

        zoomDialog.setView(dialogView);
        dialog = zoomDialog.create();
        dialog.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        scview.scrollTo(0,0);
        scview.scrollTo(0,0);
        scview.fullScroll(View.FOCUS_UP);
        scview.fullScroll(View.FOCUS_UP);
    }

    private void addInfo(){
        timeTitleTextView = findViewById(R.id.timeTitleTextView);
        drawbleImageView = findViewById(R.id.drawbleImageView);
        nameTextView = findViewById(R.id.nameTextView);
        timeTextView = findViewById(R.id.timeTextView);
        ingredientsTextView = findViewById(R.id.ingredientsTextView);
        stepListView = findViewById(R.id.stepListView);
        scview = (NestedScrollView) findViewById(R.id.scview);
    }
    private void get(){
        Intent intent = getIntent();
        String imageBase = intent.getStringExtra("image");
        byte[] decodedString = Base64.decode(imageBase,Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString,0,decodedString.length);
        drawbleImageView.setImageBitmap(decodedByte);
        nameTextView.setText(intent.getStringExtra("name"));
        String time = intent.getStringExtra("time").replace("мин"," мин").replace("час", " час");
        timeTextView.setText(time);
        if(time.isEmpty()){
            timeTitleTextView.setVisibility(View.GONE);
            timeTextView.setVisibility(View.GONE);
        }
        ingredientsTextView.setText(intent.getStringExtra("ingredients"));
        String[] dividedSteps = intent.getStringExtra("steps").split("Шаг");
        fillPhotos();
        ArrayList<Step> steps = new ArrayList<>();
        for (int i = 1; i<dividedSteps.length;i++){
            if(photos!=null){
                steps.add(new Step(dividedSteps[i],photos.get(i)));
            }else{
                steps.add(new Step(dividedSteps[i],getResources().getDrawable(R.drawable.uzin)));
            }
        }
        adapter = new ListViewStepsAdapter(steps, Pokaz.this);
        stepListView.setHasFixedSize(true);
        stepListView.setAdapter(adapter);
        stepListView.setLayoutManager(new LinearLayoutManager(this));


    }
    private void fillPhotos(){
        photos = new ArrayList<>();
        switch (getIntent().getStringExtra("name")){
            case "Жюльен с курицей и грибами":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.c1));
                photos.add(getResources().getDrawable(R.drawable.c2));
                photos.add(getResources().getDrawable(R.drawable.c3));
                photos.add(getResources().getDrawable(R.drawable.c4));
                photos.add(getResources().getDrawable(R.drawable.c5));
                photos.add(getResources().getDrawable(R.drawable.c6));
                photos.add(getResources().getDrawable(R.drawable.c7));
                photos.add(getResources().getDrawable(R.drawable.c8));
                photos.add(getResources().getDrawable(R.drawable.c9));


                break;
            case "Запеканка из картофеля и мясного фарша":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ew1));
                photos.add(getResources().getDrawable(R.drawable.ew2));
                photos.add(getResources().getDrawable(R.drawable.ew3));
                photos.add(getResources().getDrawable(R.drawable.ew4));
                photos.add(getResources().getDrawable(R.drawable.ew5));
                photos.add(getResources().getDrawable(R.drawable.ew6));
                photos.add(getResources().getDrawable(R.drawable.ew7));
                photos.add(getResources().getDrawable(R.drawable.ew8));
                photos.add(getResources().getDrawable(R.drawable.ew9));
                photos.add(getResources().getDrawable(R.drawable.ew10));
                photos.add(getResources().getDrawable(R.drawable.ew11));
                break;
            case "Горячие бутерброды с колбасой и яйцом":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.b1));
                photos.add(getResources().getDrawable(R.drawable.b2));
                photos.add(getResources().getDrawable(R.drawable.b3));
                photos.add(getResources().getDrawable(R.drawable.b4));
                photos.add(getResources().getDrawable(R.drawable.b5));
                photos.add(getResources().getDrawable(R.drawable.b6));
                photos.add(getResources().getDrawable(R.drawable.b7));
                photos.add(getResources().getDrawable(R.drawable.b8));
                break;
            case "Ленивая пицца на сковороде":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.b11));
                photos.add(getResources().getDrawable(R.drawable.b12));
                photos.add(getResources().getDrawable(R.drawable.b13));
                photos.add(getResources().getDrawable(R.drawable.b14));
                photos.add(getResources().getDrawable(R.drawable.b15));
                photos.add(getResources().getDrawable(R.drawable.b16));
                photos.add(getResources().getDrawable(R.drawable.b17));
                photos.add(getResources().getDrawable(R.drawable.b18));
                photos.add(getResources().getDrawable(R.drawable.b19));
                photos.add(getResources().getDrawable(R.drawable.b191));
                photos.add(getResources().getDrawable(R.drawable.b192));
                photos.add(getResources().getDrawable(R.drawable.b193));
                break;
            case "Омлет с сырной начинкой":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.o1));
                photos.add(getResources().getDrawable(R.drawable.o2));
                photos.add(getResources().getDrawable(R.drawable.o3));
                photos.add(getResources().getDrawable(R.drawable.o4));
                photos.add(getResources().getDrawable(R.drawable.o5));
                photos.add(getResources().getDrawable(R.drawable.o6));
                photos.add(getResources().getDrawable(R.drawable.o7));
                photos.add(getResources().getDrawable(R.drawable.o8));
                photos.add(getResources().getDrawable(R.drawable.o9));
                photos.add(getResources().getDrawable(R.drawable.o10));
                break;
            case "Яичница в хлебе, с сыром и колбасой":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.x1));
                photos.add(getResources().getDrawable(R.drawable.x2));
                photos.add(getResources().getDrawable(R.drawable.x3));
                photos.add(getResources().getDrawable(R.drawable.x4));
                photos.add(getResources().getDrawable(R.drawable.x5));
                photos.add(getResources().getDrawable(R.drawable.x6));
                photos.add(getResources().getDrawable(R.drawable.x7));
                photos.add(getResources().getDrawable(R.drawable.x8));
                photos.add(getResources().getDrawable(R.drawable.x9));
                photos.add(getResources().getDrawable(R.drawable.x10));
                photos.add(getResources().getDrawable(R.drawable.x11));
                photos.add(getResources().getDrawable(R.drawable.x12));
                photos.add(getResources().getDrawable(R.drawable.x13));
                break;
            case "Шакшука":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.s1));
                photos.add(getResources().getDrawable(R.drawable.s2));
                photos.add(getResources().getDrawable(R.drawable.s3));
                photos.add(getResources().getDrawable(R.drawable.s4));
                photos.add(getResources().getDrawable(R.drawable.s5));
                photos.add(getResources().getDrawable(R.drawable.s6));
                photos.add(getResources().getDrawable(R.drawable.s7));
                photos.add(getResources().getDrawable(R.drawable.s8));
                photos.add(getResources().getDrawable(R.drawable.s9));
                photos.add(getResources().getDrawable(R.drawable.s10));
                photos.add(getResources().getDrawable(R.drawable.s11));
                photos.add(getResources().getDrawable(R.drawable.s12));
                photos.add(getResources().getDrawable(R.drawable.x13));
                break;
            case "Ленивый хачапури на сковороде":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ha1));
                photos.add(getResources().getDrawable(R.drawable.ha2));
                photos.add(getResources().getDrawable(R.drawable.ha3));
                photos.add(getResources().getDrawable(R.drawable.ha4));
                photos.add(getResources().getDrawable(R.drawable.ha5));
                photos.add(getResources().getDrawable(R.drawable.ha6));
                photos.add(getResources().getDrawable(R.drawable.ha7));
                break;
            case "Лагман с курицей":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.la1));
                photos.add(getResources().getDrawable(R.drawable.la2));
                photos.add(getResources().getDrawable(R.drawable.la3));
                photos.add(getResources().getDrawable(R.drawable.la4));
                photos.add(getResources().getDrawable(R.drawable.la5));
                photos.add(getResources().getDrawable(R.drawable.la6));
                photos.add(getResources().getDrawable(R.drawable.la7));
                break;
            case "Жаркое по-деревенски":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.za1));
                photos.add(getResources().getDrawable(R.drawable.za2));
                photos.add(getResources().getDrawable(R.drawable.za3));
                photos.add(getResources().getDrawable(R.drawable.za4));
                photos.add(getResources().getDrawable(R.drawable.za5));
                photos.add(getResources().getDrawable(R.drawable.za6));
                photos.add(getResources().getDrawable(R.drawable.za7));
                break;
            case "Курица, тушенная в кисло-сладком соусе с болгарским перцем и морковью":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.zh1));
                photos.add(getResources().getDrawable(R.drawable.zh2));
                photos.add(getResources().getDrawable(R.drawable.zh3));
                photos.add(getResources().getDrawable(R.drawable.zh4));
                photos.add(getResources().getDrawable(R.drawable.z5));
                photos.add(getResources().getDrawable(R.drawable.z6));
                photos.add(getResources().getDrawable(R.drawable.z7));
                photos.add(getResources().getDrawable(R.drawable.z8));
                photos.add(getResources().getDrawable(R.drawable.z9));
                photos.add(getResources().getDrawable(R.drawable.z10));
                photos.add(getResources().getDrawable(R.drawable.zh11));
                photos.add(getResources().getDrawable(R.drawable.zh12));
                photos.add(getResources().getDrawable(R.drawable.zh13));
                break;
            case "Гречка по-купечески":
                photos.add(null);
                photos.add(null);
                photos.add(null);
                photos.add(null);
                photos.add(null);
                photos.add(null);
                photos.add(null);
                photos.add(null);
                photos.add(null);
                photos.add(null);
                break;
            case "Картофель тушеный с мясом":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ka1));
                photos.add(getResources().getDrawable(R.drawable.ka2));
                photos.add(getResources().getDrawable(R.drawable.ka3));
                photos.add(getResources().getDrawable(R.drawable.ka4));
                photos.add(getResources().getDrawable(R.drawable.ka5));
                photos.add(getResources().getDrawable(R.drawable.ka6));
                photos.add(getResources().getDrawable(R.drawable.ka7));
                photos.add(getResources().getDrawable(R.drawable.ka8));
                photos.add(getResources().getDrawable(R.drawable.ka9));
                photos.add(getResources().getDrawable(R.drawable.ka10));
                photos.add(getResources().getDrawable(R.drawable.ka11));
                break;
            case "Жаркое из курицы с картошкой":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.zc1));
                photos.add(getResources().getDrawable(R.drawable.zc2));
                photos.add(getResources().getDrawable(R.drawable.zc3));
                photos.add(getResources().getDrawable(R.drawable.zc4));
                photos.add(getResources().getDrawable(R.drawable.zc5));
                photos.add(getResources().getDrawable(R.drawable.zc6));
                photos.add(getResources().getDrawable(R.drawable.zc7));
                photos.add(getResources().getDrawable(R.drawable.zc8));
                photos.add(getResources().getDrawable(R.drawable.zc9));
                photos.add(getResources().getDrawable(R.drawable.zc10));
                photos.add(getResources().getDrawable(R.drawable.zc11));
                photos.add(getResources().getDrawable(R.drawable.zc12));
                photos.add(getResources().getDrawable(R.drawable.zc13));
                photos.add(getResources().getDrawable(R.drawable.zc14));
                photos.add(getResources().getDrawable(R.drawable.zc15));
                photos.add(getResources().getDrawable(R.drawable.zc16));
                break;
            case "Быстрый плов":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.f1));
                photos.add(getResources().getDrawable(R.drawable.f2));
                photos.add(getResources().getDrawable(R.drawable.f3));
                photos.add(getResources().getDrawable(R.drawable.f4));
                photos.add(getResources().getDrawable(R.drawable.f5));
                photos.add(getResources().getDrawable(R.drawable.f6));
                photos.add(getResources().getDrawable(R.drawable.f7));
                photos.add(getResources().getDrawable(R.drawable.f8));
                photos.add(getResources().getDrawable(R.drawable.f9));
                photos.add(getResources().getDrawable(R.drawable.f10));
                photos.add(getResources().getDrawable(R.drawable.f11));
                photos.add(getResources().getDrawable(R.drawable.f12));
                photos.add(getResources().getDrawable(R.drawable.f13));
                photos.add(getResources().getDrawable(R.drawable.f14));
                break;
            case "Картошка, тушенная с курицей":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.kt1));
                photos.add(getResources().getDrawable(R.drawable.kt2));
                photos.add(getResources().getDrawable(R.drawable.kt3));
                photos.add(getResources().getDrawable(R.drawable.kt4));
                photos.add(getResources().getDrawable(R.drawable.kt5));
                photos.add(getResources().getDrawable(R.drawable.kt6));
                photos.add(getResources().getDrawable(R.drawable.kt7));
                photos.add(getResources().getDrawable(R.drawable.kt8));
                photos.add(getResources().getDrawable(R.drawable.kt9));
                photos.add(getResources().getDrawable(R.drawable.kt10));
                photos.add(getResources().getDrawable(R.drawable.kt11));
                photos.add(getResources().getDrawable(R.drawable.kt12));
                photos.add(getResources().getDrawable(R.drawable.kt13));
                break;
            case "Рулет \"Баунти\" (без выпечки)":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ru1));
                photos.add(getResources().getDrawable(R.drawable.ru2));
                photos.add(getResources().getDrawable(R.drawable.ru3));
                photos.add(getResources().getDrawable(R.drawable.ru4));
                photos.add(getResources().getDrawable(R.drawable.ru5));
                photos.add(getResources().getDrawable(R.drawable.ru6));
                photos.add(getResources().getDrawable(R.drawable.ru7));
                photos.add(getResources().getDrawable(R.drawable.ru8));
                break;
            case "Шоколадный фондан":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ch1));
                photos.add(getResources().getDrawable(R.drawable.ch2));
                photos.add(getResources().getDrawable(R.drawable.ch1));
                photos.add(getResources().getDrawable(R.drawable.ch4));
                photos.add(getResources().getDrawable(R.drawable.ch5));
                photos.add(getResources().getDrawable(R.drawable.ch6));
                photos.add(getResources().getDrawable(R.drawable.ch7));
                photos.add(getResources().getDrawable(R.drawable.ch8));
                photos.add(getResources().getDrawable(R.drawable.ch9));
                photos.add(getResources().getDrawable(R.drawable.ch10));
                photos.add(getResources().getDrawable(R.drawable.ch11));
                photos.add(getResources().getDrawable(R.drawable.ch12));
                photos.add(getResources().getDrawable(R.drawable.ch13));
                photos.add(getResources().getDrawable(R.drawable.ch14));
                photos.add(getResources().getDrawable(R.drawable.ch15));
                break;
            case "Шоколадно-сметанный мусс":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.mu1));
                photos.add(getResources().getDrawable(R.drawable.mu2));
                photos.add(getResources().getDrawable(R.drawable.mu3));
                photos.add(getResources().getDrawable(R.drawable.mu4));
                photos.add(getResources().getDrawable(R.drawable.mu5));
                photos.add(getResources().getDrawable(R.drawable.mu6));
                photos.add(getResources().getDrawable(R.drawable.mu7));
                photos.add(getResources().getDrawable(R.drawable.mu8));
                photos.add(getResources().getDrawable(R.drawable.mu9));
                photos.add(getResources().getDrawable(R.drawable.mu10));
                photos.add(getResources().getDrawable(R.drawable.mu11));
                photos.add(getResources().getDrawable(R.drawable.mu12));
                photos.add(getResources().getDrawable(R.drawable.mu13));
                photos.add(getResources().getDrawable(R.drawable.m14));
                break;
            case "Домашнее мороженое из молока (без сливок и банана)":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ice1));
                photos.add(getResources().getDrawable(R.drawable.ice2));
                photos.add(getResources().getDrawable(R.drawable.ice3));
                photos.add(getResources().getDrawable(R.drawable.ice4));
                photos.add(getResources().getDrawable(R.drawable.ice5));
                photos.add(getResources().getDrawable(R.drawable.ice6));
                photos.add(getResources().getDrawable(R.drawable.ice7));
                break;
            case "Шоколадные маффины \"Брауни\" с влажной серединкой":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.br1));
                photos.add(getResources().getDrawable(R.drawable.br2));
                photos.add(getResources().getDrawable(R.drawable.br3));
                photos.add(getResources().getDrawable(R.drawable.br4));
                photos.add(getResources().getDrawable(R.drawable.br5));
                photos.add(getResources().getDrawable(R.drawable.br6));
                photos.add(getResources().getDrawable(R.drawable.br7));
                photos.add(getResources().getDrawable(R.drawable.br8));
                photos.add(getResources().getDrawable(R.drawable.br9));
                photos.add(getResources().getDrawable(R.drawable.br10));
                photos.add(getResources().getDrawable(R.drawable.rb11));
                photos.add(getResources().getDrawable(R.drawable.br12));
                break;
            case "Классический чизкейк":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.chease1));
                photos.add(getResources().getDrawable(R.drawable.chease2));
                photos.add(getResources().getDrawable(R.drawable.chease3));
                break;
            case "Японский десерт \"Моти\"":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.mo1));
                photos.add(getResources().getDrawable(R.drawable.mo2));
                photos.add(getResources().getDrawable(R.drawable.mo3));
                photos.add(getResources().getDrawable(R.drawable.mo4));
                photos.add(getResources().getDrawable(R.drawable.mo5));
                photos.add(getResources().getDrawable(R.drawable.mo6));
                photos.add(getResources().getDrawable(R.drawable.mo7));
                photos.add(getResources().getDrawable(R.drawable.mo8));
                photos.add(getResources().getDrawable(R.drawable.mo9));
                photos.add(getResources().getDrawable(R.drawable.mo10));
                break;
            case "Ленивые вареники с картофелем и творогом":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.va1));
                photos.add(getResources().getDrawable(R.drawable.va2));
                photos.add(getResources().getDrawable(R.drawable.va3));
                photos.add(getResources().getDrawable(R.drawable.va4));
                photos.add(getResources().getDrawable(R.drawable.va5));
                photos.add(getResources().getDrawable(R.drawable.va6));
                photos.add(getResources().getDrawable(R.drawable.va7));
                photos.add(getResources().getDrawable(R.drawable.va8));
                photos.add(getResources().getDrawable(R.drawable.va9));
                break;
            case "Фунчоза с курицей и овощами":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.fu1));
                photos.add(getResources().getDrawable(R.drawable.fu2));
                photos.add(getResources().getDrawable(R.drawable.fu3));
                photos.add(getResources().getDrawable(R.drawable.fu4));
                photos.add(getResources().getDrawable(R.drawable.fu5));
                photos.add(getResources().getDrawable(R.drawable.fu6));
                photos.add(getResources().getDrawable(R.drawable.fu7));
                photos.add(getResources().getDrawable(R.drawable.fu8));
                photos.add(getResources().getDrawable(R.drawable.fu9));
                photos.add(getResources().getDrawable(R.drawable.fu10));
                photos.add(getResources().getDrawable(R.drawable.fu11));
                photos.add(getResources().getDrawable(R.drawable.fu12));
                break;
            case "Коктейль \"Мохито\" безалкогольный":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ma1));
                photos.add(getResources().getDrawable(R.drawable.ma2));
                photos.add(getResources().getDrawable(R.drawable.ma3));
                photos.add(getResources().getDrawable(R.drawable.ma4));
                photos.add(getResources().getDrawable(R.drawable.ma5));
                photos.add(getResources().getDrawable(R.drawable.ma6));
                photos.add(getResources().getDrawable(R.drawable.ma7));
                break;
            case "Лимонад":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.le1));
                photos.add(getResources().getDrawable(R.drawable.le2));
                photos.add(getResources().getDrawable(R.drawable.le3));
                photos.add(getResources().getDrawable(R.drawable.le4));
                photos.add(getResources().getDrawable(R.drawable.le5));
                photos.add(getResources().getDrawable(R.drawable.le6));
                photos.add(getResources().getDrawable(R.drawable.le7));
                break;
            case "Освежающий домашний лимонад (три рецепта)":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.re1));
                photos.add(getResources().getDrawable(R.drawable.re2));
                photos.add(getResources().getDrawable(R.drawable.re3));
                photos.add(getResources().getDrawable(R.drawable.re4));
                photos.add(getResources().getDrawable(R.drawable.re5));
                photos.add(getResources().getDrawable(R.drawable.re6));
                photos.add(getResources().getDrawable(R.drawable.re7));
                photos.add(getResources().getDrawable(R.drawable.re8));
                photos.add(getResources().getDrawable(R.drawable.re9));
                photos.add(getResources().getDrawable(R.drawable.re10));
                photos.add(getResources().getDrawable(R.drawable.re11));
                photos.add(getResources().getDrawable(R.drawable.re12));
                break;
            case "Фруктовый милк-шейк":
                photos.add(null);
                photos.add(null);
                break;
            case "Мятный горячий шоколад":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.mi1));
                photos.add(getResources().getDrawable(R.drawable.mi2));
                photos.add(getResources().getDrawable(R.drawable.mi3));
                photos.add(getResources().getDrawable(R.drawable.mi4));
                photos.add(getResources().getDrawable(R.drawable.mi5));
                photos.add(getResources().getDrawable(R.drawable.mi6));
                photos.add(getResources().getDrawable(R.drawable.mi7));
                photos.add(getResources().getDrawable(R.drawable.mi8));
                break;
            case "Смузи \"Страсть вампира\"":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.smu1));
                photos.add(getResources().getDrawable(R.drawable.smu2));
                photos.add(getResources().getDrawable(R.drawable.smu3));
                break;
            case "Домашняя кола из цикория и сиропа":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ko1));
                photos.add(getResources().getDrawable(R.drawable.ko2));
                photos.add(getResources().getDrawable(R.drawable.ko3));
                photos.add(getResources().getDrawable(R.drawable.ko4));
                photos.add(getResources().getDrawable(R.drawable.ko5));
                photos.add(getResources().getDrawable(R.drawable.ko6));
                photos.add(getResources().getDrawable(R.drawable.ko7));
                break;
            case "Соус ранч":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.rh1));
                photos.add(getResources().getDrawable(R.drawable.rh2));
                photos.add(getResources().getDrawable(R.drawable.rh3));
                photos.add(getResources().getDrawable(R.drawable.rh4));
                break;
            case "Чесночный соус":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.he1));
                photos.add(getResources().getDrawable(R.drawable.he2));
                photos.add(getResources().getDrawable(R.drawable.he3));
                photos.add(getResources().getDrawable(R.drawable.he4));
                photos.add(getResources().getDrawable(R.drawable.he5));
                photos.add(getResources().getDrawable(R.drawable.he6));
                break;
            case "Соус тартар":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ta1));
                photos.add(getResources().getDrawable(R.drawable.ta2));
                photos.add(getResources().getDrawable(R.drawable.ta3));
                photos.add(getResources().getDrawable(R.drawable.ta4));
                break;
            case "Красный соус для шашлыка (по-армянски)":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.ket1));
                photos.add(getResources().getDrawable(R.drawable.kte2));
                photos.add(getResources().getDrawable(R.drawable.ket3));
                photos.add(getResources().getDrawable(R.drawable.ket4));
                photos.add(getResources().getDrawable(R.drawable.ket5));
                photos.add(getResources().getDrawable(R.drawable.ket6));
                break;
            case "Салат \"Красное море\"":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.sal1));
                photos.add(getResources().getDrawable(R.drawable.sal2));
                photos.add(getResources().getDrawable(R.drawable.sal3));
                photos.add(getResources().getDrawable(R.drawable.sal4));
                photos.add(getResources().getDrawable(R.drawable.sal5));
                photos.add(getResources().getDrawable(R.drawable.sal6));
                photos.add(getResources().getDrawable(R.drawable.sal7));
                photos.add(getResources().getDrawable(R.drawable.sal8));
                photos.add(getResources().getDrawable(R.drawable.sal9));
                break;
            case "Горячие бутерброды (мини-пиццы)":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.pi1));
                photos.add(getResources().getDrawable(R.drawable.pi2));
                photos.add(getResources().getDrawable(R.drawable.pi3));
                photos.add(getResources().getDrawable(R.drawable.pi4));
                photos.add(getResources().getDrawable(R.drawable.pi5));
                photos.add(getResources().getDrawable(R.drawable.pi6));
                photos.add(getResources().getDrawable(R.drawable.pi7));
                photos.add(getResources().getDrawable(R.drawable.pi8));
                photos.add(getResources().getDrawable(R.drawable.pi9));
                break;
            case "Картофель пай":
                photos.add(null);
                photos.add(getResources().getDrawable(R.drawable.kar1));
                photos.add(getResources().getDrawable(R.drawable.kar2));
                photos.add(getResources().getDrawable(R.drawable.kar3));
                photos.add(getResources().getDrawable(R.drawable.kar4));
                photos.add(getResources().getDrawable(R.drawable.kar5));
                photos.add(getResources().getDrawable(R.drawable.kar6));
                photos.add(getResources().getDrawable(R.drawable.kar7));
                break;
        }

    }
}