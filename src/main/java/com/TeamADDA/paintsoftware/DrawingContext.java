
package com.TeamADDA.paintsoftware;
class DrawingContext {
    
    // Method to set a point in the drawing context
    public void setPoint(int x, int y) {
        System.out.println("Setting point at (" + x + ", " + y + ") in DrawingContext");
    }

    // Method to clear the screen
    public void clearScreen() {
        System.out.println("Clearing screen in DrawingContext");
    }

    // Method to get the vertical size (height) of the screen/context
    public int getVerticalSize() {
        // In a real-world scenario, this could return the height of the screen/window
        return 600;  // Just an example value
    }

    // Method to get the horizontal size (width) of the screen/context
    public int getHorizontalSize() {
        // In a real-world scenario, this could return the width of the screen/window
        return 800;  // Just an example value
    }
}