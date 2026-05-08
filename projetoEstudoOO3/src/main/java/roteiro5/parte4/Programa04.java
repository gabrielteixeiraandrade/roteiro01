package roteiro5.parte4;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = "";
        char menorNumero;
        boolean valido = false;
        
        System.out.println("4 - Palavra em ordem alfabética");
         while (!valido) {
            System.out.println("Digite uma palavra:");
            palavra = sc.next();

            if (palavra.matches("^[a-zA-ZÀ-ÿ]+$")) {
                valido = true;
            } else {
                System.out.println("Erro, entrada inválida. Por favor, digite uma palavra.");
            }
        }
        char[] array = new char[palavra.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = palavra.charAt(i);
        }

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (Character.toLowerCase(array[i]) > Character.toLowerCase(array[i + 1])) {
                    menorNumero = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = menorNumero;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
