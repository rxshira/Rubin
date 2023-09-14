import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int age;
        String name;

        //2.1//

        System.out.println("ASSIGNMENT 2");

        System.out.println("Hi! What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Nice to meet you " + name + "! How old are you?");
        String stringAge = scanner.nextLine();
        age = Integer.parseInt(stringAge);

        if (age<16) {
            System.out.println("You can't drive, " + name);
        }

        else if (age>=16 && age<=17) {
            System.out.println("You can drive, but you can't vote, " + name);
        }

        else if (age>=18 && age <=24) {
            System.out.println("You can vote but not rent a car, " + name);
        }

        else if (age>=25) {
            System.out.println("You can pretty much do anything, " + name);
        }

        System.out.println(" ");

        //2.2//

        System.out.println("ASSIGNMENT 3");

        double weight, venus, mars, jupiter, saturn, uranus, neptune;
        int select;

        venus = 0.78;
        mars = 0.39;
        jupiter = 1.17;
        saturn = 1.05;
        uranus = 1.05;
        neptune = 1.23;

        System.out.println("Please enter your current earth weight:");
        weight = Double.parseDouble(scanner.nextLine());

        System.out.println("I have information for the following planets:");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  2. Uranus  3. Neptune");

        System.out.println(" ");

        System.out.println("Which planet are you visiting? (Type the number next to it)");
        select = Integer.parseInt(scanner.nextLine());

        if (select == 1) {
            System.out.println("Your weight would be " + weight*(venus+1) + " on Venus.");

        }

        else if (select == 2) {
            System.out.println("Your weight would be " + weight*(mars+1) + " on Mars.");

        }

        else if (select == 3) {
            System.out.println("Your weight would be " + weight*(jupiter+1) + " on Jupiter.");

        }

        else if (select == 4) {
            System.out.println("Your weight would be " + weight*(saturn+1) + " on Saturn.");

        }

        else if (select == 5) {
            System.out.println("Your weight would be " + weight*(uranus+1) + " on Uranus.");

        }

        else if (select == 6) {
            System.out.println("Your weight would be " + weight*(neptune+1) + " on Neptune.");

        }

        System.out.println(" ");

        //2.3//

        System.out.println("A LITTLE QUIZ");

        int one,two,three,score;
        score = 0;

        System.out.println("Ready to begin the quiz?");
        Scanner scanner1 = new Scanner(System.in);
        String start = scanner.nextLine();

//        if (start == "KEY") {
//            System.out.println("Q1)3, Q2)1, Q3)2");
//
//        }

        System.out.println("Q1) Who is the lead guitarist or the band ''Guns n' roses''? ");
        System.out.println("     1) Eddie Van Halen");
        System.out.println("     2) Brain May");
        System.out.println("     3) Slayer");

        Scanner scanner2 = new Scanner(System.in);
        one = Integer.parseInt(scanner.nextLine());

        if (one == 3) {
            System.out.println("Correct!");
            score++;
        }

        else {
            System.out.println("Oops, that's not right! The answer is actually 3 (Slayer)");

        }


        System.out.println("Q2) What is th best Taylor Swift album? ");
        System.out.println("     1) Speak Now (Taylor's Version)");
        System.out.println("     2) Folklore");
        System.out.println("     3) 1989");

        Scanner scanner3 = new Scanner(System.in);
        two = Integer.parseInt(scanner.nextLine());

        if (two == 1) {
            System.out.println("Correct! Speak Now is the best.");
            score++;
        }

        else {
            System.out.println("Oops, that's not right! The answer is actually 1 (Speak Now (Taylor's Version)), obviously");

        }


        System.out.println("Q3) What is the 9th track in Green Day's 2004 album 'American Idiot'?");
        System.out.println("     1) Boulevard of broken dreams");
        System.out.println("     2) Whatsername");
        System.out.println("     3) Wake me up when September ends");

        Scanner scanner4 = new Scanner(System.in);
        three = Integer.parseInt(scanner.nextLine());

        if (three == 2) {
            System.out.println("Correct!");
            score++;
        }

        else {
            System.out.println("Oops, that's not right! The answer is actually 2 (Whatsername)");

        }

        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing! :)");













    }
    }
