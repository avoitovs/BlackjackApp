package com.example.antons.blackjackapp.BackEnd.GameStates;

import android.util.Log;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;
import com.example.antons.blackjackapp.BackEnd.CoreFunctions;
import com.example.antons.blackjackapp.BackEnd.GameSession;
import com.example.antons.blackjackapp.BackEnd.Participants.Dealer;
import com.example.antons.blackjackapp.BackEnd.Participants.Player;
import com.example.antons.blackjackapp.BackEnd.Seat;

import java.util.ArrayList;
import java.util.List;

/**
 * This class holds implementation of dealing initial cards
 */

public class DealInitialCardsHelper {

    private GameSession gameSession;
    private Player player;
    private Dealer dealer;


    public DealInitialCardsHelper(GameSession gameSession, Player player, Dealer dealer) {
        this.gameSession = gameSession;
        this.dealer = dealer;
        this.player = player;
        dealInitialCards();
    }

    // Overall view of initial cards dealing logic
    private void dealInitialCards (){

        // For each player's seat deal player's initial cards
        int seatNumber = 1;
        for (Seat seat :player.getPlayersSeats()){
            Log.v("DealInitialCards","Dealing initial cards for seat "+ seatNumber);
            dealInitialCardsPlayer(seat);
            seatNumber++;
        }
        // deal dealer's initial card
        Log.v("DealInitialCards","Dealing initial cards for dealer");
        dealInitialCardsDealer();

    }

    // Implementation of dealing initial cards for player
    private void dealInitialCardsPlayer (Seat seat){
        List<Card> playersInitialCards = new ArrayList<>();

        Card firstCard = gameSession.shoe.getRandomCard();
        playersInitialCards.add(firstCard);

        Card secondCard = gameSession.shoe.getRandomCard();
        playersInitialCards.add(secondCard);

        seat.setSeatsCards(playersInitialCards);
        seat.setTotalScore(CoreFunctions.ScoreUpdate(playersInitialCards));


        blackJackValidation(seat);

    }

    // Implementation of dealing initial cards for dealer
    private void dealInitialCardsDealer (){
        List<Card> dealerInitialCards = new ArrayList<>();

        Card firstCard = gameSession.shoe.getRandomCard();
        dealerInitialCards.add(firstCard);

        dealer.setDealersCards(dealerInitialCards);
        dealer.setScore(CoreFunctions.ScoreUpdate(dealerInitialCards));

        //offer insurance if applicable
        offerInsurance();

    }


    // Check player's cards for blackjack
    private void blackJackValidation (Seat seat){
        Log.v("DealInitialCards","Checking player's cards for blackjack");

        if (seat.getTotalScore()==21){
            seat.setHasBlackjackOnSeat(true);
        }
    }

// Insurance validation and offer
    private void offerInsurance (){
        if (dealer.getScore()==11){

            //logic

        }
    }

}
