/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */
// The Food class represents edible items in the game.
public class Food extends Item {

    // It calls the constructor of the Item superclass to set the food's name.
    public Food(String name) {
        super(name); // Initialize the food item's name using the Item constructor
    }

    // It simulates eating the food by printing a message to the console.
    public void use() {
        System.out.println("Eating food: " + name);
    }
}
