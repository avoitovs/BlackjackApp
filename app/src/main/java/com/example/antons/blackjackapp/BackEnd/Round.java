package com.example.antons.blackjackapp.BackEnd;

import android.util.Log;

import com.example.antons.blackjackapp.BackEnd.GameStates.DealInitialCardsHelper;
import com.example.antons.blackjackapp.BackEnd.Participants.Dealer;
import com.example.antons.blackjackapp.BackEnd.Participants.Player;

import java.util.ArrayList;
import java.util.List;


/**
 * High level overview of round logic
 */

public class Round {

    private Player player;
    private Dealer dealer;
    private int occupiedSeatAmount; // How many seats player occupied
    private boolean roundFinnished; // Flag of finished round
    private GameSession gameSession;
    private double betOnSeat; // Bet per one seat


    public Round(Player player, Dealer dealer, int occupiedSeatAmount, GameSession gameSession) {
        this.player = player;
        this.dealer = dealer;
        this.occupiedSeatAmount = occupiedSeatAmount;
        this.gameSession = gameSession;

        // Creating and assigning list of seats to the player
        Log.i("Round", "Creating and assigning seats to the player");
        List<Seat> playersSeats = new ArrayList<>();
        for (int i = 0; i < occupiedSeatAmount; i++) {
            Seat seat = new Seat(player);
            playersSeats.add(seat);
        }
        player.setPlayersSeats(playersSeats);

    }

    // In this method player is placing bet and by pressing PLAY button starts dealing initial cards
    public void betPlacement() {
        // Bet placement


        Log.i("Round Initiation", "Placing bets");
        betOnSeat = betOnSeat + 5;
        double newBalanceValue = player.getBalance() - betOnSeat;
        Log.i("Round Initiation", "Placing bets.");
        player.setBalance(newBalanceValue);
        Log.i("Round Initiation", "Placing bets. Bet per seat is: " + betOnSeat);
        Log.i("Round Initiation", "Placing bets. Total balance is: " + newBalanceValue);
        for (Seat seat : player.getPlayersSeats()) {
            seat.setTotalBetOnSeat(betOnSeat);
        }

    }

    public void dealInitialCards() {
        Log.i("Round", "Dealing initial cards");
        new DealInitialCardsHelper(gameSession, player, dealer);
    }

    private void makeDecisions() {
        // logic
    }

    private void resolvingRound() {
        // logic
    }


}
