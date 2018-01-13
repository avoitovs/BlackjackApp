package com.example.antons.blackjackapp.BackEnd.GameStates.Decisions;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;

import com.example.antons.blackjackapp.BackEnd.GameSession;
import com.example.antons.blackjackapp.BackEnd.Participants.Player;
import com.example.antons.blackjackapp.BackEnd.Seat;
import com.example.antons.blackjackapp.R;
import com.example.antons.blackjackapp.UI.JustPlay;

/**
 * This class intended to control decision flow
 */

public class DecisionController {

    public static GameSession gameSession;

    public static void gameplayControler (Player player, JustPlay justPlay){

        for (Seat seat:player.getPlayersSeats()) {

            while (seat.getTotalScore()<21){

                final Button hitButton = justPlay.findViewById(R.id.hit);
                hitButton.setOnClickListener((View view) ->{
                    DecisionMaking.hit(seat,gameSession);
                });











            }
        }
    }

    // check if first two cards are equal in value (example: QUEEN QUEEN, ACE ACE, etc.)
    private boolean firstTwoCardsHasEqualValue(Seat seat)
    {
        return (seat.getSeatsCards().get(0).getValue().equals(seat.getSeatsCards().get(1).getValue()));
    }

    // check if player has only initial cards
    private boolean playerHasOnlyTwoCards(Seat seat) {
        return (seat.getSeatsCards().size() == 2);
    }






}
