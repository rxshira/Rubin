package com.shira.module2_3;

/** 
 * An enum of the different suits of cards in a deck
 * @author Shira Rubin
 * @version 2
*/
public enum Suit {
    SPADE(1), HEARTS(2), CLUBS(3), DIAMOND(4);

    private int value;

    private  Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
