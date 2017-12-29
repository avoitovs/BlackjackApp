package com.example.antons.blackjackapp.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;
import com.example.antons.blackjackapp.BackEnd.CoreFunctions;
import com.example.antons.blackjackapp.BackEnd.GameStates.Decisions.DecisionMaking;
import com.example.antons.blackjackapp.R;
import com.example.antons.blackjackapp.BackEnd.GameSession;

import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class JustPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final GameSession gameSession = new GameSession();


        setContentView(R.layout.activity_just_play);





        // Bet placement
        final Button placeFiveEur = findViewById(R.id.bet_5_eur);
        placeFiveEur.setOnClickListener((View view) ->{
                gameSession.round.betPlacement();

        });


        // Start round
        final Button play =  findViewById(R.id.play);
        play.setOnClickListener((View view) ->{

                gameSession.round.dealInitialCards();
                play.setVisibility(View.INVISIBLE);
                placeFiveEur.setVisibility(View.INVISIBLE);
                TextView dealersCards = findViewById(R.id.dealers_cards);
                dealersCards.setText(prindDealersCards(gameSession));

                TextView playersCards = findViewById(R.id.players_cards);
                playersCards.setText(printPlayersCards(gameSession));

        });

        // Hit


        // Stand




    }

    private String prindDealersCards (GameSession gameSession){

        String text = (gameSession.dealer.getDealersCards().get(0).getValue() + " " +
                gameSession.dealer.getDealersCards().get(0).getSuit());
                return text;
    }

    private String printPlayersCards (GameSession gameSession){

        String text = (gameSession.player.getPlayersSeats().get(0).getSeatsCards().get(0).getValue() + " " +
                        gameSession.player.getPlayersSeats().get(0).getSeatsCards().get(0).getSuit() + " / " +
                        gameSession.player.getPlayersSeats().get(0).getSeatsCards().get(1).getValue() + " " +
                        gameSession.player.getPlayersSeats().get(0).getSeatsCards().get(1).getSuit());
        return text;
    }






}
