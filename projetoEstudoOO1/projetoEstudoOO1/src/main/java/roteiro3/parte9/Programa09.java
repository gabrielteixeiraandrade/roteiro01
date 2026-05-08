package roteiro3.parte9;

import java.util.Scanner;

public class Programa09 {

    public static void main(String[] args) {
        int numDependentes;
        double salario, valorLiquido, imposto = 0;
        int classe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Imposto de Renda 2 :( ");
        //MAIS IMPOSTO DE RENDA?????//
        System.out.println("Informe sua renda");
        salario = sc.nextDouble();
        System.out.println("Informe sua classe: ");
        System.out.println("(1) - Classe A");
        System.out.println("(2) - Classe B");
        System.out.println("(3) - Classe C");
        System.out.println("(4) - Classe D");
        classe = sc.nextInt();

        System.out.println("Insira a quantidade de dependentes:");
        numDependentes = sc.nextInt();

        switch (classe) {
            case 1:
                System.out.println("Isento de Imposto de Renda");
                System.exit(0);
                break;
            case 2:
                System.out.println("5% de taxa sobre o Imposto de Renda");
                imposto = salario * 0.5;
                break;
            case 3:
                System.out.println("10% de taxa sobre o Imposto de Renda");
                imposto = salario * 0.10;
                break;
            case 4:
                System.out.println("15% de taxa sobre o Imposto de Renda");
                imposto = salario * 0.15;
                break;
            default:
                System.out.println("Classe inválida/inexistente, encerrando programa...");
                System.exit(0);
                break;
        }
        if (numDependentes > 0) {
            imposto = imposto - (15 * numDependentes);
            valorLiquido = salario - imposto;
            System.out.println("Desconto de R$15,00 por cada dependente");
            System.out.println("Valor do imposto total: R$" + imposto);
            System.out.println("Valor Líquido: R$" + valorLiquido);
        } else {
            valorLiquido = salario - imposto;
            System.out.println("Valor do imposto total: R$" + imposto);
            System.out.println("Valor Líquido: R$" + valorLiquido);
        }
        sc.close();
    }
}
