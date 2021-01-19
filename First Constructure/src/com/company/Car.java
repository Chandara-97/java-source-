package com.company;

public class Car {
    private int wheel;
    private int door;
    public String model;
    private String engine;
    private String color;

    public Car() {

    }

    public Car(int wheel, int door, String model, String engine, String color) {
        this.wheel = wheel;
        this.door = door;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
