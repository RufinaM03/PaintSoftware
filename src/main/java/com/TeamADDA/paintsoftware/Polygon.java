/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
// Polygon Class extending Shape
class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Polygon");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Polygon");
    }

    @Override
    public void move() {
        System.out.println("Moving Polygon");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Polygon");
    }
}
