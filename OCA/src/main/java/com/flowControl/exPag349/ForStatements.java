package com.flowControl.exPag349;

import java.util.ArrayList;
import java.util.Iterator;

public class ForStatements {
    public static void main(String[] args) {
        String line = "ab";
        for (int i = 0; i < line.length(); ++i, printMethod())
            System.out.println(line.charAt(i));

        System.out.println("-----");

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Loop");

    /*  for(Iterator<String> i = myList.iterator(); i.hasNext();)
        System.out.println(i.next());
                    OR
    */
        for(String val : myList)
            System.out.println(val);

        System.out.println("-----");

        ArrayList<String> exams = new ArrayList<String>();
        exams.add("Java");
        exams.add("Oracle");
        ArrayList<String> levels = new ArrayList<String>();
        levels.add("Basic");
        levels.add("Intermediate");
        levels.add("Advanced");
        ArrayList<String> grades = new ArrayList<String>();
        grades.add("Pass");
        grades.add("Fail");

        ArrayList<ArrayList<String>> nestedArrayList = new ArrayList<ArrayList<String>>();
        nestedArrayList.add(exams);
        nestedArrayList.add(levels);
        nestedArrayList.add(grades);

        for (ArrayList<String> arrayListElem : nestedArrayList)
            for (String elem : arrayListElem)
                System.out.println(elem);

        System.out.println("-----");

        StringBuilder myArr[] = {
                new StringBuilder("Java"),
                new StringBuilder("Loop")
                };
        for (StringBuilder val : myArr)
            System.out.println(val);
        for (StringBuilder val : myArr)
            val = new StringBuilder("Oracle");
        for (StringBuilder val : myArr)
            System.out.println(val);

        System.out.println("-----");

        ArrayList<String> exams1 = new ArrayList<String>();
        exams1.add("Java");
        exams1.add("Oracle");
        ArrayList<String> levels1 = new ArrayList<String>();
        levels1.add("Basic");
        levels1.add("Intermediate");
        levels1.add("Advanced");
        ArrayList<String> grades1 = new ArrayList<String>();
        grades1.add("Pass");
        grades1.add("Fail");

        for (String exam : exams1)
            for (String level : levels1)
                for (String grade : grades1)
                    System.out.println(exam + ": " + level + ": " + grade);
    }
        private static void printMethod() {
            System.out.println("Happy");
    }
}
