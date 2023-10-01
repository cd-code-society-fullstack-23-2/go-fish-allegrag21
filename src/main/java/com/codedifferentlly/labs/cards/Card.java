package com.codedifferentlly.labs.cards;
import com.codedifferentlly.labs.cards.CardSuit;
import com.codedifferentlly.labs.cards.CardValue;

public class Card {

    private  CardSuit suit;
    private  CardValue value;

    public Card() {
        this.suit = suit;
        this.value = value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }


    @Override
    public String toString() {
        return value + " of " + suit;
    }

}
