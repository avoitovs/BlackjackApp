package com.example.antons.blackjackapp.BackEnd;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;
import com.example.antons.blackjackapp.BackEnd.Participants.Player;

import java.util.List;

/**
 * Seat object
 */

public class Seat {


    private int totalScore;
    private List<Card> seatsCards;
    private List<SplitHand> splitHands;
    public Player player;
    private double totalBetOnSeat;
    private boolean doubleDownOnSeat = false;
    private boolean splitOnSeat= false;
    private boolean insuranceOnSeat = false;
    private boolean hasBlackjackOnSeat = false;

    public Seat(Player player) {
        this.player = player;
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

    public List<SplitHand> getSplitHands() {
        return splitHands;
    }

    public void setSplitHands(List<SplitHand> splitHands) {
        this.splitHands = splitHands;
    }

    public double getTotalBetOnSeat() {
        return totalBetOnSeat;
    }

    public void setTotalBetOnSeat(double totalBetOnSeat) {
        this.totalBetOnSeat = totalBetOnSeat;
    }

    public boolean isDoubleDownOnSeat() {
        return doubleDownOnSeat;
    }

    public void setDoubleDownOnSeat(boolean doubleDownOnSeat) {
        this.doubleDownOnSeat = doubleDownOnSeat;
    }

    public boolean isSplitOnSeat() {
        return splitOnSeat;
    }

    public void setSplitOnSeat(boolean splitOnSeat) {
        this.splitOnSeat = splitOnSeat;
    }

    public boolean isInsuranceOnSeat() {
        return insuranceOnSeat;
    }

    public void setInsuranceOnSeat(boolean insuranceOnSeat) {
        this.insuranceOnSeat = insuranceOnSeat;
    }

    public boolean isHasBlackjackOnSeat() {
        return hasBlackjackOnSeat;
    }

    public void setHasBlackjackOnSeat(boolean hasBlackjackOnSeat) {
        this.hasBlackjackOnSeat = hasBlackjackOnSeat;
    }
}
