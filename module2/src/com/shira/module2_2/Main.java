package com.shira.module2_2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        LinkedList<Card> seven = d.pollSeven();
        for(Card c : seven){
            System.out.println(c);
        }
        System.out.println(d);
    }
}
