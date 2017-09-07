package com.example.ryanforgie.cardgame;

/**
 * Created by ryanforgie on 07/09/2017.
 */

public class Card {

    private Suit suit;
    private Number number;

    public Card(Suit suit, Number number) {
        this.suit = suit;
        this.number = number;
    }


    public Suit getSuit(){
        return this.suit;
    }

    public Number getNumber() {
        return this.number;
    }



}

