package com.example.tvuchova.mymotivationnote;

import java.util.Random;

public class Motivation {
    private Quote[] mQuotes;

    public Motivation(){
        mQuotes = new Quote[5];

        mQuotes[0] = new Quote("To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.","Autor1");
        mQuotes[1] = new Quote("1 To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.","Autor1");
        mQuotes[2] = new Quote("2 To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.","Autor1");
        mQuotes[3] = new Quote("3 To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.","Autor1");
        mQuotes[4] = new Quote("4 To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.","Autor1");
    }

    public Quote getARandomQuote(){
        Random randomGen=new Random();
        int randomNo=randomGen.nextInt(mQuotes.length);

        return mQuotes[randomNo];
    }
}
