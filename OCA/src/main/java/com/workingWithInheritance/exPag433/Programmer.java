package com.workingWithInheritance.exPag433;

class Programmer extends Employee {
    String name = "Prog";

    void printValues() {
        System.out.print(this.name + ":");
        System.out.print(this.address + ":");
        System.out.print(super.name + ":");
        System.out.print(super.address + ":");
    }
}
