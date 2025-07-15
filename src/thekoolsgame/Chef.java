/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */

// The Chef class represents a character who works as a chef in the game.
public class Chef extends Person {
    public Chef(String name, int age) {
        super(name, age); // Call the parent constructor to set name and age
    }

    // It prints a message indicating the chef is cooking.
    public void cook() {
        System.out.println(name + " is cooking delicious food.");
    }

    // It displays the chef's introduction.
    public void introduce() {
        System.out.println("I'm " + name + ", a chef, age " + age + ".");
    }
}
