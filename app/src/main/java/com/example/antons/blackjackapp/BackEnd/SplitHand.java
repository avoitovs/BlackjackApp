package com.example.antons.blackjackapp.BackEnd;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;

import java.util.List;

/**
 * Hand object in case of split
 */

public class SplitHand {

    private int totalScore;
    private List<Card> handsCards;

    public SplitHand(List<Card> handsCards) {
        this.handsCards = handsCards;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public List<Card> getHandsCards() {
        return handsCards;
    }

    public void setHandsCards(List<Card> handsCards) {
        this.handsCards = handsCards;
    }
}
