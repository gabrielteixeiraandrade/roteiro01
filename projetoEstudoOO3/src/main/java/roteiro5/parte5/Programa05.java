package roteiro5.parte5;

import java.util.Scanner;

public class Programa05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido, terminar = false;
        String palavra = "";
        char fim;
        int posicao, fimContagem, contVogais;

        System.out.println("5 - Tem vogal?");

        while (true) {
            contVogais = 0;
            posicao = 0;
            fimContagem = 0;
            valido = false;
            while (true) {
                //Essa parte é para evitar números. Tentei fazer de outro jeito mas números com símbolos ainda passavam :( .//
                System.out.println("Digite uma palavra ou digite 'fim' para encerrar:");
                palavra = sc.next();
                if (!palavra.matches("^[a-zA-ZÁ-ÿ]+$")) {
                    System.out.println("Erro, entrada inválida. Por favor, digite uma palavra.");
                } else {
                    break;
                }
            }

            while (!valido) {
                try {
                    fim = palavra.charAt(posicao);
                    if (fim == 'f' || fim == 'F' || fim == 'i' || fim == 'I' || fim == 'm' || fim == 'M') {
                        fimContagem = fimContagem + 1;
                    } else {
                        break;
                    }
                    if (fimContagem == 3) {
                        terminar = true;
                        valido = true;
                    }
                    posicao = posicao + 1;
                } catch (StringIndexOutOfBoundsException e) {
                    break;
                }
            }
            if (terminar == true) {
                break;
            }

            posicao = 0;
            while (true) {
                try {
                    char letra = palavra.charAt(posicao);
                    if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E'
                     || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O'
                     || letra == 'u' || letra == 'U' || letra == 'á' || letra == 'é'
                     || letra == 'í' || letra == 'ó' || letra == 'ú' || letra == 'â'
                     || letra == 'ê' || letra == 'ô' || letra == 'ã' || letra == 'õ'
                     || letra == 'à' || letra == 'Á' || letra == 'É' || letra == 'Í'
                     || letra == 'Ó' || letra == 'Ú' || letra == 'Â' || letra == 'Ê'
                     || letra == 'Ô' || letra == 'Ã' || letra == 'Õ' || letra == 'À') {
                     contVogais = contVogais + 1;
                    }
                    posicao = posicao + 1;
                } catch (StringIndexOutOfBoundsException e) {
                    break;
                }
            }
            System.out.println("A quantidade de vogais é: " + contVogais);
            System.out.println("");
        }
        sc.close();
    }
}
