package roteiro5.parte7;

import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palavra = "", invertida = "";
        char resultado, letra;

        System.out.println("7 - Ordem inversa de uma frase");
        frase = sc.nextLine();

        for (int i = frase.length() - 1; i >= 0; i--) {
            letra = frase.charAt(i);
            if (letra == ' ') {
                invertida = invertida + palavra + " ";
                palavra = "";
            } else {
                palavra = letra + palavra;
            }
        }
        invertida = invertida + palavra;
        for (int i = 0; i < invertida.length(); i++) {
            resultado = invertida.charAt(i);
            System.out.print(resultado);
        }

    }
}
