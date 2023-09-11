import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        ///PROBLEM 1///

        //1.1//

        int roomnum;
        double e;
        String cs;

        roomnum=113;
        e=2.71828;
        cs="Computer Science";

        System.out.println("PROBLEM 1:");

        System.out.println("This is room number " + roomnum);
        System.out.println("e is close to " + e);
        System.out.println("Im learning a bit about " + cs);

        System.out.println(" ");

        //1.2//

        String tableBorder, chem, yoga, cp, law, bio, phys, eng, free, tchem, tyoga, tcp, tlaw, tbio, tphys, teng, tfree, cspace, tspace;

        tableBorder = "+------------------------------------------------+";
        cspace = "                            ";
        tspace = "                 ";

        chem = "AP Chemistry 12 ";
        yoga = "Yoga for Life 12 ";
        cp = "Computer Programming 12 ";
        law = "Law Studies 12 ";
        bio = "AP Biology 12 ";
        phys = "AP Physics 2 12 ";
        eng = "English 12 ";
        free = "Free Block ";

        tchem  = "Mr. Slapsys";
        tyoga = "Ms. T";
        tcp = "Mr. Zaremba";
        tlaw = "Mr. Yetman";
        tbio = "Mr. Wilkie";
        tphys = "Mr. Tang";
        teng = "Ms. Au";
        tfree = "NONE";

        System.out.println("YOUR SCHEDULE:");

        System.out.println(tableBorder);

        System.out.println("|1|" + cspace.substring(0,cspace.length()-chem.length()) + chem + "|" + tspace.substring(0,tspace.length()-tchem.length()) + tchem + "|" );
        System.out.println("|2|" + cspace.substring(0,cspace.length()-yoga.length()) + yoga + "|" + tspace.substring(0,tspace.length()-tyoga.length()) + tyoga + "|" );
        System.out.println("|3|" + cspace.substring(0,cspace.length()-cp.length()) + cp + "|" + tspace.substring(0,tspace.length()-tcp.length()) + tcp + "|" );
        System.out.println("|4|" + cspace.substring(0,cspace.length()-law.length()) + law + "|" + tspace.substring(0,tspace.length()-tlaw.length()) + tlaw + "|" );
        System.out.println("|5|" + cspace.substring(0,cspace.length()-bio.length()) + bio + "|" + tspace.substring(0,tspace.length()-tbio.length()) + tbio + "|" );
        System.out.println("|6|" + cspace.substring(0,cspace.length()-phys.length()) + phys + "|" + tspace.substring(0,tspace.length()-tphys.length()) + tphys + "|" );
        System.out.println("|7|" + cspace.substring(0,cspace.length()-eng.length()) + eng + "|" + tspace.substring(0,tspace.length()-teng.length()) + teng + "|" );
        System.out.println("|8|" + cspace.substring(0,cspace.length()-free.length()) + free + "|" + tspace.substring(0,tspace.length()-tfree.length()) + tfree + "|" );

        System.out.println(tableBorder);

        System.out.println(" ");

        //1.3//

        double hotDog, tax;
        int drinks;
        int hotDogNum;
        int drinksNum;

        hotDog = 5.50;
        tax = 0.12;
        drinks = 2;
        drinksNum = 2;

        System.out.println("HOT DOG STAND:");

        System.out.println("Hot Dog Price: $" + hotDog);
        System.out.println("Drinks Price: $" + drinks);
        System.out.println("Tax: " + tax*100 + "%");

        System.out.println("How many Hot Dogs do you want? ");
        Scanner scanner = new Scanner(System.in);
        hotDogNum = Integer.parseInt(scanner.nextLine());

        System.out.println("How many drinks do you want? ");
        Scanner scanner1 = new Scanner(System.in);
        drinksNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Your price before tax: $" + (hotDog*hotDogNum) + (drinks*drinksNum));
        System.out.println("Your price after tax: $" + (tax+1)*((hotDog*hotDogNum) + (drinks*drinksNum)));

    }



}
