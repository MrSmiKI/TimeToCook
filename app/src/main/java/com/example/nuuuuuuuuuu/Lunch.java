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

public class Lunch extends AppCompatActivity {
    ArrayList<ListData> list;
    ListViewAdapter adapter;
    ListView lunchListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_lunch);
        addinfo();
        makeWork();
    }
    private void addinfo(){
        lunchListView = findViewById(R.id.lunchListView);
        list = new ArrayList<>();
        list.add(new ListData("Лагман с курицей",getResources().getDrawable(R.drawable.lagman),"Лапша - 60 г\n" +
                "Филе куриное - 300 г\n" +
                "Помидоры - 2 шт.\n" +
                "Перец болгарский - 1 шт.\n" +
                "Морковь - 2 шт.\n" +
                "Лук репчатый - 1-2 шт.\n" +
                "Томатная паста - 2 ст. ложки\n" +
                "Сахар - 1 ст. ложка\n" +
                "Соль - 3 щепотки\n" +
                "Перец черный молотый - 3 щепотки\n" +
                "Масло растительное - 40 мл\n" +
                "Зелень - по вкусу","35мин",
                "Шаг №1\n" +"Подготовьте все необходимые ингредиенты. Куриное филе промойте, обсушите, удалите пленки и жилы.\n" +
                "\n" +
                "\n" +"Шаг №2\n" +"Как приготовить лагман с курицей:"+"\n" +
                "Нарежьте куриное филе средними кусочками. Влейте в казан или на сковороду с высокими бортиками растительное масло и разогрейте его. Добавьте туда куриное филе и обжаривайте около 7-10 минут до румяной корочки.\n" +
                "\n" +"Шаг №3\n" +
                "Морковь и лук очистите, вымойте и нарежьте кубиками. Добавьте к курице и обжаривайте еще 5-7 минут до мягкости овощей.\n" +
                "\n" +"Шаг №4\n" +
                "Помидоры и болгарский перец вымойте, удалите из перца семена. Нарежьте овощи средними кубиками и добавьте в сковороду с курицей. Добавьте сахар и 2 щепотки соли. Перемешайте и тушите куриное филе с овощами около 15 минут на среднем огне.\n" +
                "\n" +"Шаг №5\n" +
                "В это время вскипятите воду в кастрюле, всыпьте щепотку соли и отварите лапшу до готовности, примерно 7-10 минут. Затем откиньте лапшу на дуршлаг и верните обратно в кастрюлю.\n" +
                "\n" +"Шаг №6\n" +
                "Добавьте к курице с овощами томатную пасту, молотый черный перец. Влейте 0,5 стакана воды, аккуратно все перемешайте. Тушите ровно 5 минут. (При желании можно добавить промытую и измельченную зелень.)\n" +
                "\n" +"Шаг №7\n" +
                "Выложите в глубокие тарелки отварную лапшу, на нее - подливу с курицей и овощами. Украсьте лагман с курицей зеленью и сразу же подавайте к столу!\n" +
                "Приятного аппетита!\n"));
        list.add(new ListData("Жаркое по-деревенски",getResources().getDrawable(R.drawable.zharkoe),"Свиная корейка без кости - 1 кг\n" +
                "Сало свиное свежее - 50 г\n" +
                "Масло сливочное - 50 г\n" +
                "Картофель - 1 кг\n" +
                "Перец болгарский - 1 шт.\n" +
                "Морковь - 2 шт.\n" +
                "Лук репчатый - 2 шт.\n" +
                "Чеснок - 2 зубчика\n" +
                "Зелень петрушки свежая - по вкусу\n" +
                "Зелень петрушки сушёная - по вкусу\n" +
                "Специи для мяса - по вкусу\n" +
                "Перец чёрный горошком - по вкусу\n" +
                "Перец чёрный молотый - по вкусу\n" +
                "Соль - по вкусу","60мин",
                "Шаг №1\n" +"В сотейнике растопить сало, нарезанное мелкими кубиками.\n" +
                "Добавить мясо, нарезанное небольшими кусочками. Обжарить до румяной корочки.\n" +
                "\n" +"Шаг №2\n" +
                "Затем добавить морковь, нарезанную кружочками. Обжаривать 5 минут.\n" +
                "\n" +"Шаг №3\n" +
                "Лук, нарезанный полукольцами. Обжаривать 5 минут.\n" +
                "\n" +"Шаг №4\n" +
                "Болгарский перец, нарезанный дольками. Ещё 5 минут.\n" +
                "\n" +"Шаг №5\n" +
                "Добавить крупно нарезанный картофель, кусочек сливочного масла, 200 мл воды, специи, сушёную петрушку и соль. Не перемешивать.\n" +
                "Накрыть крышкой, убавить огонь и тушить на медленном огне 40 минут.\n" +
                "\n" +"Шаг №6\n" +
                "В конце приготовления добавить нарезанную свежую зелень, измельчённый чеснок. Перемешать и снять с огня.\n" +
                "\n" +"Шаг №7\n" +"Приятного аппетита!\n"));
        //list.add(new ListData("",getResources().getDrawable(R.drawable.obed),"","",""));
        list.add(new ListData("Курица, тушенная в кисло-сладком соусе с болгарским перцем и морковью",getResources().getDrawable(R.drawable.lol),"Куриное филе - 2 шт. (500 г)\n" +
                "Перец сладкий - 1 шт. (150 г)\n" +
                "Морковь - 1 шт. (100 г)\n" +
                "Кетчуп томатный - 100 г\n" +
                "Перец острый молотый - 1 ч. ложка\n" +
                "или перец острый свежий - 0,5 шт. (по вкусу)\n" +
                "Сахар - 1 ст. ложка\n" +
                "Крахмал кукурузный - 1 ст. ложка\n" +
                "Соевый соус - 3 ст. ложки\n" +
                "Масло растительное - 1 ст. ложка\n" +
                "Имбирь свежий (корень) - 10 г\n" +
                "Кунжут (семена) - 1 ч. ложка","30мин","Шаг №1\n" +"Подготовьте все необходимые ингредиенты.\n" +
                "Блюдо готовится быстро, поэтому всё должно быть под рукой.\n" +
                "Вместо острого молотого перца можно взять свежий острый перец. Вымойте, очистите и нарежьте его колечками.\n" +
                "\n" +"Шаг №2\n" +
                "Куриное филе нарежьте небольшими кубиками размером примерно 2х2 см.\n" +
                "\n" +"Шаг №3\n" +
                "Сладкий перец очистите от семян и хвостика и нарежьте кусочками примерно такого же размера, как и куриное филе. Морковь очистите и нарежьте полукружиями.\n" +
                "\n" +"Шаг №4\n" +
                "Разогрейте в сковороде с толстым дном или сотейнике растительное масло. Обжарьте на нём куриное филе на сильном огне до выпаривания жидкости, примерно 7-8 минут.\n" +
                "\n" +"Шаг №5\n" +
                "Добавьте в сковороду морковь и перец, обжарьте всё вместе на среднем огне ещё 5-7 минут, помешивая.\n" +
                "\n" +"Шаг №6\n" +
                "Имбирь натрите на мелкой тёрке.\n" +
                "Добавьте в сковороду острый молотый перец (или колечки острого перца) и имбирь.\n" +
                "\n" +"Шаг №7\n" +
                "Переложите в сковороду томатный кетчуп, перемешайте.\n" +
                "\n" +"Шаг №8\n" +
                "Добавьте соевый соус, перемешайте и тушите на среднем огне 5-7 минут.\n" +
                "\n" +"Шаг №9\n" +
                "Добавьте в сковороду сахар и крахмал, перемешайте. Прогрейте блюдо на небольшом огне ещё 2 минуты, до загустения соуса.\n" +
                "\n" +"Шаг №10\n" +
                "Курица, тушенная в кисло-сладком соусе с болгарским перцем и морковью, готова.\n" +
                "Снимите сковороду с огня.\n" +
                "\n" +"Шаг №11\n" +
                "Присыпьте курицу с овощами семенами кунжута.\n" +
                "\n" +"Шаг №12\n" +
                "Такое блюдо из курицы замечательно сочетается с отварным рисом. Нежные кусочки куриного филе и сочные овощи в оригинальном кисло-сладком соусе с остринкой - идеально!\n" +
                "\n" +"Шаг №13\n" +
                "Быстро, вкусно, недорого!\n" +
                "Приятного аппетита!\n"));
        list.add(new ListData("Гречка по-купечески",getResources().getDrawable(R.drawable.kupecho),"Гречневая крупа - 1 стакан\n" +
                "Фарш мясной - 300 г\n" +
                "Лук репчатый - 1 шт.\n" +
                "Морковь - 1 шт.\n" +
                "Чеснок - 2 зубка\n" +
                "Паста томатная - 2 ст. ложки\n" +
                "Масло подсолнечное - 20 г\n" +
                "Соль - по вкусу","1час",
                "Шаг №1\n" +"Гречку промыть. Смазать сковороду маслом (можно даже сливочным) и высыпать туда крупу, подсушить на среднем огне.\n" +
                        "\n" +"Шаг №2\n" +
                        "Натереть морковь, порезать лук (это можно делать во время \"сушки\" гречневой крупы). Обжарить в растительном масле до золотистого цвета.\n" +
                        "\n" +"Шаг №3\n" +
                        "Далее добавляем фарш, разбивая комочки.\n" +
                        "\n" +"Шаг №4\n" +
                        "И в конце добавить томатную пасту (или порезанные помидоры БЕЗ кожицы). Тщательно перемешать. И жарить на среднем огне минут 5 (пока фарш не потемнеет)\n" +
                        "\n" +"Шаг №5\n" +
                        "К мясу и овощам выложить гречку.\n" +
                        "\n" +"Шаг №6\n" +
                        "Залить кипятком так, чтобы гречка была слегка прикрыта водой. Посолить.\n" +
                        "\n" +"Шаг №7\n" +
                        "Тушить гречку по-купечески на медленном огне под крышкой, пока вода не испарится. Если гречка еще не готова, долить еще немного воды, повторить действия.\n" +
                        "\n" +"Шаг №8\n" +
                        "В готовую гречку по-купечески добавить мелко порезанный чеснок (или использовать чесночницу), перемешать. Можно добавить черный молотый перец и лавровый лист.\n" +
                        "\n" +"Шаг №9\n" +
                        "Подавать гречку по-купечески горячей."));
        list.add(new ListData("Картофель тушеный с мясом",getResources().getDrawable(R.drawable.kartoha),"Свиные рёбрышки - 500 г\n" +
                "Картофель - 1 кг\n" +
                "Лук репчатый - 1-2 шт.\n" +
                "Морковь - 1-2 шт.\n" +
                "Лавровый лист - 1-2 шт. (по вкусу)\n" +
                "Перец чёрный молотый - 0,25 ч. ложки (по вкусу)\n" +
                "Соль - 1 ч. ложка (по вкусу)\n" +
                "Вода горячая или бульон мясной - 200 мл","1час",
                "Шаг №1\n" +"Подготовить продукты.\n" +
                        "\n" +"Шаг №2\n" +
                        "Ребрышки разрезать на порционные кусочки, посолить, поперчить.\n" +
                        "\n" +"Шаг №3\n" +
                        "Растопить в толстостенной сковороде или казане сливочное масло. Выложить ребрышки.\n" +
                        "\n" +"Шаг №4\n" +
                        "Ребрышки обжарить на масле на среднем огне до готовности, периодически переворачивая (20-25 минут).\n" +
                        "\n" +"Шаг №5\n" +
                        "Картофель очистить. Если клубни крупные, разрезать их на части.\n" +
                        "\n" +"Шаг №6\n" +
                        "Картофель залить водой и поставить вариться. Варить на небольшом огне 15-20 минут.\n" +
                        "\n" +"Шаг №7\n" +
                        "Лук и морковь очистить. Лук нарезать мелкими кубиками. Морковь натереть на крупной терке или нарезать тонкой соломкой.\n" +
                        "\n" +"Шаг №8\n" +
                        "Когда мясо будет готово, выложить его из сковороды. В той же сковороде, в которой жарилось мясо, обжарить лук и морковь. Обжаривать на среднем огне, помешивая, 2-3 минуты.\n" +
                        "\n" +"Шаг №9\n" +
                        "Из кастрюли с отварным картофелем слить воду.\n" +
                        "\n" +"Шаг №10\n" +
                        "К отварному картофелю в кастрюле добавить обжаренные овощи и мясо. Влить горячую воду или бульон. Добавить соль, перец и лавровый лист. Тушить картошку со свиными ребрышками 5-7 минут.\n" +
                        "\n" +"Шаг №11\n" +"Приятного аппетита!\n"));
        list.add(new ListData("Жаркое из курицы с картошкой",getResources().getDrawable(R.drawable.zarkoego),"Куриное филе (бедра) - 500 г (3 шт.)\n" +
                "Картофель - 600 г\n" +
                "Перец болгарский красный - 200 г\n" +
                "Помидор - 100 г\n" +
                "Лук репчатый - 130 г\n" +
                "Чеснок (некрупный) - 4 зубчика\n" +
                "Петрушка свежая - 20 г\n" +
                "Укроп свежий - 10 г\n" +
                "Соль - по вкусу\n" +
                "Перец чёрный молотый - по вкусу\n" +
                "Паприка молотая - 1 ч. ложка\n" +
                "Масло растительное - 60-75 мл (4-5 ст. ложек)","55мин",
                "Шаг №1\n" +"Подготовьте продукты по списку. Филе куриного бедра можно заменить грудкой или другой частью курицы. Количество сухих ингредиентов и чеснока регулируйте по своему вкусу.\n" +
                "Картофель, лук и чеснок очистите.\n" +
                "\n" +"Шаг №2\n" +
                "Куриное мясо нарежьте небольшими кусочками.\n" +
                "\n" +"Шаг №3\n" +
                "Курицу переложите в миску, добавьте по 0,5 ч. ложки соли и паприки, 2 щепотки чёрного перца и 1 ст. ложку растительного масла. Перемешайте.\n" +
                "\n" +"Шаг №4\n" +
                "В глубокую широкую сковороду влейте оставшееся масло и разогрейте, выложите куриное мясо.\n" +
                "\n" +"Шаг №5\n" +
                "Обжарьте курицу со всех сторон на среднем огне 10-12 минут, периодически помешивая. Затем переложите на тарелку.\n" +
                "\n" +"Шаг №6\n" +
                "Пока жарится курица, лук нарежьте тонкими полукольцами, картофель – четвертинками.\n" +
                "\n" +"Шаг №7\n" +
                "В оставшееся в сковороде масло выложите картошку и обжарьте на среднем огне 12-14 минут.\n" +
                "\n" +"Шаг №8\n" +
                "Сладкий перец очистите, нарежьте тонкими пластинками, помидор – средними кусочками. Очищенный чеснок, зелень петрушки и укропа мелко порубите ножом.\n" +
                "\n" +"Шаг №9\n" +
                "Картофель тем временем стал золотистым, почти готовым. Выложите его на тарелку.\n" +
                "\n" +"Шаг №10\n" +
                "В сковороду отправьте лук, обжарьте 5 минут, помешивая.\n" +
                "\n" +"Шаг №11\n" +
                "Добавьте сладкий перец и перемешайте. Обжаривайте ещё 5 минут, периодически помешивая.\n" +
                "\n" +"Шаг №12\n" +
                "К обжаренным луку и перцу переложите картофель и курицу. Добавьте помидоры, чеснок и зелень. Перемешайте.\n" +
                "\n" +"Шаг №13\n" +
                "Добавьте соль (1 ч. ложка), чёрный молотый перец (0,25 ч. ложки), молотую паприку (0,5 ч. ложки), перемешайте. Накройте сковороду крышкой.\n" +
                "\n" +"Шаг №14\n" +
                "Готовьте на среднем огне 7-10 минут, до полной готовности мяса птицы и овощей.\n" +
                "\n" +"Шаг №15\n" +
                "Жаркое из курицы с картошкой готово.\n" +"\n" +"Шаг №16\n" +
                "Приятного аппетита!\n"));
        list.add(new ListData("Быстрый плов",getResources().getDrawable(R.drawable.plovfast),"Рис - 350 г\n" +
                "Мясо (свинина) - 350 г\n" +
                "Морковь - 2-3 шт.\n" +
                "Лук средний - 2 шт.\n" +
                "Томатная паста (по желанию) - 30 мл\n" +
                "Чеснок - 2 зубчика\n" +
                "Масло растительное - 75 мл\n" +
                "Соль - по вкусу\n" +
                "Перец черный молотый - по вкусу","30мин",
                "Шаг №1\n" +"Подготовим продукты для быстрого плова в сковороде.\n" +
                        "Важно! Рис, мясо и морковь, нарезанную соломкой, взять в равном объеме, для чего я использую одинаковые чашки.\n" +
                        "Желательно сразу отлить нужное количество растительного масла в стакан для удобства.\n" +
                        "Томат (разведённую в воде томатную пасту) можно не добавлять вообще (это по желанию и настроению).\n" +
                        "Рис, предварительно вымыв 5 раз, заливаем кипяченной водой минимум на 3 часа (можно оставить на ночь), это зависит от вашего распорядка дня. Перед приготовлением мы сливаем воду с риса и промываем его еще раз.\n" +
                        "Мясо режем кубиками среднего размера.\n" +
                        "Морковь обязательно нарезаем соломкой.\n" +
                        "Лук мелко нарезаем.\n" +
                        "Очищаем два зубчика чеснока и приступаем к приготовлению.\n" +
                        "\n" +"Шаг №2\n" +
                        "Как приготовить быстрый плов на сковороде:\n" +
                        "Берем сковороду с плотно прилегающей крышкой. Наливаем в нее немного масла из нашего стаканчика. И обжариваем мясо под крышкой до получения золотистой корочки. Обжариваем мясо на сильном огне 5-6 минут. Когда мы видим, что золотистая корочка образуется, можно мясо подсолить и поперчить.\n" +
                        "\n" +"Шаг №3\n" +
                        "Тем временем ставим воду для закипания. Воды нужно закипятить примерно полторы кружки от той, которую мы использовали для замера наших компонентов.\n" +
                        "\n" +"Шаг №4\n" +
                        "Когда мы видим золотистую корочку на кубиках мяса, добавляем растительное масло из нашего стаканчика и выкладываем к мясу порезанный лук.\n" +
                        "\n" +"Шаг №5\n" +
                        "Хорошо перемешиваем, накрываем крышкой и жарим пару минут.\n" +
                        "\n" +"Шаг №6\n" +
                        "Открываем крышку, перемешиваем мясо с луком, доливаем растительное масло из нашего стаканчика и выкладываем нарезанную соломкой морковь.\n" +
                        "\n" +"Шаг №7\n" +
                        "Все хорошо перемешиваем. Теперь можно еще немного подсолить и поперчить. Закрываем крышкой и обжариваем в течение 2-х минут.\n" +
                        "\n" +"Шаг №8\n" +
                        "Пока обжаривается морковь, мы делаем заливку. Томат заливаем кипяченой водой, которую подготовили во время обжаривания лука.\n" +
                        "\n" +"Шаг №9\n" +
                        "Через пару минут открываем крышку, перемешиваем морковь. Вливаем остаток растительного масла из нашего стаканчика и добавляем промытый после отстаивания рис.\n" +
                        "\n" +"Шаг №10\n" +
                        "В рис вливаем разведённую томат-пасту (повторюсь, что томат можно не добавлять, в классическом рецепте плова его нет). Всё хорошо разравниваем и добавляем кипяченую воду, чтобы сверху риса остался 1 сантиметр воды. Кладём два зубчика чеснока, солим, и ещё раз аккуратно перемешиваем.\n" +
                        "\n" +"Шаг №11\n" +
                        "Накрываем крышкой и уменьшаем температуру в 3 раза. Например, на моей печке я уменьшаю со значения «9» на «3».\n" +
                        "\n" +"Шаг №12\n" +
                        "Рис начнет впитывать влагу. И поднимая крышку, периодически аккуратно помешивая, вы увидите, как впитывается жидкость.\n" +
                        "\n" +"Шаг №13\n" +
                        "Через 8-10 минут вся жидкость впитается.\n" +
                        "\n" +"Шаг №14\n" +
                        "Тогда вам нужно выключить плиту. Аккуратно в последний раз перемешать плов. Плотно накрыть крышкой и оставить быстрый плов на сковороде на 20 минут настояться. Настоявшийся плов будет еще вкуснее.\n" +
                        "Не все могут удержаться и отстаивать плов после приготовления 20 минут. Да и не нужно себя сдерживать. Весь плов съесть все равно не получится, так как это очень сытное блюдо. Поэтому каждый из вас попробует плов сразу же после приготовления и после его настаивания."));
        list.add(new ListData("Картошка, тушенная с курицей",getResources().getDrawable(R.drawable.kartohatush),"Куриное филе - 400 г\n" +
                "Картофель - 315 г\n" +
                "Морковь - 100 г (1 шт.)\n" +
                "Лук репчатый - 120 г (1 шт.)\n" +
                "Чеснок - 5 г (1 зубчик)\n" +
                "Мука - 25 г (1 ст. ложка с горкой)\n" +
                "Соль - 1 ч. ложка (по вкусу)\n" +
                "Перец чёрный молотый - 0,5 ч. ложки\n" +
                "Паприка сладкая молотая - 0,5 ч. ложки\n" +
                "Чеснок сушёный молотый - 0,5 ч. ложки\n" +
                "Лавровый лист - 1 шт.\n" +
                "Перец душистый горошком - 2-3 шт.\n" +
                "Прованские травы сушёные - 1 ч. ложка\n" +
                "Масло растительное - 30 мл (2 ст. ложки)","1час",
                "Шаг №1\n" +
                        "Подготовить необходимые продукты.\n" +
                        "\n" +"Шаг №2\n" +
                        "Куриное мясо нарезать небольшими кусочками. Приправить солью (0,5 ч. ложки), молотым перцем (1/8 ч. ложки), сладкой паприкой и сушёным чесноком. Оставить на 10 минут.\n" +
                        "\n" +"Шаг №3\n" +
                        "Тем временем подготовить овощи: лук, морковь, картофель и чеснок очистить, промыть.\n" +
                        "Лук нарезать мелкими кусочками, картошку – средними кусочками, морковь – кружочками, а чеснок пропустить через пресс.\n" +
                        "\n" +"Шаг №4\n" +
                        "Кусочки филе посыпать мукой со всех сторон.\n" +
                        "\n" +"Шаг №5\n" +
                        "В сковороде разогреть растительное масло, выложить филе. На сильном огне обжарить куриное мясо со всех сторон до подрумянивания, минуты 3-4.\n" +
                        "\n" +"Шаг №6\n" +
                        "Переложить обжаренную курицу в кастрюлю.\n" +
                        "\n" +"Шаг №7\n" +
                        "Морковь, лук и чеснок обжарить в освободившейся сковороде на среднем огне 3 минуты.\n" +
                        "\n" +"Шаг №8\n" +
                        "Картофель выложить в кастрюлю с курицей.\n" +
                        "\n" +"Шаг №9\n" +
                        "Туда же отправить обжаренный лук с морковью и чесноком.\n" +
                        "Добавить лавровый лист, душистый перец, сушёные травы, соль (0,5 ч. ложки) и молотый перец (1/8 ч. ложки).\n" +
                        "\n" +"Шаг №10\n" +
                        "Влить 500 мл воды (чтобы чуть покрывала содержимое кастрюли).\n" +
                        "\n" +"Шаг №11\n" +
                        "Довести до кипения, затем сделать огонь минимальным и тушить под крышкой до готовности, периодически помешивая. Это займёт 30-35 минут.\n" +
                        "\n" +"Шаг №12\n" +
                        "Картошка, тушенная с курицей, готова.\n" +
                        "Приятного аппетита!\n"));
        adapter = new ListViewAdapter(this,list);
        lunchListView.setAdapter(adapter);
    }
    private void makeWork(){
        lunchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Lunch.this,Pokaz.class);
                intent.putExtra("name",list.get(i).getName());
                Bitmap bitmap = ((BitmapDrawable) list.get(i).getDrawable()).getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG,70,stream);
                String imgString = Base64.encodeToString(stream.toByteArray(), Base64.NO_WRAP);

                intent.putExtra("image",imgString);
                intent.putExtra("time",list.get(i).getTime());
                intent.putExtra("steps",list.get(i).getSteps());
                intent.putExtra("ingredients",list.get(i).getIngredients());
                startActivity(intent);
            }
        });
    }
}