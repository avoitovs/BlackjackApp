package com.example.antons.blackjackapp.BackEnd.Participants;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;

import java.util.List;

/**
 * Dealer's object
 */

public class Dealer {


    private List<Card> dealersCards;
    private boolean hasBlackjack;
    private int score;

    public List<Card> getDealersCards() {
        return dealersCards;
    }

    public void setDealersCards(List<Card> dealersCards) {
        this.dealersCards = dealersCards;
    }

    public boolean isHasBlackjack() {
        return hasBlackjack;
    }

    public void setHasBlackjack(boolean hasBlackjack) {
        this.hasBlackjack = hasBlackjack;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
