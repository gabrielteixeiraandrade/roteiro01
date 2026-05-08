package roteiro2.parte3;

import java.util.Scanner;

public class Programa05 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, resultado;

        System.out.println("Informe o primeiro número");
        n1 = sc.nextDouble();
        System.out.println("Informe o segundo número");
        n2 = sc.nextDouble();
        System.out.println("Informe o terceiro número");
        n3 = sc.nextDouble();
        System.out.println("Informe o quarto número");
        n4 = sc.nextDouble();

        resultado = (n1 + n2) * (n3 + n4);
        System.out.println("O resultado de (" + n1 + " + " + n2 + ") * (" + n3 + " + " + n4 + ") é: " + resultado);
    }
}
