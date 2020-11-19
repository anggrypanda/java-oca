package com.workingWithInheritance.exPag428;

interface Interviewer {
    int MIN_SAL = 9999;

    default void submitInterviewStatus() {
        System.out.println(this);
        System.out.println(this.MIN_SAL);
        System.out.println(this.print());
    }

    String print();
}
