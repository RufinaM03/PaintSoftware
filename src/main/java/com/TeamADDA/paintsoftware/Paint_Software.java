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
        // Create points
        Point centerPoint = new Point(50, 50);
        Point topLeftPoint = new Point(10, 20);
        // Create instances of shapes
        Circle circle = new Circle(5.0f, centerPoint);
        Rectangle rectangle = new Rectangle(topLeftPoint, 100, 50);
        Polygon polygon = new Polygon();

        // Use shapes
        circle.draw();
        circle.setRadius(10.0f);
        System.out.println("Area of circle: " + circle.area(circle.radius));

        rectangle.draw();
        
        // Create a polygon and add vertices
        polygon.addVertex(new Point(0, 0));
        polygon.addVertex(new Point(10, 0));
        polygon.addVertex(new Point(10, 10));
        polygon.addVertex(new Point(0, 10));

        polygon.draw();

        // Create Window and handle events
        Window window = new Window();
        window.open();
        window.display();
        window.handleEvent();
        window.openDialogBox();
        window.openConsoleWindow();
        window.manageDrawingContext();

         // Create a Frame
        Frame mainFrame = new Frame("Main Application Window", 800, 600);
        mainFrame.display();
        mainFrame.maximize();

        // Create an Event
        Point clickPosition = new Point(150, 300);
        Event clickEvent = new Event("click", clickPosition, System.currentTimeMillis());
        clickEvent.displayEventInfo();
    }
}
