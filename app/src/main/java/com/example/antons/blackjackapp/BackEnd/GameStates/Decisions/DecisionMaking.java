package com.example.antons.blackjackapp.BackEnd.GameStates.Decisions;

import android.util.Log;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;
import com.example.antons.blackjackapp.BackEnd.CoreFunctions;
import com.example.antons.blackjackapp.BackEnd.GameSession;
import com.example.antons.blackjackapp.BackEnd.Seat;
import com.example.antons.blackjackapp.BackEnd.SplitHand;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements decisions such as HIT, DOUBLE DOWN etc.
 */

public class DecisionMaking {



    // Implementation of HIT
    public static void hit (Seat seat, GameSession gameSession){
        Log.v("Decision making", "HIT");
        seat.getSeatsCards().add(gameSession.shoe.getRandomCard());

        // Update total score
        seat.setTotalScore(CoreFunctions.ScoreUpdate(seat.getSeatsCards()));
    }

    //Implementation of HIT for split hand
    public static void hitForSplit (Splithand hand, GameSession gameSession){
        Log.v("Decision making", "HIT for Split");

        hand.getHandsCards().add(gameSession.shoe.getRandomeCard());

        //Update total score, put list of cards to scoreUpdate methot
        hand.setTotalScore(CoreFunctions.ScoreUpdate(hand.getHandsCards()));

    }

    // Implementation of DOUBLE DOWN
    public static void doubleDown (Seat seat, GameSession gameSession){

        Log.v("Decision making", "Double down");
        seat.getSeatsCards().add(gameSession.shoe.getRandomCard());
        seat.setDoubleDownOnSeat(true);

        // update player's balance
        Log.v("Double down", "updating player's balance");
        seat.player.setBalance(seat.player.getBalance()-seat.getTotalBetOnSeat());

        // update seat's total bet
        Log.v("Double down", "updating seat's total bet");
        seat.setTotalBetOnSeat(seat.getTotalBetOnSeat()*2);

        // update total score
        seat.setTotalScore(CoreFunctions.ScoreUpdate(seat.getSeatsCards()));

    }

    public static void split (GameSession gameSession, Seat seat){

        Log.v("Decision making", "Split");
        seat.setSplitOnSeat(true);

        // update player's balance
        Log.v("Split", "updating player's balance");
        seat.player.setBalance(seat.player.getBalance()-seat.getTotalBetOnSeat());

        // update seat's total bet
        Log.v("Split", "updating seat's total bet");
        seat.setTotalBetOnSeat(seat.getTotalBetOnSeat()*2);

        //Create hand one and deal card
        List<Card> cardsHandOne = new ArrayList<>();

        cardsHandOne.add(seat.getSeatsCards().get(0));
        cardsHandOne.add(gameSession.shoe.getRandomCard());

        SplitHand handOne = new SplitHand(cardsHandOne);
        // update score for hand one
        handOne.setTotalScore(CoreFunctions.ScoreUpdate(cardsHandOne));

        //Create hand two and deal card
        List<Card> cardsHandTwo = new ArrayList<>();

        cardsHandTwo.add(seat.getSeatsCards().get(1));
        cardsHandTwo.add(gameSession.shoe.getRandomCard());

        SplitHand handTwo = new SplitHand(cardsHandTwo);
        handTwo.setTotalScore(CoreFunctions.ScoreUpdate(cardsHandTwo));

        //Split hand object creation and add to seat
        List<SplitHand> splitHands = new ArrayList<>();

        splitHands.add(handOne);
        splitHands.add(handTwo);

        seat.setSplitHands(splitHands);

    }






}
