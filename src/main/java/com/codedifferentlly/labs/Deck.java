package com.codedifferentlly.labs;

import com.codedifferentlly.labs.cards.Card;
import com.codedifferentlly.labs.cards.CardSuit;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final int MAX_NUMBER_OF_CARDS = 52;
    private ArrayList<Card> cards;
    private boolean shuffled;

    public Deck() {
        cards = new ArrayList<>();
        shuffled = false;


        //How do i initialize the deck
    }

    public void shuffle() {
        Collections.shuffle(cards);
        shuffled = true;
    }

    public Boolean isShuffled() {
        return shuffled;
    }

    public ArrayList<Card> deal(int numberOfCards) {
        if (!shuffled) {
            shuffle();
        }

        ArrayList<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            dealtCards.add(cards.remove(0)); // take from top of deck
        }
        return dealtCards;
    }
}

