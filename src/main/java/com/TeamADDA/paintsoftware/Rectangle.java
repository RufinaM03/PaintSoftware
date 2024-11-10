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
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
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
