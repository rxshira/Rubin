package com.shira.module3_2;

public class HanoiTower {

    public static void move(int n, int from, int to, int spare) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            move(n - 1, from, spare, to);
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            move(n - 1, spare, to, from);
        }
    }
}
