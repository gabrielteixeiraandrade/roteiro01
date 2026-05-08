package roteiro4.parte5;

import java.util.Scanner;

public class Programa05 {

    public static void main(String[] args) {
        int voto, posicao, total = 0;
        double porcBranco = 0.0, porcNulo = 0.0;
        int[] candidatos = {0, 0, 0, 0};
        String[] texto = {"Candidato Lucas", "Candidato Arthur", "Voto em Branco", "Voto Nulo"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Urna eletrônica - 12 pessoas");

        while (true) {
            System.out.println("Digite o número do seu candidato: ");
            System.out.println("1 - Candidato Lucas");
            System.out.println("2 - Candidato Arthur");
            System.out.println("3 - Voto em branco");
            System.out.println("Outro valor - Nulo");
            voto = sc.nextInt();

            if (voto < 0) {
                System.out.println("Voto não pode ser negativo!");
                System.out.println(" ");
                continue;
            }

            if (voto > 3) {
                posicao = 3;
            } else {
                posicao = voto - 1;
            }
            System.out.println("Você escolheu a opção: " + texto[posicao] + ".");
            candidatos[posicao] = candidatos[posicao] + 1;
            System.out.println("Voto contabilizado, obrigado!");
            System.out.println(" ");

            total = total + 1;
            if (total == 12) {
                break;
            }
        }

        porcBranco = ((double) candidatos[2] / total) * 100;
        porcNulo = ((double) candidatos[3] / total) * 100;

        System.out.println("Porcentagem de Votos em Branco: " + String.format("%.2f", porcBranco) + "%");
        System.out.println("Porcentagem de Votos Nulos: " + String.format("%.2f", porcNulo) + "%");
        System.out.println("Quantidade de votos: " + total);
    }
}