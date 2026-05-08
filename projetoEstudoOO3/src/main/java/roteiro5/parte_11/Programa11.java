package roteiro5.parte_11;

import java.util.Scanner;

public class Programa11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];
        int numero, opcao;
        int positivos, negativos, soma, quantidade = 0;
        boolean valido, fim = false;

        System.out.println("11 - Operações com números inteiros");

        while (true) {
            try {
                System.out.println("Digite um número inteiro ou 0 para encerrar:");
                numero = sc.nextInt();
                if (numero == 0) {
                    break;
                }
                numeros[quantidade] = numero;
                quantidade++;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite novamente");
                sc.next();
            }
        }
        while (!fim) {
            valido = false;

            while (!valido) {
                try {
                    System.out.println();
                    System.out.println("Digite o número da opção desejada:");
                    System.out.println("1 - Quantidade de números positivos");
                    System.out.println("2 - Quantidade de números negativos");
                    System.out.println("3 - Soma total dos números");
                    System.out.println("4 - Exibir todos os valores na ordem inversa");
                    System.out.println("5 - Encerrar");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            positivos = 0;
                            for (int i = 0; i < quantidade; i++) {
                                if (numeros[i] > 0) {
                                    positivos++;
                                }
                            }
                            System.out.println("Quantidade de números positivos: " + positivos);
                            valido = true;
                            break;
                        case 2:
                            negativos = 0;
                            for (int i = 0; i < quantidade; i++) {
                                if (numeros[i] < 0) {
                                    negativos++;
                                }
                            }
                            System.out.println("Quantidade de números negativos: " + negativos);
                            valido = true;
                            break;
                        case 3:
                            soma = 0;
                            for (int i = 0; i < quantidade; i++) {
                                soma = soma + numeros[i];
                            }
                            System.out.println("Soma total dos números: " + soma);
                            valido = true;
                            break;
                        case 4:
                            System.out.println("Valores na ordem inversa:");
                            for (int i = quantidade - 1; i >= 0; i--) {
                                System.out.print(numeros[i] + " ");
                            }
                            System.out.println();
                            valido = true;
                            break;
                        case 5:
                            fim = true;
                            valido = true;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida.");
                    sc.next();
                }
            }
        }
        sc.close();
    }
}
