package com.driver;

public class Car extends Vehicle {
    private final int wheels;
    private final String type;
    private final int doors;
    private final int gears;
    private final boolean isManual;
    private final int seats;
    private int currentGear;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getGears() {
        return this.gears;
    }

    public int getSeats() {
        return this.seats;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    public String getType() {
        return this.type;
    }

    public boolean isManual(){
        return this.isManual;
    }
}
