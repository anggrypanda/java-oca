package com.methodsAndEncapsulation.exPag201;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Ana", 36);

        System.out.println(person1.getName());
        resetValueOfMemberVariable(person1);
        System.out.println(person1.getName());
        System.out.println(person2.getName() + " " + person2.getAge());
    }

    public static void resetValueOfMemberVariable(Person p1) {
        p1.setName("Rodrigue");
    }
}
