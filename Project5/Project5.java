//Christopher Kimball
//CIS- 255
//Project5
//Githublink: https://github.com/LibertadPirate/CIS-255-Assignments/tree/main/Project5

import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        //price
        double dvdPrice = 14.99;
        double blurayPrice = 19.99;
        double uhdPrice = 26.99;
        
        //tax
        double taxRate = 0.09;
        
        //totals
        double subtotal = 0.0;
        double total = 0.0;
        
        Scanner in = new Scanner(System.in);
        char continueChoice;
        
        //mainmenu * loops until user prompts to exit *
        do {
            //intro
            System.out.print("\nDo you want to rent a movie? ");
            
            //input
            char response = in.next().charAt(0);
            
            //evaluserinput
            if (response == 'Y' || response == 'y') {
                // Prompt for movie type
                System.out.print("\nDVD, Blu-ray, or 4K UHD? [D, B, or U]: ");
                char movieType = in.next().charAt(0);
                
                //movietypestatements
                switch (Character.toUpperCase(movieType)) {
                    case 'D':
                        System.out.printf("\nYou added a DVD to your cart for $%.2f.\n", dvdPrice);
                        subtotal = dvdPrice;
                        break;
                    case 'B':
                        System.out.printf("\nYou added a Blue-ray movie to your cart for $%.2f.\n", blurayPrice);
                        subtotal = blurayPrice;
                        break;
                    case 'U':
                        System.out.printf("\nYou added a 4K UHD movie to your cart for $%.2f.\n", uhdPrice);
                        subtotal = uhdPrice;
                        break;
                    default:
                        System.out.println("\nYou made an invalid selection!");
                }
                
                //total
                if (subtotal > 0) {
                    total = subtotal + (subtotal * taxRate);
                    System.out.printf("\nYour cart subtotal is $%.2f.\n", subtotal);
                    System.out.printf("\nAfter a tax rate of %.1f%% is added to the subtotal,\n", taxRate * 100);
                    System.out.printf("a charge of $%.2f will be applied to your credit card.\n", total);
                }
                
            } else if (response == 'N' || response == 'n') {
                System.out.println("\nWe are sorry that you are not interested.");
            } else {
                System.out.println("\nYou made an invalid selection!");
            }
            
            //loopprompt
            System.out.print("\nWould you like to return to the main menu or exit? [M/E]: ");
            continueChoice = in.next().charAt(0);
            
            //validate
            while (Character.toUpperCase(continueChoice) != 'M' && Character.toUpperCase(continueChoice) != 'E') {
                System.out.println("\nInvalid selection! Please choose M for main menu or E to exit.");
                System.out.print("Would you like to return to the main menu or exit? [M/E]: ");
                continueChoice = in.next().charAt(0);
            }
            
            //reset
            if (Character.toUpperCase(continueChoice) == 'M') {
                subtotal = 0.0;
                total = 0.0;
            }
            
        } while (Character.toUpperCase(continueChoice) == 'M');
        
        //saygoodbyebye
        System.out.println("\nThank you for shopping. Goodbye!");
        
        in.close();
    }

}
