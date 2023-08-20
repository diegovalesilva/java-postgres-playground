package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        
        double vetor[] = {10,20,30};

        System.out.println(Arrays.toString(vetor));

        System.out.println("Vetor na posição 0: " + vetor[0]);
        System.out.println("Vetor na posição 0: " + vetor[1]);
        System.out.println("Vetor na posição 0: " + vetor[2]);

        vetor[0] = 1;

        System.out.println(vetor[0]);

        int vetor2[] = new int[4];
        vetor2[0] = 100;
        vetor2[1] = 200;
        vetor2[2] = 300;
        vetor2[3] = 400;

        System.out.println(Arrays.toString(vetor2));

        double matriz[][] = { {10,20,30},{40,50,60} };
        matriz[0] = new double[]{1,2};
        
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        int vetor3[] = new int[5];
        
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = 100 * (i+1);
        }

        System.out.println(Arrays.toString(vetor3));

    }
}
