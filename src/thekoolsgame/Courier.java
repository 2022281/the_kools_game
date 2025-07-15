/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */

// This class extends the abstract Person class and implements
// both the Cycling and Delivering interfaces.
public class Courier extends Person implements Cycling, Delivering {
    
    // Calls the constructor of the Person superclass to set name and age.
    public Courier(String name, int age) {
        super(name, age); // Initialize name and age using the superclass
    }

    // Simulates the courier riding a bicycle.
    public void rideBike() {
        System.out.println(name + " is riding a bicycle to deliver a package.");
    }
    
    // Simulates the courier completing a delivery.
    public void deliverPackage() {
        System.out.println(name + " has delivered a package.");
    }

    // Displays a message introducing the courier.
    public void introduce() {
        System.out.println("Hey, I'm " + name + ", a courier, age " + age + ".");
    }
}
