package roteiro4.parte6;

import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {
        int voto, posicao, total = 0;
        double porcHomens = 0;
        String escolhaGenero;
        int[] opiniao = {0, 0, 0};
        int[] genero = {0, 0};

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Pesquisa sobre a Guerra no Iraque - Folha de São Paulo");

        while (true) {
            System.out.println("Qual o seu Gênero?");
            System.out.println("M - Masculino");
            System.out.println("F - Feminino");
            escolhaGenero = sc1.next();
            if (escolhaGenero.equalsIgnoreCase("M") || escolhaGenero.equalsIgnoreCase("F")) {

            } else {
                System.out.println("Gênero Invalido, retornando...");
                System.out.println(" ");
                continue;
            }

            System.out.println("Qual sua opinião acerca da Guerra no Iraque");
            System.out.println("1 - Sou A Favor");
            System.out.println("2 - Sou Contra");
            System.out.println("3 - Não sei");
            voto = sc.nextInt();

            if (voto < 1 || voto > 3) {
                System.out.println("Voto inválido, retornando...");
                System.out.println(" ");
                continue;
            }
            posicao = voto - 1;
            opiniao[posicao] = opiniao[posicao] + 1;

            if (voto == 1 && escolhaGenero.equalsIgnoreCase("M")) {
                porcHomens = porcHomens + 1;
                genero[0] = genero[0] + 1;
            } else if (escolhaGenero.equalsIgnoreCase("M")) {
                genero[0] = genero[0] + 1;
            } else {
                genero[1] = genero[1] + 1;
            }
            System.out.println("Voto contabilizado, obrigado!");
            System.out.println(" ");
            total = total + 1;
            if (total == 8) {
                break;
            }
        }
        porcHomens = (porcHomens / total) * 100;
        System.out.println("Quantidade de pessoas contra a guerra: " + opiniao[1] + " pessoas");
        System.out.println("Porcentagem de Homens a Favor: " + String.format("%.2f", porcHomens) + "%");
        sc.close();
        sc1.close();
    }
}
