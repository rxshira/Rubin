package com.shira.module3_1;

public class Fibonacci {  
    public static int nth(int n){
        return (n <= 1)? n : nth(n-1) + nth(n-2);  
    }

    public static int sumFirstN(int n){
        return nth(n+2)-1;
    }
}
