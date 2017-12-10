package com.example.antons.blackjackapp.BackEnd.GameStates.Decisions;

import android.util.Log;

import com.example.antons.blackjackapp.BackEnd.GameSession;
import com.example.antons.blackjackapp.BackEnd.Seat;

/**
 * This class implements decisions such as HIT, DOUBLE DOWN etc.
 */

public class DecisionMaking {



    // Implementation of HIT
    public void hit (Seat seat, GameSession gameSession){
        Log.v("Decision making", "HIT");
        seat.getSeatsCards().add(gameSession.shoe.getRandomCard());
    }

    // Implementation of DOUBLE DOWN
    public void doubleDown (Seat seat, GameSession gameSession){

        Log.v("Decision making", "Double down");
        seat.getSeatsCards().add(gameSession.shoe.getRandomCard());
        seat.setDoubleDownOnSeat(true);
        // update player's balance
        Log.v("Double down", "updating player's balance");
        seat.player.setBalance(seat.player.getBalance()-seat.getTotalBetOnSeat());
        // update seat's total bet
        Log.v("Double down", "updating seat's total bet");
        seat.setTotalBetOnSeat(seat.getTotalBetOnSeat()*2);

    }






}
