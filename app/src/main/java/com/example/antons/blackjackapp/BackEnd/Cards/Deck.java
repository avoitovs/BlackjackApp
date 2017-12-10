package com.example.antons.blackjackapp.BackEnd.Cards;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Deck object
 */

public class Deck {

    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public Deck() {
        fillDeckWithCards();
    }

    private void fillDeckWithCards (){

        Log.v("Deck", "creating deck");

        cards = new ArrayList<>();

        cards.add(new Card("TWO",2,true,"SPADES"));
        cards.add(new Card("TWO",2,true,"CLUBS"));
        cards.add(new Card("TWO",2,true,"HEARTS"));
        cards.add(new Card("TWO",2,true,"DIAMONDS"));

        cards.add(new Card("THREE",3,true,"SPADES"));
        cards.add(new Card("THREE",3,true,"CLUBS"));
        cards.add(new Card("THREE",3,true,"HEARTS"));
        cards.add(new Card("THREE",3,true,"DIAMONDS"));

        cards.add(new Card("FOUR",4,true,"SPADES"));
        cards.add(new Card("FOUR",4,true,"CLUBS"));
        cards.add(new Card("FOUR",4,true,"HEARTS"));
        cards.add(new Card("FOUR",4,true,"DIAMONDS"));

        cards.add(new Card("FIVE",5,true,"SPADES"));
        cards.add(new Card("FIVE",5,true,"CLUBS"));
        cards.add(new Card("FIVE",5,true,"HEARTS"));
        cards.add(new Card("FIVE",5,true,"DIAMONDS"));

        cards.add(new Card("SIX",6,true,"SPADES"));
        cards.add(new Card("SIX",6,true,"CLUBS"));
        cards.add(new Card("SIX",6,true,"HEARTS"));
        cards.add(new Card("SIX",6,true,"DIAMONDS"));

        cards.add(new Card("SEVEN",7,true,"SPADES"));
        cards.add(new Card("SEVEN",7,true,"CLUBS"));
        cards.add(new Card("SEVEN",7,true,"HEARTS"));
        cards.add(new Card("SEVEN",7,true,"DIAMONDS"));

        cards.add(new Card("EIGHT",8,true,"SPADES"));
        cards.add(new Card("EIGHT",8,true,"CLUBS"));
        cards.add(new Card("EIGHT",8,true,"HEARTS"));
        cards.add(new Card("EIGHT",8,true,"DIAMONDS"));

        cards.add(new Card("NINE",9,true,"SPADES"));
        cards.add(new Card("NINE",9,true,"CLUBS"));
        cards.add(new Card("NINE",9,true,"HEARTS"));
        cards.add(new Card("NINE",9,true,"DIAMONDS"));

        cards.add(new Card("TEN",10,true,"SPADES"));
        cards.add(new Card("TEN",10,true,"CLUBS"));
        cards.add(new Card("TEN",10,true,"HEARTS"));
        cards.add(new Card("TEN",10,true,"DIAMONDS"));

        cards.add(new Card("JACK",10,true,"SPADES"));
        cards.add(new Card("JACK",10,true,"CLUBS"));
        cards.add(new Card("JACK",10,true,"HEARTS"));
        cards.add(new Card("JACK",10,true,"DIAMONDS"));

        cards.add(new Card("QUEEN",10,true,"SPADES"));
        cards.add(new Card("QUEEN",10,true,"CLUBS"));
        cards.add(new Card("QUEEN",10,true,"HEARTS"));
        cards.add(new Card("QUEEN",10,true,"DIAMONDS"));

        cards.add(new Card("KING",10,true,"SPADES"));
        cards.add(new Card("KING",10,true,"CLUBS"));
        cards.add(new Card("KING",10,true,"HEARTS"));
        cards.add(new Card("KING",10,true,"DIAMONDS"));

        cards.add(new Card("ACE",11,true,"SPADES"));
        cards.add(new Card("ACE",11,true,"CLUBS"));
        cards.add(new Card("ACE",11,true,"HEARTS"));
        cards.add(new Card("ACE",11,true,"DIAMONDS"));

    }


}
