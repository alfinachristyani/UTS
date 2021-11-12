package com.example.aplikasimenumakanan;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodName = {
            "Nasi Goreng",
            "Mie Goreng",
            "Nasi Padang",
            "Sate",
            "Nasi Bakar"
    };

    private static String[] foodDetail = {
            "Nasi yang digoreng bersama dengan telur dan ayam",
            "Mie yang digoreng bersama dengan telur dan ayam",
            "Nasi khas Padang dengan rendang dan siraman kuah",
            "Sate yang dibakar dengan bumbu kacang",
            "Nasi yang dibakar dengan isian daging dan rempah"
    };

    private static int[] foodImage = {
            R.drawable.nasgor,
            R.drawable.migor,
            R.drawable.naspad,
            R.drawable.sate,
            R.drawable.nasibakar

    };

    private static String[] foodHarga = {
            "Rp 10.000",
            "Rp 10.000",
            "Rp 12.000",
            "Rp 11.000",
            "Rp 8.500"
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position<foodName.length; position++) {
            Food food =new Food();
            food.setNama(foodName[position]);
            food.setDetail(foodDetail[position]);
            food.setGambar(foodImage[position]);
            food.setHarga(foodHarga[position]);
            list.add(food);
        }
        return list;
    }
}
