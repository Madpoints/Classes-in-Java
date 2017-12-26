package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        Car volvo = new Car();
        Car toyota = new Car();

//        volvo.setCar("Volvo", "740GL", 1989, 4, "Navy");
//        toyota.setCar("Toyota", "Corolla", 1993, 4, "Silver");

        volvo.setModel("740GL");
        toyota.setModel("Corolla");

        System.out.println(volvo.getModel());
        System.out.println(toyota.getModel());
    }
}
