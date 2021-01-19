package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car();
	Car lexus = new Car();
	Car toyota = new Car();
	toyota.setModel("This is Toyota");
        System.out.println("Car"+toyota.getModel());
    }
}
