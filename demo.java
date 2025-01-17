import java.util.Scanner;
abstract class Transportation {
    //Abstract method
    public abstract void travel();
}

//1st implementation of the abstract class
class AstonMartin extends Transportation {
    @Override
    public void travel() {
        System.out.println("Nice too see you back behind the wheel, 007! Good luck on your mission!");
    }
}

//2nd implementation of the abstract class
class Yamaha extends Transportation {
    @Override
    public void travel() {
        System.out.println("Welcome to Austin Texas! The legendary MotoGP world champion motorbike racer Valentino Rossi leaves the paddock to take his starting position for the Americas GP!");
    }
}

public class demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your adventure!");
        System.out.println("1. Aston Martin");
        System.out.println("2. Yamaha");
        System.out.print("Enter you choice (1 or 2): ");

        int choice = 0;
        boolean validInput = false;

        //Input validation
        while(!validInput) {
            if (scan.hasNextInt())
            {
                choice  = scan.nextInt();
                if (choice == 1 || choice == 2) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter 1 for Aston Martin or 2 for Yamaha.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2) 1: Aston Martin or 2: Yamaha.");
                scan.next(); //clear invalid input
            }
        }
        //Polymorphic variable
        Transportation transport;

        //Assign output based on user input
        if (choice == 1) {
            transport = new AstonMartin();
        } else {
            transport = new Yamaha();
        }

        //Call method on the polymorphic variable
        transport.travel();

        scan.close();

    }
}