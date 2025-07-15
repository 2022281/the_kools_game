/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */
// The Vehicle class represents a type of item that can be driven.
public class Vehicle extends Item {

    // Calls the constructor of the Item superclass to set the name of the vehicle.
    public Vehicle(String name) {
        super(name); // Initialize the vehicle's name using the Item constructor
    }

    // Simulates driving the vehicle by printing a message to the console.
    public void use() {
        System.out.println("Driving vehicle: " + name);
    }
}
