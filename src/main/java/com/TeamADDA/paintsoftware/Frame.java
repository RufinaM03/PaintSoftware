/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
// Frame Class extending Window
class Frame extends Window {
    private String title;
    private int width;
    private int height;

    public Frame(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("Displaying Frame titled: " + title + " with dimensions " + width + "x" + height);
    }

    // Method to maximize the frame
    public void maximize() {
        System.out.println("Maximizing the Frame");
        // Add logic to maximize the frame
    }

    // Method to minimize the frame
    public void minimize() {
        System.out.println("Minimizing the Frame");
        // Add logic to minimize the frame
    }
}

