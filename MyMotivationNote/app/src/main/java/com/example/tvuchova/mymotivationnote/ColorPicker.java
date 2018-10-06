package com.example.tvuchova.mymotivationnote;

import android.graphics.Color;

import java.util.Random;

public class ColorPicker {
    private String mColors[]={
            "#03FF24",
            "#0360FF",
            "#EAFF00",
            "#FFD900",
            "#ff33b5e5",
            "#FF2F00",
            "#04C414"
    };

    public int getRandomColor(){
       Random randomGen= new Random();
       int rendomNo =randomGen.nextInt(mColors.length);
       String color=mColors[rendomNo];

       int colorInInt= Color.parseColor(color);

       return colorInInt;
    }

}
