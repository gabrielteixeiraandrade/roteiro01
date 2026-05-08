package roteiro4.parte4;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        int voto, posicao, sair, total = 0;
        int[] candidatos = {0, 0, 0, 0};
        String[] texto = {"Candidato Lucas", "Candidato Arthur", "Voto em Branco", "Voto Nulo"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Urna eletrônica");
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
            total = total + 1;

            System.out.println("Digite 0 para encerrar ou outro número para realizar outra votação:");
            sair = sc.nextInt();
            System.out.println(" ");
            if (sair == 0) {
                break;
            }
        }
        System.out.println("Quantidade de votos: " + total);
    }
}
