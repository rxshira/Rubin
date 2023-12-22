package com.shira.module2_4;

public class Main {
    public static void main(String[] args) {
        UniqueWordCounter uwc = new UniqueWordCounter("illiad.txt");
        System.out.println("Num of words is "+uwc.getNumOfWords());
    }
}
