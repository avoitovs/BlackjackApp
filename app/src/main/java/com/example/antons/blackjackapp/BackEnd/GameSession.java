package com.example.antons.blackjackapp.BackEnd;

import android.util.Log;

import com.example.antons.blackjackapp.BackEnd.Cards.Shoe;
import com.example.antons.blackjackapp.BackEnd.Participants.Dealer;
import com.example.antons.blackjackapp.BackEnd.Participants.Player;

/**
 * Common objects in game session
 */

public class GameSession {

    public Shoe shoe;
    private int amountOfOccupiedSeats = 1;
    private boolean wantToPlay=true;
    public Player player;
    public Dealer dealer;
    public Round round;


    public GameSession() {
        this.shoe = new Shoe(6);
        player = new Player("player");
        dealer = new Dealer();
        playGame();

    }


    private void playGame (){


       // while (wantToPlay){
            round = new Round(player,dealer,amountOfOccupiedSeats,this);
            checkForShuffle();
      //  }

    }


    // Check for shoe status: active/ nonActive
    private void checkForShuffle (){

        Log.i("Game session","Check if shoe is still active");
        if (!shoe.isShoeActive){
            Log.i("Game session","Shoe is not active anymore. Reshuffling");
            this.shoe = new Shoe(6);
        }
        Log.i("Game session","Shoe is still active");

    }




}
