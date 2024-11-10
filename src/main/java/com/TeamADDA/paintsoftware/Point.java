/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
// Point Class
class Point {
    private int x;
    private int y;

    // Constructor to initialize the point
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for X coordinate
    public int getX() {
        return x;
    }

    // Setter for X coordinate
    public void setX(int x) {
        this.x = x;
    }

    // Getter for Y coordinate
    public int getY() {
        return y;
    }

    // Setter for Y coordinate
    public void setY(int y) {
        this.y = y;
    }

    // Method to move the point by a specified offset
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Method to calculate the distance to another point
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }

    // Override toString method to display point coordinates
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

