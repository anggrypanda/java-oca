package com.methodsAndEncapsulation.exPag201;

public class Person {
    private String name;
    private int age;


    Person(String newName){
        name = newName;
    }
    Person(String newName, int newAge){
        name = newName;
        age = newAge;
    }

    public String getName(){
        return name;
    }
    public void setName(String val){
        name = val;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int ageVal){
        age = ageVal;
    }
}
