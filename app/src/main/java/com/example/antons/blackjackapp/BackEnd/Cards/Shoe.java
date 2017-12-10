package com.example.antons.blackjackapp.BackEnd.Cards;


import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 *  Shoe object
 */

public class Shoe {

    private List<Deck> shoe = new ArrayList<>();
    private int amountOfDecksInShoe;
    private int numberOfPlayedCards;
    public boolean isShoeActive = true;

    public Shoe (int amountOfDecksInShoe) {
        this.amountOfDecksInShoe = amountOfDecksInShoe;
        fillShoe();
    }

    // Fill shoe with deck of cards
    private void fillShoe (){
        Log.v("Shoe","Filling shoe with decks");

        for (int i =0;i<amountOfDecksInShoe;i++){

            shoe.add(new Deck());

        }

    }

    // this method is intended to get random card from shoe
    public Card getRandomCard (){

        Log.v("Shoe","Getting random card");

        int randomDeck = (int) (Math.random() * amountOfDecksInShoe); //get random deck number
        int randomCard = (int) (Math.random() * 52); // get random card number

        Card card = shoe.get(randomDeck).getCards().get(randomCard);
        //Check if card still in shoe
        if (!card.isInShoe()){
            getRandomCard();
        }
        //Change card status of persistence in shoe
        Log.v("Shoe", "Checking if card already played");
        card.setInShoe(false);
        numberOfPlayedCards++;

        if (numberOfPlayedCards>= amountOfDecksInShoe*26){
            Log.v("Shoe", "Shoe ended. Setting shoe status to nonActive");
            isShoeActive = false;
        }

        return card;
    }






}
