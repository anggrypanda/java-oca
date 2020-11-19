package com.workingWithInheritance.exPag447;

import java.util.ArrayList;
import java.util.function.Predicate;

class Test {
    public static void main(String[] args) {
        Emp e1 = new Emp("Shreya", 5, 9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.00);

        ArrayList<Emp> empArrayList = new ArrayList<>();
        empArrayList.add(e1);
        empArrayList.add(e2);
        empArrayList.add(e3);
        empArrayList.add(e4);

        Validate validatePerformance = e -> e.getPerformanceRating() >= 5;
        filter(empArrayList, validatePerformance);

        Predicate<Emp> predicate = e -> e.getPerformanceRating() < 3;
        filter1(empArrayList, predicate);
    }

    static void filter(ArrayList<Emp> list, Validate rule) {
        for (Emp e : list)
            if (rule.check(e))
                System.out.println(e);
    }

    static void filter1(ArrayList<Emp> list, Predicate<Emp> rule) {
        System.out.println("-----");
        for (Emp e : list)
            if (rule.test(e))
                System.out.println(e);
    }
}
