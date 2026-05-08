package roteiro4.parte3;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        double soma = 0;
        int qntd = 0, numeral = 0;
        Scanner sc = new Scanner(System.in);
        double[] multiplos = new double[10];

        System.out.println("Média de múltiplos de 3");
        for (int i = 0; i < multiplos.length; i++) {
            numeral = numeral + 1;
            System.out.println("Digite o " + numeral + "° número");
            multiplos[i] = sc.nextDouble();
            if (multiplos[i] % 3 == 0) {
                soma = soma + multiplos[i];
                qntd = qntd + 1;
            }
        }

        double resultado = soma / qntd;
        System.out.println("A média dos números digitados é: " + resultado);
    }
}
