package com.example.nuuuuuuuuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class Snacks extends AppCompatActivity {
    ArrayList<ListData> list;
    ListViewAdapter adapter;
    ListView sanacksListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_snacks);
        addinfo();
        makeWork();
    }
    private void addinfo(){
        sanacksListView = findViewById(R.id.sanacksListView);
        list = new ArrayList<>();
        //list.add(new ListData("",getResources().getDrawable(R.drawable.obed),"","",""));
        list.add(new ListData("Картофель пай",getResources().getDrawable(R.drawable.kartofel),"Картофель - 250 г\n" +
                "Масло растительное - 150 мл\n" +
                "Соль - 1/2 ч. ложки","",
                "Шаг №1\n" +
                        "Подготовьте продукты.\n" +
                        "\n" +"Шаг №2\n" +
                        "Как приготовить картофель пай:\n" +
                        "\n" +
                        "Очистите картофель.\n" +
                        "\n" +"Шаг №3\n" +
                        "Натрите его на терке для моркови по-корейски.\n" +
                        "\n" +"Шаг №4\n" +
                        "Выложите натертый картофель в дуршлаг и промойте под краном проточной водой. Дайте стечь лишней жидкости.\n" +
                        "\n" +"Шаг №5\n" +
                        "Затем хорошо посолите картофель.\n" +
                        "\n" +"Шаг №6\n" +
                        "Обжарьте его, выкладывая по чуть-чуть в разогретое растительное масло.\n" +
                        "\n" +"Шаг №7\n" +
                        "Подавайте картофель пай с вашим любимым соусом или просто так. Приятного аппетита!\n"));
        list.add(new ListData("Горячие бутерброды (мини-пиццы)",getResources().getDrawable(R.drawable.minipizza),"Батон - 6-8 ломтиков\n" +
                "Колбаса (вареная и копчёная) - 150 г\n" +
                "Помидор - 1 шт.\n" +
                "Сыр - 100 г\n" +
                "Укроп свежий - 1 пучок\n" +
                "Майонез - 2 ст. ложки","",
                "Шаг №1\n" +
                        "Помидор мелко нарезаем.\n" +
                        "\n" +"Шаг №2\n" +
                        "Мелко нарезаем колбаску двух видов - вареную и копченую.\n" +
                        "\n" +"Шаг №3\n" +
                        "Сыр натираем на мелкой терке.\n" +
                        "\n" +"Шаг №4\n" +
                        "Мелко нарезаем зелень.\n" +
                        "\n" +"Шаг №5\n" +
                        "Соединяем нарезанные продукты, добавляем майонез.\n" +
                        "\n" +"Шаг №6\n" +
                        "Тщательно перемешиваем начинку для бутербродов.\n" +
                        "\n" +"Шаг №7\n" +
                        "Батон нарезаем ломтиками.\n" +
                        "\n" +"Шаг №8\n" +
                        "Выкладываем начинку (по 1-2 ложки) на ломтики хлеба.\n" +
                        "Ставим мини-пиццы из хлеба с колбасой, помидорами и сыром в разогретую духовку на 6-7 минут.\n" +
                        "\n" +"Шаг №9\n" +
                        "Горячие бутерброды готовы. Приятного аппетита!\n"));
        list.add(new ListData("Салат \"Красное море\"",getResources().getDrawable(R.drawable.salatttttt),"Крабовые палочки - 250-300 г\n" +
                "Помидоры – 1-2 шт.\n" +
                "Сыр – 100-200 г\n" +
                "Чеснок — 1-3 зубчика\n" +
                "Соль (по желанию) - по вкусу\n" +
                "Майонез - по вкусу","10мин",
                "Шаг №1\n" +
                        "Продукты для салата \"Красное море\" перед вами.\n" +
                        "\n" +"Шаг №2\n" +
                        "Как приготовить салат \"Красное море\":\n" +
                        "\n" +
                        "Сыр твердый натереть на крупной терке.\n" +
                        "\n" +"Шаг №3\n" +
                        "Помыть и нарезать помидоры соломкой.\n" +
                        "\n" +"Шаг №4\n" +
                        "Крабовые палочки нарезать тонкими колечками.\n" +
                        "\n" +"Шаг №5\n" +
                        "Чеснок очистить и мелко нарезать ножом.\n" +
                        "\n" +"Шаг №6\n" +
                        "Все продукты соединить в миске. Посолить по вкусу.\n" +
                        "\n" +"Шаг №7\n" +
                        "Салат \"Красное море\" заправить майонезом.\n" +
                        "\n" +"Шаг №8\n" +
                        "Хорошо перемешать салат.\n" +
                        "\n" +"Шаг №9\n" +
                        "Салат \"Красное море\" готов.\n" +
                        "Приятного аппетита!\n"));
        adapter = new ListViewAdapter(this,list);
        sanacksListView.setAdapter(adapter);
    }
    private void makeWork() {
        sanacksListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Snacks.this, Pokaz.class);
                intent.putExtra("name", list.get(i).getName());
                Bitmap bitmap = ((BitmapDrawable) list.get(i).getDrawable()).getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, stream);
                String imgString = Base64.encodeToString(stream.toByteArray(), Base64.NO_WRAP);
                intent.putExtra("image", imgString);
                intent.putExtra("time", list.get(i).getTime());
                intent.putExtra("steps", list.get(i).getSteps());
                intent.putExtra("ingredients", list.get(i).getIngredients());
                startActivity(intent);
            }
        });
    }
}