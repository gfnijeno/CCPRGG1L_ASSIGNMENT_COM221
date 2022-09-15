import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String crush = revealMyCrush();
        System.out.println(crush);

        revealMyOrder();

        scan.close();
    }

    static String revealMyCrush() {
        System.out.println("This will reveal the name of your crush");

        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        System.out.print("Enter the name of your crush: ");

        String nameOfMyCrush = scan.nextLine();

        System.out.print("Enter the name of your second crush: ");

        String MyCrush = scan.nextLine();

        return name + " loves " + nameOfMyCrush + " and " + MyCrush + " so much <33";
    }

    static void revealMyOrder() {
        System.out.print("Enter your first order: ");
        String order1 = scan.nextLine();

        System.out.print("The price is: ");
        double x = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter another order: ");
        String order2 = scan.nextLine();
        
        System.out.print("The price is: ");
        double y = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter another order: ");
        String order3 = scan.nextLine();
        
        System.out.print("The price is: ");
        double z = scan.nextDouble();

        Double total = x + y + z;

        System.out.println("Your orders are " + order1 + ", " + order2 + ", and " + order3 );
        System.out.println("Your total is " + total );
    }
}
