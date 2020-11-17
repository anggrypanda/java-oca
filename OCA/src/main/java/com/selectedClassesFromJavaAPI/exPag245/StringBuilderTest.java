package com.selectedClassesFromJavaAPI.exPag245;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        char[] toInsert = {'2', '3'};

        sb1.delete(2, 4);
        System.out.println(sb1);

        sb1.insert(2, toInsert, 0, 2);
        System.out.println(sb1);
        System.out.println(sb1.subSequence(2, 4));

        sb1.reverse();
        System.out.println(sb1);

        sb1.replace(2,4, "ABCD");
        System.out.println(sb1);
    }
}
