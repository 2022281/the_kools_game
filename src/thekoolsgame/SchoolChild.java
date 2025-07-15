/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */
// The SchoolChild class represents a young person who rides a bike to school.
public class SchoolChild extends Person implements Cycling {

    // Calls the superclass constructor to initialize name and age.
    public SchoolChild(String name, int age) {
        super(name, age); // Initialize name and age using the Person constructor
    }

    // Simulates the school child riding a bike.
    public void rideBike() {
        System.out.println(name + " is riding a bike to school.");
    }

    // Displays an introduction for the school child.
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a school child, age " + age + ".");
    }
}