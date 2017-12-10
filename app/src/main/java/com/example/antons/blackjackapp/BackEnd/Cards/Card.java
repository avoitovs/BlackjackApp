package com.example.antons.blackjackapp.BackEnd.Cards;

/**
 * Card object
 */

public class Card {

    // Value stands for card name (example: Ace, King etc.)
    private String value;

    // Score stands for numeric value of the card (example: King =10, Ace = 11/1 etc.)
    private int score;

    // Is card in shoe true/false
    private boolean inShoe;

    // Suit of the card (example: Hearts, Diamonds, Spades, Clubs)
    private String suit;

    // Picture recourse ID
    private int pictureResourceID;

    public Card(String value, int score, boolean inShoe, String suit /*,int pictureResourceID*/) {
        this.value = value;
        this.score = score;
        this.inShoe = inShoe;
        this.suit = suit;
       // this.pictureResourceID = pictureResourceID;
    }

    public String getValue() {
        return value;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isInShoe() {
        return inShoe;
    }

    public void setInShoe(boolean inShoe) {
        this.inShoe = inShoe;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public int getPictureResourceID() {
        return pictureResourceID;
    }
}
