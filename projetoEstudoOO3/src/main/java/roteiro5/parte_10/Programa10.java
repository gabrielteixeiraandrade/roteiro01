package roteiro5.parte_10;

import java.util.Scanner;

public class Programa10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int maior, menor;
        int linhaMaior = 0, colunaMaior = 0;
        int linhaMenor = 0, colunaMenor = 0;

        System.out.println("10 - Operações com matriz 5x5");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                while (true) {
                    try {
                        System.out.println("Digite o valor da posição [" + i + "][" + j + "]:");
                        matriz[i][j] = sc.nextInt();
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida, por favor digite novamente");
                        sc.next();
                    }
                }
            }
        }
        maior = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }
        System.out.println();
        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior valor: [" + linhaMaior + "][" + colunaMaior + "]");
        System.out.println();
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor valor: [" + linhaMenor + "][" + colunaMenor + "]");

        sc.close();
    }
}
