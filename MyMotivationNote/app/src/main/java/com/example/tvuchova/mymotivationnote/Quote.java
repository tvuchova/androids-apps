package com.example.tvuchova.mymotivationnote;

public class Quote {
    private String mQuote;

    public Quote(String mQuote, String mAuthor) {
        this.mQuote = mQuote;
        this.mAuthor = mAuthor;
    }

    private String mAuthor;
    public String getmQuote() {
        return mQuote;
    }

    public void setmQuote(String mQuote) {
        this.mQuote = mQuote;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }



}
