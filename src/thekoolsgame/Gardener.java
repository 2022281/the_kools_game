/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */

// The Gardener class represents a person who works as a gardener in the game.
public class Gardener extends Person {
    
    // Calls the constructor of the Person superclass to set name and age.
    public Gardener(String name, int age) {
        super(name, age); // Use the parent constructor to initialize name and age
    }

    // Simulates the gardener planting flowers.
    public void plant() {
        System.out.println(name + " is planting flowers.");
    }

    // Displays a message introducing the gardener.
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a gardener, age " + age + ".");
    }
}
