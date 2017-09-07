package com.example.ryanforgie.cardgame;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by ryanforgie on 07/09/2017.
 */
public class CardTest{
    Card card;

    @Before
    public void before(){
        card = new Card(Suit.DIAMONDS, Number.EIGHT);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.DIAMONDS, card.getSuit() );
    }

    @Test
    public void canGetNumber(){
        assertEquals(Number.EIGHT, card.getNumber() );
    }
}