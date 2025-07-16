/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thekoolsgame;

import java.util.Scanner;


/**
 *
 * @author aldol
 */
public class TheKoolsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create game characters with name and age
        Gardener gary = new Gardener("Gary", 45);
        Cleaner clara = new Cleaner("Clara", 38);
        Courier chris = new Courier("Chris", 25);
        SchoolChild sam = new SchoolChild("Sam", 12);
        Chef cindy = new Chef("Cindy", 30);
        
        
        // Each character introduces themselves and performs role-specific actions
        gary.introduce();
        gary.plant();

        clara.introduce();
        clara.clean();

        chris.introduce();
        chris.rideBike();
        chris.deliverPackage();

        sam.introduce();
        sam.rideBike();

        cindy.introduce();
        cindy.cook();

        System.out.println();
        
        // Create non-person items
        Tool shovel = new Tool("Shovel");
        Vehicle bike = new Vehicle("Mountain Bike");
        Food apple = new Food("Apple");

        // Each item performs its specific "use" action
        shovel.use();
        bike.use();
        apple.use();
        
        // Start of the interactive menuq
        Scanner scanner = new Scanner(System.in); // Scanner to read input from keyboard
        boolean playing = true; // Game loop control variable

        while (playing) {
            // Display character selection menu
            System.out.println("\n=== Choose a character ===");
            System.out.println("1. Gary (Gardener)");
            System.out.println("2. Clara (Cleaner)");
            System.out.println("3. Chris (Courier)");
            System.out.println("4. Sam (School Child)");
            System.out.println("5. Cindy (Chef)");
            System.out.println("0. Exit");
            
            // Read user's menu choice
            System.out.print("Enter the number of the character: ");
            int choice = scanner.nextInt();
            
// Handle the choice using a switch-case
switch (choice) {
    case 1:
        gary.introduce();
        System.out.println("1. Plant | 2. Back");
        int action1 = scanner.nextInt();
        if (action1 == 1) gary.plant();
        break;
        
    case 2:
        clara.introduce();
        System.out.println("1. Clean | 2. Back");
        int action2 = scanner.nextInt();
        if (action2 == 1) clara.clean();
        break;

    case 3:
        chris.introduce();
        System.out.println("1. Ride | 2. Deliver package | 3. Back");
        int action3 = scanner.nextInt();
        if (action3 == 1) chris.rideBike();
        else if (action3 == 2) chris.deliverPackage();
        break;

    case 4:
        sam.introduce();
        System.out.println("1. Ride | 2. Back");
        int action4 = scanner.nextInt();
        if (action4 == 1) sam.rideBike();
        break;

    case 5:
        cindy.introduce();
        System.out.println("1. Cook | 2. Back");
        int action5 = scanner.nextInt();
        if (action5 == 1) cindy.cook();
        break;
        
    case 0:
        // Exit the game
        System.out.println("Finish the game. See you soon!!!");
        playing = false;
        break;

    default:
        // Handle invalid option
        System.out.println("Wrong option!");
      }
    }
  }
}
