package com.example.ahmadrizaldi.praktikum2.data;

import com.example.ahmadrizaldi.praktikum2.R;

import java.util.ArrayList;
import java.util.List;

public class BodyImageAssets {

    //mengumpulkan heads menajdi satu
    private static final List<Integer> heads = new ArrayList<Integer>() {{
        add(R.drawable.head1);
        add(R.drawable.head2);
        add(R.drawable.head3);
        add(R.drawable.head4);
        add(R.drawable.head5);
        add(R.drawable.head6);
        add(R.drawable.head7);
        add(R.drawable.head8);
        add(R.drawable.head9);
        add(R.drawable.head10);
        add(R.drawable.head11);
        add(R.drawable.head12);
    }};

    //mengumpulkan bodies menajdi satu
    private static final List<Integer> bodies = new ArrayList<Integer>() {{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);
        add(R.drawable.body6);
        add(R.drawable.body7);
        add(R.drawable.body8);
        add(R.drawable.body9);
        add(R.drawable.body10);
        add(R.drawable.body11);
        add(R.drawable.body12);
    }};

    //mengumpulkan legs menajdi satu
    private static final List<Integer> legs = new ArrayList<Integer>() {{
        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
    }};

    private static final List<Integer> all = new ArrayList<Integer>() {{
        addAll(heads);
        addAll(bodies);
        addAll(legs);
    }};


    // Getter methods that return lists of all head images, body images, and leg images

    //unruk menbgambil gambar kepala
    public static List<Integer> getHeads() {
        return heads;
    }

    //unruk menbgambil gambar badan
    public static List<Integer> getBodies() {
        return bodies;
    }

    //unruk menbgambil gambar kaki
    public static List<Integer> getLegs() {
        return legs;
    }

    // Returns a list of all the images combined: heads, bodies, and legs in that order
    public static List<Integer> getAll() {
        return all;
    }

}