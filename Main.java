import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to play rock paper scissors? (yes/no)");
        String again = scanner.nextLine();
        System.out.println();

        if (again.equals("no")) {
            System.out.println("Ok, see you next time!");
        }

        else {
            do {

                System.out.println("Choose 'rock', 'paper' or 'scissors'!");
                String play = scanner.nextLine();
                System.out.println();

                if (play.equals("rock") || play.equals("paper") || play.equals("scissors")) {
                    System.out.print("Opponent Choice: ");
                }

                //bad
                else {
                    System.out.println("*oops! that didn't work. please only type rock, paper, or scissors.");
                    System.exit(1);
                }

                int random = (int) (Math.random() * 3) + 1;

                String cChoice;
//computer choose (rock)
                if (random == 1) {
                    cChoice = "rock";
                    System.out.println("rock");
                }

//computer choose (paper)
                else if (random == 2) {
                    cChoice = "paper";
                    System.out.println("paper");
                }

//computer choose (scissors)
                else {
                    cChoice = "scissors";
                    System.out.println("scissors");
                }

                System.out.println();

//points
                double points;
                points = 0;

//tie
                if (play.equals(cChoice)) {
                    System.out.println("Tie!");
                    points = points + 0.5;
                    System.out.println("Total points: " + points);
                }

//rock
                else if (play.equals("rock")) {

                    if (cChoice.equals("paper")) {
                        System.out.println("Opponent Wins!");
                        System.out.println("Total points: " + points);
                    } else {
                        System.out.println("You Win!");
                        points = points + 1;
                        System.out.println("Total points: " + points);
                    }
                }

//paper
                else if (play.equals("paper")) {

                    if (cChoice.equals("scissors")) {
                        System.out.println("Opponent Wins!");
                        System.out.println("Total points: " + points);
                    } else {
                        System.out.println("You Win!");
                        points = points + 1;
                        System.out.println("Total points: " + points);
                    }
                }

//scissors
                else {

                    if (cChoice.equals("paper")) {
                        System.out.println("You Win!");
                        points = points + 1;
                        System.out.println("Total points: " + points);
                    } else {
                        System.out.println("Opponent Wins!");
                        System.out.println("Total points: " + points);
                    }
                }

                System.out.println("=================");
                System.out.println("Would you like to play rock paper scissors? (yes/no)");
                again = scanner.nextLine();
                System.out.println();

            } while (again.equals("yes"));

            System.out.println("Thanks for playing!");

        }

    }

    }