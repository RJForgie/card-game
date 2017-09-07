package com.example.ryanforgie.cardgame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ryanforgie on 07/09/2017.
 */

public class Deck {

    private Random randomGenerator;
    private ArrayList<Card> deck;
    private Card card;




    public Deck() {
        deck = new ArrayList<Card>();
        randomGenerator = new Random();
    }

    public void makeDeck() {
        for(Suit suit: Suit.values() ){
            for(Number value: Number.values()){
                Card card = new Card(suit, value);
                deck.add(card);
            }
        }
    }

    public Card deal(){
        int index = randomGenerator.nextInt(deck.size());
        card = deck.get(index);
        return card;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck){
        this.deck = deck;
    }

}

