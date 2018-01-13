package com.example.antons.blackjackapp;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;
import com.example.antons.blackjackapp.BackEnd.CoreFunctions;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Score update unit tests
 */

public class ScoreTest {




    @Test
    public void testScore (){
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("QUEEN",10,true,"HEARTS"));
        cards.add(new Card("ACE",11,true,"CLUBS"));

        Assert.assertEquals(21,CoreFunctions.scoreUpdate(cards));
    }
    @Test
    public void testScore1 (){
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("QUEEN",10,true,"HEARTS"));

        Assert.assertEquals(12,CoreFunctions.scoreUpdate(cards));
    }
    @Test
    public void testScore2 (){
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("TWO",2,true,"SPADES"));

        Assert.assertEquals(13,CoreFunctions.scoreUpdate(cards));
    }
    @Test
    public void testScore3 (){
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("TWO",2,true,"SPADES"));
        cards.add(new Card("QUEEN",10,true,"HEARTS"));

        Assert.assertEquals(13,CoreFunctions.scoreUpdate(cards));
    }
    @Test
    public void testScore4 (){
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("TWO",2,true,"SPADES"));
        cards.add(new Card("QUEEN",10,true,"HEARTS"));

        Assert.assertEquals(13,CoreFunctions.scoreUpdate(cards));
    }
    @Test
    public void testScore5 (){
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("ACE",11,true,"CLUBS"));

        Assert.assertEquals(12,CoreFunctions.scoreUpdate(cards));
    }
    @Test
    public void testScore6 (){
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("ACE",11,true,"CLUBS"));

        Assert.assertEquals(12,CoreFunctions.scoreUpdate(cards));
    }



}
