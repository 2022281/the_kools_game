/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */

 // The Cleaner class represents a character who performs cleaning tasks.
public class Cleaner extends Person implements Cleaning {
    
    // Constructor for the Cleaner class.
    public Cleaner(String name, int age) {
        super(name, age); // Call the parent constructor to set name and age
    }

    // Implementation of the clean() method from the Cleaning interface.
    public void clean() {
        System.out.println(name + " is cleaning the area.");
    }

    // Outputs a message introducing the cleaner.
    public void introduce() {
        System.out.println("Hello, I'm " + name + ", a cleaner, age " + age + ".");
    }
}