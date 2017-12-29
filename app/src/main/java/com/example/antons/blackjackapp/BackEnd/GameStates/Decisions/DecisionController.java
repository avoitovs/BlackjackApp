package com.example.antons.blackjackapp.BackEnd.GameStates.Decisions;

import com.example.antons.blackjackapp.BackEnd.Participants.Player;
import com.example.antons.blackjackapp.BackEnd.Seat;

/**
 * This class intended to control decision flow
 */

public class DecisionController {



    private void gameplayControler (Player player){

        for (Seat seat:player.getPlayersSeats()) {

            while (seat.getTotalScore()<21){




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
