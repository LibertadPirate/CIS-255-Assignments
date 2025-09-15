//Christopher Kimball
//CIS-255
//Project3
//Github link: https://github.com/LibertadPirate/CIS-255-Assignments/tree/main/Project3

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            //display
            System.out.println("*****************************************");
            System.out.println("*                 MENU                  *");
            System.out.println("*****************************************");
            System.out.println("* 1 - Enter weight and get feedback     *");
            System.out.println("* 2 - Exit                              *");
            System.out.println("*****************************************");
            
            System.out.print("Enter your menu selection: ");
            int choice = input.nextInt();

            if (choice == 1) {
                //startmessage
                System.out.println("Welcome to the Weight Program that does absolutely nothing!");
                System.out.print("Please enter your weight in pounds, because this is America and the Imperial system got us to the Moon: ");

                int weight = input.nextInt();

                //mean
                String message = "";
                if (weight < 50) {
                    message = "Eat more.";
                } else if (weight <= 100) {
                    message = "I hope you are short.";
                } else if (weight <= 200) {
                    message = "Quite average.";
                } else if (weight <= 300) {
                    message = "I hope you are tall.";
                } else if (weight <= 500) {
                    message = "Into sumo?";
                } else {
                    message = "You liar!";
                }

                //border
                System.out.println("\n--------stupidborder---------");
                System.out.println("| " + message + " |");
                System.out.println("--------stupidborder---------\n");
                
                //returntomenu
                System.out.print("Do you want to return to the main menu? (y/n): ");
                String response = input.next();
                if (!response.toLowerCase().startsWith("y")) {
                    continueProgram = false;
                    System.out.println("Peace");
                }
            }
            else if (choice == 2) {
                continueProgram = false;
                System.out.println("Peace");
            }
            else {
                System.out.println("That is an invalid menu option!");
                System.out.print("Do you want to return to the main menu? (y/n): ");
                String response = input.next();
                if (!response.toLowerCase().startsWith("y")) {
                    continueProgram = false;
                    System.out.println("Peace");
                }
            }
        }

        input.close();
    }
}
