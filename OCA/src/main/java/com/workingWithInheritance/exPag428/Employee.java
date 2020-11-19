package com.workingWithInheritance.exPag428;

class Employee {
    String name;
    String address;

    Employee() {
        name = "No name";
        address = "No address";
    }

    Employee(String name, String address) {
        this();
        if (name != null)
            this.name = name;
        if (address != null)
            this.address = address;
    }
}
