package com.methodsAndEncapsulation.exPag188;

public class Employee {
    String name;
    int age;
    int id;

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ana", 20);
        Employee emp2 = new Employee(38, "Marian", 57);
        System.out.println(emp1.name + " " + emp1.age);
        System.out.println(emp2.age + " " + emp2.name + " " + emp2.id);

    }

    Employee() {
        this(null, 0);
    }

    Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    Employee(int newAge, String newName, int newId){
        age = newAge;
        name = newName;
        id = newId;
    }
}