package com.methodsAndEncapsulation.exW3;

public class Car {
    int carYear;
    String carName;

    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        Car yourCar = new Car(2002, "Renault");
        System.out.println(myCar.carYear + " " + myCar.carName + "\n" + yourCar.carYear + " " + yourCar.carName);
    }

    Car(int year, String name) {
        carYear = year;
        carName = name;
    }
}
