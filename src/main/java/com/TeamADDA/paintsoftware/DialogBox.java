/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author priya
 */
// DialogBox Class extending Window
class DialogBox extends Window {

    // Constructor for DialogBox
    public DialogBox() {
        System.out.println("DialogBox created");
    }

    // Override open method if DialogBox has specific behavior for opening
    @Override
    public void open() {
        System.out.println("Opening Dialog Box");
    }

    // Override close method if DialogBox has specific behavior for closing
    @Override
    public void close() {
        System.out.println("Closing Dialog Box");
    }

    // Override move method if DialogBox has specific behavior for moving
    @Override
    public void move() {
        System.out.println("Moving Dialog Box");
    }

    // Override display method if DialogBox has specific behavior for displaying
    @Override
    public void display() {
        System.out.println("Displaying Dialog Box");
    }

    // Override handleEvent method if DialogBox has specific event handling behavior
    @Override
    public void handleEvent() {
        System.out.println("Handling Event in Dialog Box");
    }

    // Additional method specific to DialogBox
    public void showDialogMessage(String message) {
        System.out.println("Dialog Message: " + message);
    }
}