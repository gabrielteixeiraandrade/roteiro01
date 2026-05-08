package roteiro3.parte4;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        double valor, qntd, imposto, valorLiquido;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Imposto de Renda :( ");
        System.out.println("Insira sua renda anual:");
        valor = sc.nextDouble();
        qntd = valor;

        if (valor <= 20000) {
            System.out.println("Insento de Imposto de Renda");
        } else if (valor >= 20001 && valor <= 40000) {
            System.out.println("10% de juros sob valores excedentes a R$20,000");
            imposto = (10 * (qntd - 20000)) / 100;
            valorLiquido = valor - imposto;
            System.out.println("Imposto total: " + imposto);
            System.out.println("Valor líquido: R$" + valorLiquido);
        } else if (valor >= 40001 && valor <= 80000) {
            System.out.println("10% de juros sob valores excedentes a R$20,000");
            System.out.println("+ 20% de juros sob valores excedentes a R$40,000");
            imposto = ((10 * 20000) / 100) + ((20 * (qntd - 40000)) / 100);
            valorLiquido = valor - imposto;
            System.out.println("Imposto total: " + imposto);
            System.out.println("Valor líquido: R$" + valorLiquido);
        } else {
            System.out.println("10% de juros sob valores excedentes a R$20,000");
            System.out.println("+ 20% de juros sob valores excedentes a R$40,000");
            System.out.println("+ 30% de juros sob valores excedentes a R$80,000");
            imposto = ((30 * (qntd - 80000)) / 100) + ((20 * 40000) / 100) + ((10 * 20000) / 100);
            valorLiquido = valor - imposto;
            System.out.println("Imposto total: " + imposto);
            System.out.println("Valor líquido: R$" + valorLiquido);
            sc.close();
        }

    }

}
