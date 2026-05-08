package roteiro5.parte9;

import java.util.Scanner;

public class Programa09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        int opcao, pares, impares;
        boolean valido, fim = false;
        double media;

        System.out.println("9 - Operações com 15 números");
        while (!fim) {
            media = 0;

            for (int i = 0; i < 15; i++) {
                while (true) {
                    try {
                        System.out.println("Digite o " + (i + 1) + "° número:");
                        numeros[i] = sc.nextInt();
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida, por favor digite novamente");
                        sc.next();
                    }
                }
            }

            valido = false;
            while (!valido) {
                try {
                    System.out.println("Digite o número da opção desejada:");
                    System.out.println("1 - Exibir todos os números pares");
                    System.out.println("2 - Exibir todos os números ímpares");
                    System.out.println("3 - Informar a média dos valores");
                    System.out.println("4 - Encerrar");

                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            pares = 0;
                            System.out.println("Os números pares são:");

                            for (int i = 0; i < 15; i++) {
                                if (numeros[i] % 2 == 0) {
                                    System.out.print(numeros[i] + " ");
                                    pares++;
                                }
                            }
                            if (pares == 0) {
                                System.out.println("Nenhum dos números é par");
                            }
                            System.out.println();
                            valido = true;
                            break;
                        case 2:
                            impares = 0;
                            System.out.println("Os números ímpares são:");
                            for (int i = 0; i < 15; i++) {
                                if (numeros[i] % 2 != 0) {
                                    System.out.print(numeros[i] + " ");
                                    impares++;
                                }
                            }
                            if (impares == 0) {
                                System.out.println("Nenhum dos números é ímpar");
                            }
                            System.out.println();
                            valido = true;
                            break;
                        case 3:
                            for (int i = 0; i < 15; i++) {
                                media = media + numeros[i];
                            }
                            media = media / 15;
                            System.out.println("A média é: " + media);
                            valido = true;
                            break;
                        case 4:
                            fim = true;
                            valido = true;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            System.out.println();
                            break;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida.");
                    System.out.println();
                    sc.next();
                }
            }
        }
        sc.close();
    }
}
