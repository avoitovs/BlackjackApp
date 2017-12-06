package com.example.antons.blackjackapp.UI.BackEnd.Cards;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by antons on 05/12/2017.
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

    private void fillShoe (){

        for (int i =0;i<amountOfDecksInShoe;i++){

            shoe.add(new Deck());

        }

    }

    // this method is intended to get random card from shoe
    private Card getRandomCard (){

        int randomDeck = (int) (Math.random() * amountOfDecksInShoe); //get random deck number
        int randomCard = (int) (Math.random() * 52); // get random card number

        Card card = shoe.get(randomDeck).getCards().get(randomCard);
        //Check if card still in shoe
        if (!card.isInShoe()){
            getRandomCard();
        }
        //Change card status of persistence in shoe
        card.setInShoe(false);
        numberOfPlayedCards++;

        if (numberOfPlayedCards>= amountOfDecksInShoe*26){
            isShoeActive = false;
        }

        return card;
    }






}
