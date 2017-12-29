package com.example.antons.blackjackapp.BackEnd;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;

import java.util.List;

/**
 * Core functions class
 * Soft hand functionality
 * Score update
 */

public class CoreFunctions {


    public static int ScoreUpdate(List<Card> cards) {
        int score = 0;
        boolean softHand = false;

        for (Card card : cards) { //check each card from card list (from seat)
            if (card.getScore() != 11) { //next card is not ACE (11)
                score = score + card.getScore();

                if (softHand & score > 21) {
                    score = score - 10;
                    softHand = false;
                }

            }
            if (card.getScore() == 11) { //next card is ACE (11)
                if (score + 11 <= 21) { // Case ACE makes hand soft (as common score less than 22 )
                    softHand = true;
                    score = score + 11;
                } else {
                    score = score + 1;
                }
            }
        }
        return score;
    }

}


