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

public class Sauce extends AppCompatActivity {
    ArrayList<ListData> list;
    ListViewAdapter adapter;
    ListView sauceListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_sauce);
        addinfo();
        makeWork();
    }
    private void addinfo(){
        sauceListView = findViewById(R.id.sauceListView);
        list = new ArrayList<>();
        //list.add(new ListData("",getResources().getDrawable(R.drawable.obed),"","",""));
        list.add(new ListData("Красный соус для шашлыка (по-армянски)",getResources().getDrawable(R.drawable.poarmany),"Томатная паста – 200 г\n" +
                "Вода – 200 мл\n" +
                "Лук репчатый – 1 шт.\n" +
                "Чеснок – 5 зубчиков\n" +
                "Кинза – 1 пучок\n" +
                "Базилик свежий – 1 пучок\n" +
                "Перец свежемолотый\n" +
                "Соль","",
                "Шаг №1\n" +"Подготавливаем ингредиенты, которые нам потребуются для приготовления армянского соуса к шашлыку.\n" +
                        "\n" +"Шаг №2\n" +
                        "Головку лука очищаем от шелухи и мелко нарезаем. Важно нарезать его действительно мелко, чтобы кусочки лука не чувствовались в соусе. Если вы не уверены в своих силах, то лучше будет натереть его на тёрке.\n" +
                        "\n" +"Шаг №3\n" +
                        "После лука займёмся кинзой. У неё необходимо отрезать стебли, они в приготовлении участвовать не будут, а саму зелень мелко нарезать.\n" +
                        "С веточек базилика снимаем листья. Складываем их вместе, выкладывая друг на друга, и сворачиваем трубочкой для удобства нарезки. Затем нарезаем так же мелко, как кинзу.\n" +
                        "\n" +"Шаг №4\n" +
                        "Последнее, что необходимо сделать при подготовке ингредиентов, это очистить зубчики чеснока от шелухи. Проще всего это сделать, отрезав у них нижнюю часть и ударив по каждому зубчику плоской стороной ножа. Тогда они охотно будут выскакивать из шелухи.\n" +
                        "\n" +"Шаг №5\n" +
                        "Ставим сковороду на средний огонь. Помещаем в неё томатную пасту. И вливаем воду. Перемешиваем их вместе и доводим смесь до кипения.\n" +
                        "После закипания добавляем в сковороду нарезанный лук, зелень, соль и свежемолотый перец. А также пропускаем чеснок через пресс для чеснока.\n" +
                        "Перемешиваем всё вместе и тушим армянский томатный соус 5 минут.\n" +
                        "\n" +"Шаг №6\n" +
                        "Даём томатному соусу с чесноком, луком и зеленью остыть, после чего подаём его к шашлыку.\n" +
                        "Приятного аппетита!\n"));
        list.add(new ListData("Соус тартар",getResources().getDrawable(R.drawable.tartar),"Сметана 20% – 100 г\n" +
                "Майонез – 100 г\n" +
                "Корнишоны маринованные – 6 шт.\n" +
                "Укроп свежий – 1 небольшой пучок\n" +
                "Чеснок – 2 зубчика\n" +
                "Соль\n" +
                "Перец свежемолотый","",
                "Шаг №1\n" +
                        "В глубокой миске смешиваем сметану и майонез.\n" +
                        "\n" +"Шаг №2\n" +
                        "На мелкой тёрке натираем маринованные корнишоны.\n" +
                        "Укроп мелко нарезаем.\n" +
                        "\n" +"Шаг №3\n" +
                        "Добавляем корнишоны и зелень в миску со сметаной и майонезом.\n" +
                        "Туда же пропускаем зубчики чеснока через пресс для чеснока. Добавляем немного свежемолотого перца. И соли. Перемешиваем все ингредиенты в миске.\n" +
                        "Даём соусу настояться 20-30 минут. И можно подавать его к столу.\n" +
                        "\n" +"Шаг №4\n" +
                        "Приятного аппетита!\n"));
        list.add(new ListData("Чесночный соус",getResources().getDrawable(R.drawable.chesnok),"Сметана жирная - 4-5 ст. л.\n" +
                "Соус соевый - 1 ст. л.\n" +
                "Сыр плавленый - 30 г\n" +
                "Укроп нарезанный - 1 ст. л.\n" +
                "Чеснок - 2 зубка\n" +
                "Соль - по вкусу\n" +
                "Перец черный молотый - по вкусу","",
                "Шаг №1\n" +
                        "Подготовить продукты для чесночного соуса.\n" +
                        "Фото приготовления рецепта: Чесночный соус - шаг №2\n" +
                        "\n" +"Шаг №2\n" +
                        "Как приготовить чесночный соус:\n" +
                        "\n" +
                        "В сметану добавить соевый соус, укроп, соль, перец. Перемешать.\n" +
                        "\n" +"Шаг №3\n" +
                        "Плавленый сыр натереть на мелкой терке.\n" +
                        "\n" +"Шаг №4\n" +
                        "Чеснок очистить. Добавить в соус сыр и спрессовать чеснок.\n" +
                        "\n" +"Шаг №5\n" +
                        "Тщательно перемешать чесночный соус.\n" +
                        "\n" +"Шаг №6\n" +
                        "Готовый чесночный соус лучше всего подавать к горячей жареной картошке. Приятного аппетита!\n"));
        list.add(new ListData("Соус ранч",getResources().getDrawable(R.drawable.ranch),"Сметана 20% - 200 г\n" +
                "Укроп свежий – 10 г\n" +
                "Петрушка свежая - 10 г\n" +
                "Зеленый лук – 10 г\n" +
                "Чеснок - 2 зубчика\n" +
                "Сок лимона – 1-2 ч. л.\n" +
                "Паприка сладкая – 0,5 ч. л.\n" +
                "Горчичный порошок – 0,5 ч. л.\n" +
                "Сахар – 1 ч. л.\n" +
                "Перец свежемолотый\n" +
                "Соль","",
                "Шаг №1\n" +"Приготовление соуса начинаем с того, что мелко нарезаем укроп, петрушку и зелёный лук. Чтобы соус был максимально ароматным и однородным, старайтесь измельчить зелень как можно лучше.\n" +
                        "\n" +"Шаг №2\n" +
                        "Берём сметану и пропускаем в неё чеснок через пресс для чеснока. Кстати, использование сметаны - это простой путь приготовления соуса ранч. Если вы хотите получить тот самый аутентичный вкус, то вместо сметаны следует использовать смесь пахты и майонеза, однако найти пахту можно далеко не везде.\n" +
                        "К сметане и чесноку добавляем мелко нарезанную зелень, сладкую паприку, горчичный порошок, свежемолотый перец. А также, соль. Для баланса вкуса обязательно надо добавить 1 ч. л. сахара.\n" +
                        "\n" +"Шаг №3\n" +
                        "Соус отлично украсит небольшая кислинка, для этого обычно используют лимонный сок.\n" +
                        "\n" +"Шаг №4\n" +
                        "Перемешиваем соус и убираем в холодильник на 1 час. После этого он будет готов.\n" +
                        "Приятного аппетита!\n"));


        adapter = new ListViewAdapter(this,list);
        sauceListView.setAdapter(adapter);
    }
    private void makeWork() {
        sauceListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Sauce.this, Pokaz.class);
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