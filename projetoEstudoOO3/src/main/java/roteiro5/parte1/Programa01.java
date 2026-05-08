package roteiro5.parte1;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeral;

        System.out.println("1 - Ordenação de números em ordem crescente");
        
        for (int i = 0; i < numeros.length; i++) {
            boolean valido = false;
            while (valido != true) {
                try {
                numeral = i + 1;
                System.out.println("Digite o " + numeral + "° número");
                numeros[i] = sc.nextInt();
                valido = true;
                } catch (java.util.InputMismatchException e){
                    System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                    sc.next();
                }
            }
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int proximo = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = proximo;
                }
            }
        }
        System.out.print("Resultado da ordenação: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        sc.close();
    }
}
