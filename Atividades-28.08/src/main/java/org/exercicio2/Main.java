package org.exercicio2;
import java.util.Random;
import org.utils.utils;

public class Main {
    public static void main(String[] args){
        int[][] m = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rand.nextInt(10);
            }
        }
        utils.matrixPrinter(m);
    }
}
