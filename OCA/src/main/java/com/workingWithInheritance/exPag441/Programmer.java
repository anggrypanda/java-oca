package com.workingWithInheritance.exPag441;

class Programmer extends Employee implements MobileAppExpert {
    @Override
    public void deliverMobileApp() {
        System.out.println("testing complete");
    }
}
