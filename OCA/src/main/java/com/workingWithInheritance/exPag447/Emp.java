package com.workingWithInheritance.exPag447;

class Emp {
    String name;
    int performanceRating;
    double salary;

    Emp(String nm, int rtng, double sal) {
        name = nm;
        performanceRating = rtng;
        salary = sal;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + ":" + performanceRating + ":" + salary;
    }
}
