package com.shira.module2_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * A class that represents a unique word counter, that can count home many unique words are there in a given text.
 * @author Shira Rubin
 * @version 1
 */
public class UniqueWordCounter {

    private int numOfWords;

    public UniqueWordCounter(String fileLocation){
        numOfWords = countUniqueWords(fileLocation);
    }

    public int getNumOfWords(){
        return numOfWords;
    }

    public int countUniqueWords(String fileLocation){
        HashSet<String> uniqueWords = new HashSet<String>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileLocation));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
        while (scanner.hasNext()) {
            // making the word into a lowercase, keeping only letters and numbers
            String word = scanner.next().toLowerCase().replaceAll("[^a-z0-9]", "");
            uniqueWords.add(word);
        }
        scanner.close();
        return uniqueWords.size();       
    }
}
