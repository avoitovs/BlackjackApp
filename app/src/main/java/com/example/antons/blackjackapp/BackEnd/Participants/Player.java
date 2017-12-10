package com.example.antons.blackjackapp.BackEnd.Participants;

import com.example.antons.blackjackapp.BackEnd.Seat;

import java.util.List;

/**
 * Player's object
 */

public class Player {

    private String name;
    private double balance;
    private List<Seat> playersSeats;
    private int amountOfSeats;

    public Player(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Seat> getPlayersSeats() {
        return playersSeats;
    }

    public void setPlayersSeats(List<Seat> playersSeats) {
        this.playersSeats = playersSeats;
    }
}
