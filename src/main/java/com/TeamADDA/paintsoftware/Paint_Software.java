/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */

public class Paint_Software {
    public static void main(String[] args) {
        // Create instances of shapes
        Circle circle = new Circle(5.0f, 10);
        Rectangle rectangle = new Rectangle();
        Polygon polygon = new Polygon();

        // Use shapes
        circle.draw();
        circle.setRadius(10.0f);
        System.out.println("Area of circle: " + circle.area(circle.radius));

        rectangle.draw();
        polygon.draw();

        // Create Window and handle event
        Window window = new Window();
        window.open();
        window.display();
        window.handleEvent();

        
    }
}
