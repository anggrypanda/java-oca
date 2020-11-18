package com.flowControl.exPag365;

public class BreakContinueLabelStatements {
    public static void main(String[] args) {
        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        for (String name : programmers) {
            if (name.equals("Shreya"))
                break;
            System.out.println(name);
        }
        for (String otherName : programmers) {
            if (otherName.equals("Shreya"))
                continue;
            System.out.println(otherName);
        }

        System.out.println("-----");

        String[] string1 = {"Outer", "Inner"};
        outer:
        for (String outer : string1) {
            for (String inner : string1) {
                if (inner.equals("Inner"))
                    break outer;
                System.out.print(inner + ":\n");
            }
        }

        System.out.println("-----");

        byte foo = 120;
        switch (foo) {
            default:
                System.out.println("ejavaguru");
                break;
            case 2:
                System.out.println("e");
                break;
            case 120:
                System.out.println("ejava");
            case 121:
                System.out.println("enum");
            case 127:
                System.out.println("guru");
                break;
        }
    }
}
