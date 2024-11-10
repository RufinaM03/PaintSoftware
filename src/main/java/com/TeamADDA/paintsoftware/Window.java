/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
// Window Class
class Window {
    public void open() {
        System.out.println("Opening Window");
    }

    public void close() {
        System.out.println("Closing Window");
    }

    public void move() {
        System.out.println("Moving Window");
    }

    public void display() {
        System.out.println("Displaying Window");
    }

    public void handleEvent() {
        System.out.println("Handling Event");
    }
    // Method to create and interact with a DialogBox
    public void openDialogBox() {
        DialogBox dialogBox = new DialogBox();
        dialogBox.open();  // Calls overridden open method in DialogBox
        dialogBox.display();  // Calls overridden display method in DialogBox
        dialogBox.showDialogMessage("Welcome to the Dialog Box!");  // Specific method of DialogBox
    }
}
