// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //ASSIGNMENT:
        // (DONE) •Create an array that holds 20 positions, give each index a random value between 1-6, then use a for loop to count
        // how many 1's were randomly generated in  the array
        // •Create another array holds 10 positions, give each index
        //a random value between 1 and 100, then find the average of all the values in the array
        //•Take the last array you made and swap 2 different index positions
        //•Take the last array you made and completely reverse the order of the array
        ///int random = (int)(Math.random() * 6) + 1;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int[] numbers = new int[20];
        int count;
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 6) + 1;
            System.out.println(numbers[i]);

            if (numbers[i] == 1) count++;
        }

        System.out.println("Total number of ones: " + count);
        System.out.println(" ");

        ///

        int[] hundred = new int[100];
        int sum =0;

        for (int q = 0; q < hundred.length; q++) {
            hundred[q] = (int) (Math.random() * 100) + 1;
            System.out.println(hundred[q]);

            for(q = 0; q < 100; q++)
            {
                sum = sum + hundred[q];
            }

            System.out.println(sum);

            


        }
    }

}





