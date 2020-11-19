package com.workingWithInheritance.exPag441;

class PolymorphismExample {
    public static void main(String[] args) {
        MobileAppExpert expert1 = new Programmer();
        MobileAppExpert expert2 = new Manager();
        expert1.deliverMobileApp();
        expert2.deliverMobileApp();
    }
}
