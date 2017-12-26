package com.Madpoints;

public class Car {
    private String make;
    private String model;
    private int year;
    private int doors;
    private String color;

//    public void setCar(String make, String model, int year, int doors, String color) {
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.doors = doors;
//        this.color = color;
//    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        this.model = validModel;
    }

    public String getModel() {
        return this.model;
    }

}
