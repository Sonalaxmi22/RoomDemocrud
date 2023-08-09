package com.room.roomdemo.model;

public class Room {
    private int id;
    private int number;
    private String type;
    private String availability;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }

    public Room(int id, int number, String type, String availability) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.availability = availability;
    }
}
