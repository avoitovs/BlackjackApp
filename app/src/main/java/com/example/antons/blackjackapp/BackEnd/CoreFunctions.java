package com.example.antons.blackjackapp.BackEnd;

import com.example.antons.blackjackapp.BackEnd.Cards.Card;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by antons on 14/12/2017.
 */

public class CoreFunctions {

    public static int scoreUpdate(List<Card> lisOfCards) {

        int temp = 0;

        Predicate<Card> notAce = card -> card.getScore() != 11;
        Predicate<Card> Ace = card -> card.getScore() == 11;

        List<Card> withoutAces = lisOfCards.stream()
                .filter(notAce)
                .collect(Collectors.toList());

        for (Card card : withoutAces) {

            temp = temp + card.getScore();

        }

        List<Card> withAces = lisOfCards.stream()
                .filter(Ace)
                .collect(Collectors.toList());
        for (Card card : withAces) {


            if (temp > 9
                    & withAces.size() > 1) {
                card.setScore(1);               //if there are several aces and other cards have score more than 9
                temp = temp + card.getScore();    // then all aces are treated as 1's
                card.setScore(11);
                continue;
            }

            if (temp + card.getScore() > 21) {
                card.setScore(1);
                temp = temp + card.getScore();
                card.setScore(11);
            } else if (temp + card.getScore() < 22) {
                temp = temp + card.getScore();
            }
        }

        return temp;
    }


}
