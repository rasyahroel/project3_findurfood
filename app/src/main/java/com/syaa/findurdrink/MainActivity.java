package com.syaa.findurdrink;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.syaa.findurdrink.adapter.ClassicDrinkAdapter;
import com.syaa.findurdrink.adapter.DoubleshotDrinkAdapter;
import com.syaa.findurdrink.adapter.FlavoredDrinkAdapter;
import com.syaa.findurdrink.adapter.GoGreenAdapter;
import com.syaa.findurdrink.adapter.MeerFoodAdapter;
import com.syaa.findurdrink.adapter.MilkDrinkAdapter;
import com.syaa.findurdrink.adapter.NewDrinkAdapter;
import com.syaa.findurdrink.adapter.NewMenuAdapter;
import com.syaa.findurdrink.adapter.PremiumDrinkAdapter;
import com.syaa.findurdrink.adapter.SignatureDrinkAdapter;
import com.syaa.findurdrink.adapter.SnackAdapter;
import com.syaa.findurdrink.adapter.TeaDrinkAdapter;
import com.syaa.findurdrink.model.ClassicDrink;
import com.syaa.findurdrink.model.DoubleshotDrink;
import com.syaa.findurdrink.model.FlavoredDrink;
import com.syaa.findurdrink.model.GoGreen;
import com.syaa.findurdrink.model.MeerFood;
import com.syaa.findurdrink.model.MilkDrink;
import com.syaa.findurdrink.model.NewDrink;
import com.syaa.findurdrink.model.NewMenu;
import com.syaa.findurdrink.model.PremiumDrink;
import com.syaa.findurdrink.model.SignatureDrink;
import com.syaa.findurdrink.model.Snack;
import com.syaa.findurdrink.model.TeaDrink;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView newRecycler, classicRecycler, flavoredRecycler, doubleshotRecycler, premiumRecycler, signatureRecycler,
            teaRecycler, milkRecycler, snackRecycler, meerRecycler, newMenuRecycler, goRecycler;
    NewDrinkAdapter newDrinkAdapter;
    ClassicDrinkAdapter classicDrinkAdapter;
    FlavoredDrinkAdapter flavoredDrinkAdapter;
    DoubleshotDrinkAdapter doubleshotDrinkAdapter;
    PremiumDrinkAdapter premiumDrinkAdapter;
    SignatureDrinkAdapter signatureDrinkAdapter;
    TeaDrinkAdapter teaDrinkAdapter;
    MilkDrinkAdapter milkDrinkAdapter;
    SnackAdapter snackAdapter;
    MeerFoodAdapter meerFoodAdapter;
    NewMenuAdapter newMenuAdapter;
    GoGreenAdapter goGreenAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<NewDrink> newDrinkList = new ArrayList<>();

        newDrinkList.add(new NewDrink("Cincau Soy Milk", "24.000", R.drawable.cincau_soy_milk));
        newDrinkList.add(new NewDrink("Es Kopi Susu Cincau", "24.000", R.drawable.es_kopi_susu_cincau));
        newDrinkList.add(new NewDrink("Redbean Matcha", "27.000", R.drawable.redbean_matcha));
        newDrinkList.add(new NewDrink("Redbean Latte", "27.000", R.drawable.redbean_latte));
        newDrinkList.add(new NewDrink("Orange Pops", "29.000", R.drawable.orange_pops));
        newDrinkList.add(new NewDrink("Lychee Pops", "29.000", R.drawable.lychee_pops));
        newDrinkList.add(new NewDrink("Strawberry Pops", "29.000", R.drawable.strawberry_pops));
        newDrinkList.add(new NewDrink("Fitbar Latte", "22.000", R.drawable.fitbar_latte));
        newDrinkList.add(new NewDrink("Es Kopi Coconut", "22.000", R.drawable.es_kopi_coconut));
        newDrinkList.add(new NewDrink("Es Kopi Susu Rhum", "22.000", R.drawable.es_kopi_susu_rhum));

        setNewRecycler(newDrinkList);

        List<ClassicDrink> classicDrinkList = new ArrayList<>();

        classicDrinkList.add(new ClassicDrink("Kopi Aren Item", "17.000", R.drawable.kopi_aren));
        classicDrinkList.add(new ClassicDrink("Es Kopi Susu", "18.000", R.drawable.es_kopi_susu));
        classicDrinkList.add(new ClassicDrink("Es Kopi Susu Less Sugar", "18.000", R.drawable.redbean_matcha));
        classicDrinkList.add(new ClassicDrink("Es Kopi Susu Doubleshot - Strong", "21.000", R.drawable.es_kopi_susu_less_sugar));
        classicDrinkList.add(new ClassicDrink("Es Kopi Moka Hersheys", "26.000", R.drawable.es_kopi_moka_hersheys));
        classicDrinkList.add(new ClassicDrink("Es Kopi Susu Ice Cream", "26.000", R.drawable.es_kopi_susu_ice_cream));
        classicDrinkList.add(new ClassicDrink("Es Kopi Susu Cookie Dough", "24.000", R.drawable.es_kopi_susu_cookie_dough));

        setClassicRecycler(classicDrinkList);

        List<FlavoredDrink> flavoredDrinkList = new ArrayList<>();

        flavoredDrinkList.add(new FlavoredDrink("Es Kopi Susu Raspberry", "24.000", R.drawable.es_kopi_susu_raspberry));
        flavoredDrinkList.add(new FlavoredDrink("Es Kopi Susu Vanilla", "24.000", R.drawable.es_kopi_susu_vanilla));
        flavoredDrinkList.add(new FlavoredDrink("Es Kopi Susu Hazelnut", "24.000", R.drawable.es_kopi_susu_hazelnut));
        flavoredDrinkList.add(new FlavoredDrink("Es Kopi Susu Caramel", "24.000", R.drawable.es_kopi_susu_caramel));

        setFlavoredRecycler(flavoredDrinkList);

        List<DoubleshotDrink> doubleshotDrinkList = new ArrayList<>();

        doubleshotDrinkList.add(new DoubleshotDrink("Dooubleshot Foresthree Iced Shaken", "21.000", R.drawable.doubleshot_f_iced_shaken));
        doubleshotDrinkList.add(new DoubleshotDrink("Dooubleshot Es Kopi Susu", "21.000", R.drawable.doubleshot_es_kopi_susu));

        setDoubleshotRecycler(doubleshotDrinkList);

        List<PremiumDrink> premiumDrinkList = new ArrayList<>();

        premiumDrinkList.add(new PremiumDrink("Durian Presso", "32.000", R.drawable.durian_presso));
        premiumDrinkList.add(new PremiumDrink("Cappuccino", "27.000", R.drawable.cappuccino));
        premiumDrinkList.add(new PremiumDrink("Cappuccino (hot)", "27.000", R.drawable.cappuccino_hot));
        premiumDrinkList.add(new PremiumDrink("Americano Arabica", "22.000", R.drawable.americano_arabica));
        premiumDrinkList.add(new PremiumDrink("Americano Arabica (hot)", "22.000", R.drawable.americano_arabica_hot));

        setPremiumRecycler(premiumDrinkList);

        List<SignatureDrink> signatureDrinkList = new ArrayList<>();

        signatureDrinkList.add(new SignatureDrink("Blacktea Creme", "22.000", R.drawable.blacktea_creme));
        signatureDrinkList.add(new SignatureDrink("Es Kopi Susu Creme", "24.000", R.drawable.es_kopi_susu_creme));
        signatureDrinkList.add(new SignatureDrink("Doubleshot Es Kopi Susu Creme", "25.000", R.drawable.doubleshot_es_kopi_susu_creme));
        signatureDrinkList.add(new SignatureDrink("Hersheys Creme", "27.000", R.drawable.hersheys_creme));
        signatureDrinkList.add(new SignatureDrink("Matcha Creme", "28.000", R.drawable.matcha_creme));
        signatureDrinkList.add(new SignatureDrink("Cookie Dough Latte", "27.000", R.drawable.cookie_dough_latte));

        setSignatureRecycler(signatureDrinkList);

        List<TeaDrink> teaDrinkList = new ArrayList<>();

        teaDrinkList.add(new TeaDrink("Shanghai Brown Sugar Milktea", "30.000", R.drawable.shanghai_brown_sugar_milktea));
        teaDrinkList.add(new TeaDrink("Milktea Coffee Jelly", "24.000", R.drawable.milktea_coffee_jelly));
        teaDrinkList.add(new TeaDrink("Milk Tea Foresthree", "21.000", R.drawable.milk_tea_foresthree));
        teaDrinkList.add(new TeaDrink("Milk Tea Foresthree (hot)", "21.000", R.drawable.milk_tea_foresthree_hot));
        teaDrinkList.add(new TeaDrink("Teh Tarek", "20.000", R.drawable.teh_tarek));
        teaDrinkList.add(new TeaDrink("Teh Tarek (hot)", "20.000", R.drawable.teh_tarek_hot));
        teaDrinkList.add(new TeaDrink("Grandma's Lemon Tea", "20.000", R.drawable.grandmas_lemon_tea));
        teaDrinkList.add(new TeaDrink("Matcha Latte", "25.000", R.drawable.matcha_latte));
        teaDrinkList.add(new TeaDrink("Matcha Latte (hot)", "25.000", R.drawable.matcha_latte_hot));

        setTeaRecycler(teaDrinkList);

        List<MilkDrink> milkDrinkList = new ArrayList<>();

        milkDrinkList.add(new MilkDrink("Cotton Candy Milk", "27.000", R.drawable.cotton_candy_milk));
        milkDrinkList.add(new MilkDrink("Oreo And Cream", "27.000", R.drawable.oreo_and_cream));
        milkDrinkList.add(new MilkDrink("Regal And Cream", "27.000", R.drawable.regal_and_cream));
        milkDrinkList.add(new MilkDrink("Hersheys Chocolate Milk", "25.000", R.drawable.hersheys_chocolate_milk));
        milkDrinkList.add(new MilkDrink("Hersheys Chocolate Milk (hot)", "25.000", R.drawable.hersheys_chocolate_milk_hot));
        milkDrinkList.add(new MilkDrink("Chocolate Hazelnut Milk", "26.000", R.drawable.chocolate_hazelnut_milk));
        milkDrinkList.add(new MilkDrink("Hershey Coffee Paps", "30.000", R.drawable.hershey_coffee_paps));
        milkDrinkList.add(new MilkDrink("Shanghai Brown Coffee Paps", "30.000", R.drawable.shanghai_brown_coffee_paps));
        milkDrinkList.add(new MilkDrink("Vanilla Frap Coffee Paps", "27.000", R.drawable.vanilla_frap_coffee_paps));

        setMilkRecycler(milkDrinkList);

        List<Snack> snackList = new ArrayList<>();

        snackList.add(new Snack("Es Mangga Jelly", "12.000", R.drawable.es_mangga_jelly));
        snackList.add(new Snack("Ketan Durian", "18.000", R.drawable.ketan_durian));
        snackList.add(new Snack("Risoles (isi 3 Pcs)", "8.000", R.drawable.risoles));

        setSnackRecycler(snackList);

        List<MeerFood> meerFoodList = new ArrayList<>();

        meerFoodList.add(new MeerFood("Mie Ayam Bakar", "23.000", R.drawable.mie_ayam_bakar));
        meerFoodList.add(new MeerFood("Ayam Sambal Matah", "23.000", R.drawable.ayam_sambal_matah));

        setMeerRecycler(meerFoodList);

        List<NewMenu> newMenuList = new ArrayList<>();

        newMenuList.add(new NewMenu("Es Kopi Soy Milk", "22.000", R.drawable.es_mangga_jelly));
        newMenuList.add(new NewMenu("Ice Lemon Tea", "17.000", R.drawable.ketan_durian));
        newMenuList.add(new NewMenu("Ice Lychee Tea", "17.000", R.drawable.risoles));

        setNewMenuRecycler(newMenuList);

        List<GoGreen> goGreenList = new ArrayList<>();

        goGreenList.add(new GoGreen("Meer Straw", "30.000", R.drawable.meer_straw));

        setGoGreenRecycler(goGreenList);

    }

    public void setNewRecycler(List<NewDrink> newDrinkList) {

        newRecycler = findViewById(R.id.new_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        newRecycler.setLayoutManager(layoutManager);
        newDrinkAdapter = new NewDrinkAdapter(this, newDrinkList);
        newRecycler.setAdapter(newDrinkAdapter);
    }

    public void setClassicRecycler(List<ClassicDrink> classicDrinkList) {

        classicRecycler = findViewById(R.id.classic_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        classicRecycler.setLayoutManager(layoutManager);
        classicDrinkAdapter = new ClassicDrinkAdapter(this, classicDrinkList);
        classicRecycler.setAdapter(classicDrinkAdapter);
    }

    public void setFlavoredRecycler(List<FlavoredDrink> flavoredDrinkList) {

        flavoredRecycler = findViewById(R.id.flavored_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        flavoredRecycler.setLayoutManager(layoutManager);
        flavoredDrinkAdapter = new FlavoredDrinkAdapter(this, flavoredDrinkList);
        flavoredRecycler.setAdapter(flavoredDrinkAdapter);
    }

    public void setDoubleshotRecycler(List<DoubleshotDrink> doubleshotDrinkList) {

        doubleshotRecycler = findViewById(R.id.doubleshot_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        doubleshotRecycler.setLayoutManager(layoutManager);
        doubleshotDrinkAdapter = new DoubleshotDrinkAdapter(this, doubleshotDrinkList);
        doubleshotRecycler.setAdapter(doubleshotDrinkAdapter);
    }

    public void setPremiumRecycler(List<PremiumDrink> premiumDrinkList) {

        premiumRecycler = findViewById(R.id.premium_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        premiumRecycler.setLayoutManager(layoutManager);
        premiumDrinkAdapter = new PremiumDrinkAdapter(this, premiumDrinkList);
        premiumRecycler.setAdapter(premiumDrinkAdapter);
    }

    public void setSignatureRecycler(List<SignatureDrink> signatureDrinkList) {

        signatureRecycler = findViewById(R.id.signature_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        signatureRecycler.setLayoutManager(layoutManager);
        signatureDrinkAdapter = new SignatureDrinkAdapter(this, signatureDrinkList);
        signatureRecycler.setAdapter(signatureDrinkAdapter);
    }

    public void setTeaRecycler(List<TeaDrink> teaDrinkList) {

        teaRecycler = findViewById(R.id.tea_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        teaRecycler.setLayoutManager(layoutManager);
        teaDrinkAdapter = new TeaDrinkAdapter(this, teaDrinkList);
        teaRecycler.setAdapter(teaDrinkAdapter);
    }

    public void setMilkRecycler(List<MilkDrink> milkDrinkList) {

        milkRecycler = findViewById(R.id.milk_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        milkRecycler.setLayoutManager(layoutManager);
        milkDrinkAdapter = new MilkDrinkAdapter(this, milkDrinkList);
        milkRecycler.setAdapter(milkDrinkAdapter);
    }

    public void setSnackRecycler(List<Snack> snackList) {

        snackRecycler = findViewById(R.id.snack_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        snackRecycler.setLayoutManager(layoutManager);
        snackAdapter = new SnackAdapter(this, snackList);
        snackRecycler.setAdapter(snackAdapter);
    }

    public void setMeerRecycler(List<MeerFood> meerFoodList) {

        meerRecycler = findViewById(R.id.meer_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        meerRecycler.setLayoutManager(layoutManager);
        meerFoodAdapter = new MeerFoodAdapter(this, meerFoodList);
        meerRecycler.setAdapter(meerFoodAdapter);
    }

    public void setNewMenuRecycler(List<NewMenu> newMenuList) {

        newMenuRecycler = findViewById(R.id.newMenu_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        newMenuRecycler.setLayoutManager(layoutManager);
        newMenuAdapter = new NewMenuAdapter(this, newMenuList);
        newMenuRecycler.setAdapter(newMenuAdapter);
    }

    public void setGoGreenRecycler(List<GoGreen> goGreenList) {

        goRecycler = findViewById(R.id.go_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        goRecycler.setLayoutManager(layoutManager);
        goGreenAdapter = new GoGreenAdapter(this, goGreenList);
        goRecycler.setAdapter(goGreenAdapter);
    }
}