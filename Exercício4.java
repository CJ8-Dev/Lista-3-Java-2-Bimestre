package org.example;
import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(sc.nextLine());

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        System.out.println("O Total de pares: " + pares);
    }
}