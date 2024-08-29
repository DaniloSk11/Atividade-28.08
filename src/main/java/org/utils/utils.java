package org.utils;

public class utils {
    public static int[] selectionSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[min] > a[j]){
                    min = j;
                }
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
        return a;
    }

    public static void arrayPrinter(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+a[i]+"]");
        }
        System.out.println();
    }

    public static void matrixPrinter(int[][] m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("["+m[i][j]+"]");
            }
            System.out.print("= "+matrixCalc(m)[i]);
            System.out.println();
        }
    }

    public static int[] matrixCalc(int[][] m){
        int[] lines = new int [3];
        for (int i = 0; i < m.length; i++) {
            int lineCount = 0;
            for (int j = 0; j < m.length; j++) {
                lineCount += m[i][j];
                lines[i] = lineCount;
            }

        }
        return lines;
    }
}
