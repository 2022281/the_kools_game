/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thekoolsgame;


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
    }
}
