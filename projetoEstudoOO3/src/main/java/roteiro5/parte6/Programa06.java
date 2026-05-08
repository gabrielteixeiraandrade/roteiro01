package roteiro5.parte6;

import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String serieLetras, letrasContidas, palavra;
        char letra, caractere;

        while (true) {

            System.out.println("Digite uma palavra ou 'fim' para encerrar:");
            palavra = sc.nextLine();

            if (!palavra.matches("[A-Za-zÀ-ÖØ-öø-ÿ' -]+")) {
                System.out.println("Entrada inválida, por favor digite uma palavra ou frase");
                continue;
            }
            if (palavra.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite uma série de letras:");
            serieLetras = sc.nextLine();

            letrasContidas = "";

            for (int i = 0; i < palavra.length(); i++) {
                letra = palavra.charAt(i);
                
                for (int j = 0; j < serieLetras.length(); j++) {
                    caractere = serieLetras.charAt(j);
                    if (Character.toLowerCase(letra) == Character.toLowerCase(caractere)) {
                        letrasContidas = letrasContidas + palavra.charAt(i) + " ";
                        break;
                    }
                }
            }

            System.out.println("Letras contidas: " + letrasContidas);
        }
        sc.close();
    }
}
