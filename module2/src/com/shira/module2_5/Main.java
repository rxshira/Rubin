package com.shira.module2_5;

public class Main {
    public static void main(String[] args) {
        EnglishCaesarCipher ecc = new EnglishCaesarCipher(4);
        System.out.println(ecc.cipherText("abcd"));
        System.out.println(ecc.decipherText("cdef"));

        String message = "good morning";
        String cipheredMessage = ecc.cipherText(message);
        EnglishCaesarCipherCracker cracker = new EnglishCaesarCipherCracker("words_alpha.txt");
        int key = cracker.crackShiftOfMessage(cipheredMessage);
        System.out.println("The key is "+key);
    }
}
