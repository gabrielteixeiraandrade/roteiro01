package roteiro3.parte3;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {

        int idade, diaSemana;
        double ingresso;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de venda de ingressos");
        System.out.println("Por favor, digite sua idade");
        idade = sc.nextInt();

        if (idade <= 11) {
            System.out.println("Ingresso infantil");
            ingresso = 15;
        } else if (idade >= 12 && idade <= 59) {
            System.out.println("Ingresso padrão (adulto)");
            ingresso = 30;
        } else {
            System.out.println("Ingresso idoso");
            ingresso = 20;
        }

        System.out.println("Selecione o dia da semana:");
        System.out.println("(1) Domingo");
        System.out.println("(2) Segunda-Feira");
        System.out.println("(3) Terça-Feira");
        System.out.println("(4) Quarta-Feira");
        System.out.println("(5) Quinta-Feira");
        System.out.println("(6) Sexta-Feira");
        System.out.println("(7) Sábado");
        diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Sem descontos ou aumentos");
                break;
            case 2:
                System.out.println("Sem descontos ou aumentos");
                break;
            case 3:
                System.out.println("Sem descontos ou aumentos");
                break;
            case 4:
                System.out.println("Desconto as Quarta-Feiras! Ingressos pela metade do preço");
                ingresso = ingresso / 2;
                break;
            case 5:
                System.out.println("Sem descontos ou aumentos");
                break;
            case 6:
                System.out.println("Sem descontos ou aumentos");
                break;
            case 7:
                System.out.println("Sem descontos ou aumentos");
                break;
            default:
                System.out.println("Informação Inválida, encerrando o programa...");
                System.exit(0);
                break;
        }

        System.out.println("Valor do ingresso: R$" + ingresso);
        sc.close();
    }
}
