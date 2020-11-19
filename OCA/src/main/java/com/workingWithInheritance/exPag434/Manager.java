package com.workingWithInheritance.exPag434;

class Manager extends Employee {
    public void startProjectWork() {
        meetingWithCustomer();
        defindeProjectSchedule();
        assignRespToTeam();
    }

    private void meetingWithCustomer() {
        System.out.println("meet customer");
    }

    private void defindeProjectSchedule() {
        System.out.println("project schedule");
    }

    private void assignRespToTeam() {
        System.out.println("team work status");
    }
}
