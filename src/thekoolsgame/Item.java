/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */
// The abstract Item class represents any non-person object in the game that can be used.
public abstract class Item {
    protected String name;

    // Constructor for the Item class.
    public Item(String name) {
        this.name = name;
    }

    // Defines what happens when the item is used.
    public abstract void use();
}
