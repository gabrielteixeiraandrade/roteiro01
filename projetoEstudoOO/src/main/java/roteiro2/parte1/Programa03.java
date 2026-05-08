package roteiro2.parte1;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double parcela1, parcela2, resultado;

        System.out.println("Digite o primeiro número a ser somado");
        parcela1 = sc.nextDouble();
        System.out.println("Agora, digite o segundo número a ser somado");
        parcela2 = sc.nextDouble();

        resultado = parcela1 + parcela2;
        System.out.println("A soma de " + parcela1 + " + " + parcela2 + " é igual a: " + resultado);
    }
}
