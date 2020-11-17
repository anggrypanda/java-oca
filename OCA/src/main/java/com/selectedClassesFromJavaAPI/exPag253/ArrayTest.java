package com.selectedClassesFromJavaAPI.exPag253;

public class ArrayTest {
    public static void main(String[] args) {
        String[] strArray;
        strArray = new String[4];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = new String("Hello " + i);
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
// --------
        int intArray1[] = new int[]{0, 1};
        String[] strArray1 = new String[]{"Summer", "Winter"};
        int multiArray1[][] = new int[][]{{0, 1}, {3, 4, 5}};

        for(int i = 0; i < intArray1.length; i++)
            System.out.println(intArray1[i]);
        for(int i = 0; i < strArray1.length; i++)
            System.out.println(strArray1[i]);
        for(int i = 0; i < multiArray1.length; i++)
            for(int j =0; j < multiArray1[i].length; j++)
                System.out.print(multiArray1[i][j] + " ");
        System.out.println();
// --------
        String multiStrArray[][] = new String[][]{{"A", "B"}, {"Jan", "Feb", null}};
        for(int i = 0; i < multiStrArray.length; i++)
            for(int j=0; j < multiStrArray[i].length; j++)
                System.out.print(multiStrArray[i][j] + " ");
    }
}