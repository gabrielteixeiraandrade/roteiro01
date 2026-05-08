package roteiro3.parte6;

import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {
        double n1, n2, resultado;
        String operador;
        Scanner sc = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o primeiro número");
        n1 = sc.nextDouble();

        System.out.println("Selecione o operador");
        System.out.println("(+) Adição");
        System.out.println("(-) Subtração");
        System.out.println("(*) Multiplicação");
        System.out.println("(/) Divisão");
        operador = leia.nextLine();

        System.out.println("Escreva o segundo número");
        n2 = sc.nextDouble();
        resultado = 0;

        switch (operador) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Não é possível a divisão por zero, encerrando o programa...");
                    System.exit(0);
                } else {
                    resultado = n1 / n2;
                }
                break;
            default:
                System.out.println("Operador inválido, encerrando programa");
                System.exit(0);
                break;
        }
        System.out.println("O resultado de " + n1 + " " + operador + " " + n2 + "é: " + resultado);
        sc.close();
        leia.close();
    }
}
