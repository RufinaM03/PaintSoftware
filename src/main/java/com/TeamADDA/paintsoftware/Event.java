/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamADDA.paintsoftware;

/**
 *
 * @author rufin
 */
// Event Class
class Event {
    private String eventType;
    private Point eventPosition; // Position where the event occurred
    private long timestamp;

    public Event(String eventType, Point eventPosition, long timestamp) {
        this.eventType = eventType;
        this.eventPosition = eventPosition;
        this.timestamp = timestamp;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Point getEventPosition() {
        return eventPosition;
    }

    public void setEventPosition(Point eventPosition) {
        this.eventPosition = eventPosition;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    // Method to display event details
    public void displayEventInfo() {
        System.out.println("Event Type: " + eventType);
        System.out.println("Event Position: " + eventPosition);
        System.out.println("Event Timestamp: " + timestamp);
    }
}

