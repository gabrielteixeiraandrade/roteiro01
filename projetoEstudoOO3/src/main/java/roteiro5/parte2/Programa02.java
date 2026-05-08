package roteiro5.parte2;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeral, posVetor, menorNumero, posicao;

        System.out.println("2 - Valor e posição do menor número da lista");

        for (int i = 0; i < numeros.length; i++) {
            boolean valido = false;

            while (valido != true) {
                numeral = i + 1;
                System.out.println("Digite o " + numeral + "° número");
                if (!sc.hasNextInt()) {
                    System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                    sc.next();
                } else {
                    numeros[i] = sc.nextInt();
                    valido = true;
                }
            }
        }
        menorNumero = numeros[0];
        posicao = 0;
        posVetor = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
                posVetor = i;
                posicao = posVetor + 1;
            }
        }
        System.out.print("O menor número é " + menorNumero + ", e foi o " + posicao +
        "° número digitado, e sua posição no vetor é a " + posVetor + "° posição.");
        sc.close();
    }
}
