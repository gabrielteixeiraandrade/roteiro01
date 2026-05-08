package roteiro5.parte8;

import java.util.Scanner;

public class Programa08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        int opcao, invalido = 0;
        char letra;
        boolean valido;

        System.out.println("8 - Codificador e Decodificador (Tabela ASCII)");
        while (true) {
            opcao = 0;
            valido = false;
            while (!valido) {
                System.out.println("Digite o número da opção desejada, ou digite (0) para sair: ");
                System.out.println("1 - Codificar");
                System.out.println("2 - Decodificar");
                System.out.println("0 - Sair");
                try {
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao < 0 || opcao > 2) {
                        System.out.println("Nenhuma das opções escolhidas, retornando...");
                        sc.next();
                    } else {
                        valido = true;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada Inválida, retornando...");
                    System.out.println(" ");
                    sc.next();
                }
            }
            if (opcao == 0) {
                break;
            }
            System.out.println("Digite a frase ou palavra que deseja codificar ou decodificar:");
            entrada = sc.nextLine();
            char[] array = new char[entrada.length()];

            for (int i = 0; i < entrada.length(); i++) {
                letra = entrada.charAt(i);

                int usados = 0;
                while (usados < 8) {

                    char proximo;

                    if (opcao == 1) {
                        proximo = (char) (letra + 1);
                    } else {
                        proximo = (char) (letra - 1);
                    }

                    if (!((proximo >= 32 && proximo <= 126)
                            || (proximo >= 161 && proximo <= 255))) {
                        break;
                    }

                    letra = proximo;
                    usados++;
                    invalido = 1;
                }
                while (usados < 8) {

                    if (opcao == 1) {
                        letra++;
                    } else {
                        letra--;
                    }

                    if (((letra >= 32 && letra <= 126)
                            || (letra >= 161 && letra <= 255))) {
                        usados++;
                        invalido = 1;
                    }
                }
                if (invalido > 0) {
                    System.out.println("Código ASCII não pode ser impresso, pulando para: " + letra);
                }
                array[i] = letra;
            }

            System.out.print("O resultado é: ");

            for (int i = 0; i < entrada.length(); i++) {
                System.out.print(array[i]);
            }
            System.out.println(" ");
            System.out.println(" ");
        }

        sc.close();
    }
}
