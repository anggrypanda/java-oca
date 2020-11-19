package com.workingWithInheritance.exPag397;

public class HRExecutive extends Employee implements Interviewer {
    String[] specialization;

    public void conductInterview() {
        System.out.println("HRExecutive - conductInterview");
    }
}
