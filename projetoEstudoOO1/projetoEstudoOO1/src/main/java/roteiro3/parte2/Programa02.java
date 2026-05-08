package roteiro3.parte2;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        double imc, peso, altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Índice de Massa Corporal(IMC)");
        System.out.println("Digite seu peso (Kg)");
        peso = sc.nextDouble();
        if (peso == 0) {
            System.out.println("Peso não pode ser zero, encerrando o programa...");
            System.exit(0);
        }
        System.out.println("Digite sua altura (m)");
        altura = sc.nextDouble();
        if (altura == 0) {
            System.out.println("Altura não pode ser zero, encerrando o programa...");
            System.exit(0);
        }

        imc = peso / (altura * altura);
        imc = Math.round(imc * 100.0) / 100.0;
        System.out.println("Seu IMC é: " + imc + "!");

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (18.5 <= imc && imc < 25) {
            System.out.println("Você está com peso normal");
        } else if (25 <= imc && imc < 30) {
            System.out.println("Você está com sobrepeso");
        } else {
            System.out.println("Você está com obesidade");
        }
        sc.close();
    }
}
