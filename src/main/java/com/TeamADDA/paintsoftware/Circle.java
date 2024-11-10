/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
class Circle extends Shape {
     float radius;
     Point center;

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    public double circumstance() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }

    @Override
    public void move() {
        System.out.println("Moving Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }
}
