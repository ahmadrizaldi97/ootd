package com.example.ahmadrizaldi.praktikum2.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ahmadrizaldi.praktikum2.R;
import com.example.ahmadrizaldi.praktikum2.data.BodyImageAssets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisialisasi Fragment
        BodyPartFragments bodyFragment;
        FragmentManager fm = getSupportFragmentManager();

        //membuat object heads
        bodyFragment = new BodyPartFragments();
        bodyFragment.setImgId(BodyImageAssets.getHeads()); //menset resource gambar heads
        bodyFragment.setIndexImg(0); //Menset index image dari 0
        fm.beginTransaction().add(R.id.headsContainer, bodyFragment).commit(); //Mengganti fragment head dengan resoucre gambar

        //membuat object body
        bodyFragment = new BodyPartFragments();
        bodyFragment.setImgId(BodyImageAssets.getBodies());//menset resource gambar body
        bodyFragment.setIndexImg(0); //Menset index image dari 0
        fm.beginTransaction().add(R.id.bodyContainer, bodyFragment).commit(); //Mengganti fragment body dengan resoucre gambar

        //membuat object legs
        bodyFragment = new BodyPartFragments();
        bodyFragment.setImgId(BodyImageAssets.getLegs()); //menset resource gambar legs
        bodyFragment.setIndexImg(0); //Menset index image dari 0
        fm.beginTransaction().add(R.id.legsContainer, bodyFragment).commit(); //Mengganti fragment legs dengan resoucre gambar
    }
}
