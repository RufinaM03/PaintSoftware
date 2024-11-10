/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
// Rectangle Class extending Shape
class Rectangle extends Shape {
    Point topLeft;
    int width;
    int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }
    
    @Override
 public void draw() {
        System.out.println("Drawing Rectangle at top-left corner " + topLeft + " with width " + width + " and height " + height);
    }

    @Override
    public void erase() {
        System.out.println("Erasing Rectangle");
    }

    @Override
    public void move() {
        System.out.println("Moving Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }
}
