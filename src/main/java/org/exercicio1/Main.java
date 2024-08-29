package org.exercicio1;
import java.util.Random;
import org.utils.utils;


public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
        }
        utils.arrayPrinter(a);
        utils.selectionSort(a);
        utils.arrayPrinter(a);
    }




}