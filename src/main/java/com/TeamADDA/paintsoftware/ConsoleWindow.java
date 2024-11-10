/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author priya
 */
// ConsoleWindow Class extending Window
class ConsoleWindow extends Window {
    
    // Constructor for ConsoleWindow
    public ConsoleWindow() {
        System.out.println("ConsoleWindow created");
    }
    
    // Override open method if ConsoleWindow has a specific behavior for opening
    @Override
    public void open() {
        System.out.println("Opening Console Window");
    }

    // Override close method if ConsoleWindow has a specific behavior for closing
    @Override
    public void close() {
        System.out.println("Closing Console Window");
    }

    // Override move method if ConsoleWindow has a specific behavior for moving
    @Override
    public void move() {
        System.out.println("Moving Console Window");
    }

    // Override display method if ConsoleWindow has a specific behavior for displaying
    @Override
    public void display() {
        System.out.println("Displaying Console Window");
    }

    // Override handleEvent method if ConsoleWindow has specific event handling behavior
    @Override
    public void handleEvent() {
        System.out.println("Handling Event in Console Window");
    }

    // Additional method specific to ConsoleWindow
    public void showConsoleLogs() {
        System.out.println("Displaying console logs");
    }
}
