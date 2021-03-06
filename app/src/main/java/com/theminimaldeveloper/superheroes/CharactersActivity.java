package com.theminimaldeveloper.superheroes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;


public class CharactersActivity extends AppCompatActivity {

    CharViewPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        ViewPager charViewPager = findViewById(R.id.charViewPager);

        int[] imageIds = new int[]{
                R.drawable.black_panther, R.drawable.black_widow, R.drawable.bucky,
                R.drawable.captain_america, R.drawable.captain_marvel,
                R.drawable.deadpool, R.drawable.drax, R.drawable.falcon, R.drawable.groot,
                R.drawable.hawk_eye, R.drawable.hulk, R.drawable.iron_man, R.drawable.korg, R.drawable.loki,
                R.drawable.mantis, R.drawable.nebula, R.drawable.nick_fury,
                R.drawable.okoye, R.drawable.rocket_raccoon, R.drawable.scarlet_witch, R.drawable.spider_man,
                R.drawable.thanos, R.drawable.thor, R.drawable.vision, R.drawable.wasp, R.drawable.wolverine

        };

        String[] charNames = new String[]{
                "Black Panther", "Black Widow", "Bucky", "Captain America", "Captain Marvel (Carol Danvers)",
                "Deadpool", "Drax", "Falcon", "Groot", "Hawkeye", "Hulk", "Iron Man", "Korg",
                "Loki", "Mantis", "Nebula", "Nick Fury", "Okoye", "Rocket Raccoon",
                "Scarlet Witch", "Spider-Man", "Thanos", "Thor", "Vision", "Wasp", "Wolverine"
        };

        pagerAdapter = new CharViewPagerAdapter(CharactersActivity.this, charNames, imageIds);
        charViewPager.setAdapter(pagerAdapter);

    }
}