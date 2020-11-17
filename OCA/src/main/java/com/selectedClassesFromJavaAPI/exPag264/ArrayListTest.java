package com.selectedClassesFromJavaAPI.exPag264;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("four");
        myArrayList.add(2, "three");
        myArrayList.add(1, "one and a half");

    /*    for(String elem : myArrayList){
            System.out.println(elem);
        }
                        OR
    */
        ListIterator<String> iterator = myArrayList.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----");

        ArrayList<StringBuilder> myArrayList1 = new ArrayList<StringBuilder>();
        myArrayList1.add(new StringBuilder("One"));
        myArrayList1.add(new StringBuilder("Twoooo"));
        myArrayList1.add(new StringBuilder("Three"));

        for(StringBuilder elem : myArrayList1)
            elem.append(elem.length());
        for(StringBuilder elem : myArrayList1)
            System.out.println(elem);

        System.out.println("-----");

        ArrayList<StringBuilder> myArrayList2 = new ArrayList<StringBuilder>();
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        myArrayList2.add(sb1);
        myArrayList2.add(sb2);
        myArrayList2.add(sb3);
        myArrayList2.add(sb4);
        myArrayList2.remove(1);

        for(StringBuilder elem : myArrayList2)
            System.out.println(elem);

        myArrayList2.remove(sb3);
        System.out.println();

        for(StringBuilder elem : myArrayList2)
            System.out.println(elem);

        System.out.println("-----");

        ArrayList<String> myArrayList3 = new ArrayList<String>();
        myArrayList3.add("nr 1");
        myArrayList3.add("nr 2");
        ArrayList<String> otherArrayList = new ArrayList<String>();
        otherArrayList.add("nr 3");
        otherArrayList.add("nr 4");
        otherArrayList.add("nr 5");
        myArrayList3.addAll(1, otherArrayList);

        for(String elem : myArrayList3)
            System.out.println(elem);

        System.out.println("-----");

        ArrayList<StringBuilder> assignedArrayList = myArrayList2;
        ArrayList<StringBuilder> clonedArrayList = (ArrayList<StringBuilder>)myArrayList2.clone();

        System.out.println(myArrayList2 == assignedArrayList);
        System.out.println(myArrayList2 == clonedArrayList);

        StringBuilder myArrayValue = myArrayList2.get(0);
        StringBuilder assignedArrayValue = assignedArrayList.get(0);
        StringBuilder clonedArrayValue = clonedArrayList.get(0);

        System.out.println(myArrayValue == assignedArrayValue);
        System.out.println(myArrayValue == clonedArrayValue);
    }
}
