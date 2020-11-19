package com.workingWithInheritance.exPag397;

public class Programmer extends Employee implements Trainable {
    String[] programmingLanguages = {"Java", "C#", "Go"};

    void writeCode() {
    }

    public void attendTraining() {
        System.out.println("Programmer - attendTraining");
    }
}
