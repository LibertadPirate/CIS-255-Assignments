//Christopher Kimball
//CIS-255
//Project4-Menu
//Github: https://github.com/LibertadPirate/CIS-255-Assignments/tree/main/Project4
import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            //mainmenu
            System.out.println("*****************************************");
            System.out.println("*                 MENU                  *");
            System.out.println("*****************************************");
            System.out.println("* 1 - Increment a number by 1.          *");
            System.out.println("* 2 - Check if a number is odd or even. *");
            System.out.println("* 3 - Decrement a number by 1.          *");
            System.out.println("* 4 - Sum 2 numbers.                    *");
            System.out.println("* 5 - Exit                              *");
            System.out.println("*****************************************");

            //prompt
            System.out.print("Enter your menu selection: ");
            int choice = scanner.nextInt();

            //userinputstuff
            if (choice == 1) {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                System.out.println("The incremented number is " + (num + 1));
            }
            else if (choice == 2) {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("That number is even.");
                } else {
                    System.out.println("That number is odd.");
                }
            }
            else if (choice == 3) {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                System.out.println("The decremented number is " + (num - 1));
            }
            else if (choice == 4) {
                System.out.print("Enter an integer: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter another integer: ");
                int num2 = scanner.nextInt();
                System.out.println("The sum of the two numbers is " + (num1 + num2));
            }
            else if (choice == 5) {
                continueProgram = false;
                System.out.println("Exiting program...");
            }
            else {
                System.out.println("That is an invalid menu option!");
            }

            //prompttomenu
            if (choice != 5) {
                System.out.print("Do you want to return to the main menu? (y/n): ");
                String response = scanner.next();
                if (!response.toLowerCase().startsWith("y")) {
                    continueProgram = false;
                    System.out.println("Exiting program...");
                }
            }
        }

        scanner.close();
    }
}

