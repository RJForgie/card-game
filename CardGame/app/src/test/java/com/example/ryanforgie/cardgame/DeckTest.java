package com.example.ryanforgie.cardgame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by ryanforgie on 07/09/2017.
 */

public class DeckTest{
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void testDeckSize(){
        deck.makeDeck();
        assertEquals(52, deck.getDeck().size());
    }

    @Test
    public void canCompareCards(){
        ArrayList<Card> fakeDeck = new ArrayList<>();

        fakeDeck.add(new Card(Suit.CLUBS, Number.FOUR));
        fakeDeck.add(new Card(Suit.CLUBS, Number.FIVE));

        deck.setDeck(fakeDeck);
        // deck.getDeck() ~ [FOUR of CLUBS, FIVE of CLUBS]


    }

}
