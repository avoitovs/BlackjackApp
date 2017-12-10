package com.example.antons.blackjackapp.BackEnd;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;

import java.util.List;

/**
 * Hand object in case of split
 */

public class SplitHand {

    private int totalScore;
    private List<Card> seatsCards;

    public SplitHand(List<Card> seatsCards) {
        this.seatsCards = seatsCards;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public List<Card> getSeatsCards() {
        return seatsCards;
    }

    public void setSeatsCards(List<Card> seatsCards) {
        this.seatsCards = seatsCards;
    }
}
