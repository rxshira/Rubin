import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int win, lose;
        win=0;
        lose=0;

        String choose;

        System.out.println("Let's play rock paper scissors! \nType [r] to play rock, [p] to play paper, or [s] to play scissors. ");
        System.out.println("==================================================================");
        System.out.println("Wins: " + win + " Losses: " + lose);
        System.out.println("Player's Choice:");
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextLine();


        int random = (int)(Math.random() * 3 + 1);
        //debug: System.out.println(random);

        //as long as as long as the things are not the same print lose, if they are the same, print tie, and so on
        //






    }
}