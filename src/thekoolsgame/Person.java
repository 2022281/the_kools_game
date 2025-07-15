/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thekoolsgame;

/**
 *
 * @author aldol
 */
public abstract class Person {
    // Protected fields: accessible within subclasses
    protected String name; // The name of the person
    protected int age; // The age of the person

    // Constructor to initialize name and age of the person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses.
    public abstract void introduce();
}
