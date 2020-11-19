package com.workingWithInheritance.exPag397;

class Manager extends Employee implements Interviewer, Trainable {
    int teamSize;

    void reportProjectStatus() {
    }

    public void conductInterview() {
        System.out.println("Manager - conductInterview");
    }

    public String submitInterviewStatus() {
        System.out.println("Accept");
        return null;
    }

    public void attendTraining() {
        System.out.println("Manager - attendTraining");
    }
}
