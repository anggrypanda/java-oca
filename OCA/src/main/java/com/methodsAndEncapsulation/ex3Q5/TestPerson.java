package com.methodsAndEncapsulation.ex3Q5;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Name";
        p.height = 1.70;

        anotherMethod(p);
        System.out.println(p.name);
        someMethod(p);
        System.out.println(p.name);
        System.out.println(p.height);
    }

    static void someMethod(Person p){
        p.name = "someMethod";
        System.out.println(p.name);
    }

    static void anotherMethod(Person p){
        p = new Person();
        p.name = "anotherMethod";
        p.height = 1.88;
        System.out.println(p.name);
        System.out.println(p.height);
    }
}