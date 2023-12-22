package com.shira.module2_5;

public class EnglishCaesarCipher extends CaesarCipher{

    public EnglishCaesarCipher(int step){
        super(step);
    }

    @Override
    protected String[][] getAlphabet() {
        String[] lowerCase = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        return new String[][]{lowerCase, upperCase};
    }
    
}
