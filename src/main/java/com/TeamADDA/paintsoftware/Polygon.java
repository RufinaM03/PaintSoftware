/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
import java.util.List;
import java.util.ArrayList;
// Polygon Class extending Shape
class Polygon extends Shape {
   List<Point> vertices;

    public Polygon() {
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Point point) {
        vertices.add(point);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Polygon with vertices: ");
        for (Point vertex : vertices) {
            System.out.print(vertex + " ");
        }
        System.out.println();
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
