package org.example;
import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int Maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > Maior) {
                    Maior = matriz[i][j];
                }
            }
        }
        System.out.println("O Valor mais alto é: " + Maior);
    }
}