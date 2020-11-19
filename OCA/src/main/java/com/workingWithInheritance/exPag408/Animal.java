package com.workingWithInheritance.exPag408;

class Animal implements Jumpable, Moveable {
    public static void main(String[] args) {
        System.out.println(maxDistance());
    }

    static int maxDistance() {
        return 50;
    }
}
