/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */
// The Tool class represents an item that can be used as a tool in the game.
public class Tool extends Item {
    
    // It calls the constructor of the Item superclass to set the tool's name.
    public Tool(String name) {
        super(name); // Initializes the tool's name using the Item class constructor
    }

    // It simulates using the tool by printing a message to the console.
    public void use() {
        System.out.println("Using tool: " + name);
    }
}