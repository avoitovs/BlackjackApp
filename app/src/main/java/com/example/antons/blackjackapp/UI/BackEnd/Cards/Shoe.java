package com.example.antons.blackjackapp.UI.BackEnd.Cards;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by antons on 05/12/2017.
 */

public class Shoe {

    private List<Deck> shoe = new ArrayList<>();
    private int amountOfDecksInShoe;

    public Shoe(int amountOfDecksInShoe) {
        this.amountOfDecksInShoe = amountOfDecksInShoe;
        fillShoe();
    }

    private void fillShoe (){

        for (int i =0;i<amountOfDecksInShoe;i++){

            shoe.add(new Deck());

        }

    }





}
