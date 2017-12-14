package com.example.antons.blackjackapp;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;
import com.example.antons.blackjackapp.BackEnd.CoreFunctions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }






    @Test
    public void checkScoreCounter() throws Exception {

        List<Card> cards = new ArrayList<>();
        cards.add(new Card("Ace",11,true,"Diamonds"));
        cards.add(new Card("Jack",10,true,"Diamonds"));
        cards.add(new Card("Nine",9,true,"Diamonds"));
        cards.add(new Card("Eight",8,true,"Diamonds"));
        cards.add(new Card("Seven",7,true,"Diamonds"));
        cards.add(new Card("Six",6,true,"Diamonds"));
        cards.add(new Card("Five",5,true,"Diamonds"));
        cards.add(new Card("Four",4,true,"Diamonds"));
        cards.add(new Card("Three",3,true,"Diamonds"));
        cards.add(new Card("Two",2,true,"Diamonds"));


        int score = CoreFunctions.scoreUpdate(cards);

        assertEquals(21,score);
    }
}