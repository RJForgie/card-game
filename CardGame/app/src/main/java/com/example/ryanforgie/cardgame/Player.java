package com.example.ryanforgie.cardgame;

/**
 * Created by ryanforgie on 07/09/2017.
 */

public abstract class Player {
    public String name;
    int handValue;

    public Player(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    public String getName() {
        return name;
    }


    public int getHandValue() {
        return handValue;
    }

    public void receiveCard(Card card ) {
        int cardValue = card.values();
        this.handValue += cardValue;
    }
}

