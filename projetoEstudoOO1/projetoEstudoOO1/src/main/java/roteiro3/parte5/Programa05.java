package roteiro3.parte5;

import java.util.Scanner;

public class Programa05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo, valor, qntd;
        int cemReais, cinquentaReais, vinteReais, dezReais;

        System.out.println("Sistema de saque 2 (Agora com notas!)");
        System.out.println("Digite seu saldo, ou digite -1 para saldo padrão (R$1500");
        saldo = sc.nextDouble();
        if (saldo == -1) {
            saldo = 1500;
        }

        cemReais = 0;
        cinquentaReais = 0;
        vinteReais = 0;
        dezReais = 0;

        System.out.println("Saldo: R$" + saldo);
        System.out.println("Informe o valor para saque");
        valor = sc.nextDouble();

        if (valor == 0 && valor % 10 != 0) {
            System.out.println("Valor inválido, encerrando programa");
            System.exit(0);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            System.exit(0);
        } else {
            System.out.println("Procedendo saque...");
        }

        qntd = valor;

        do {
            if (qntd >= 100) {
                qntd = qntd - 100;
                cemReais = cemReais + 1;
            } else if (qntd >= 50) {
                qntd = qntd - 50;
                cinquentaReais = cinquentaReais + 1;
            } else if (qntd >= 20) {
                qntd = qntd - 20;
                vinteReais = vinteReais + 1;
            } else {
                qntd = qntd - 10;
                dezReais = dezReais + 1;
            }
        } while (qntd != 0);

        System.out.println("Valor Sacado: R$" + valor);
        System.out.println("Quantidade de células:");

        if (cemReais != 0) {
            System.out.println("Cédulas de R$100,00: " + cemReais);
        }
        if (cinquentaReais != 0) {
            System.out.println("Cédulas de R$50,00: " + cinquentaReais);
        }
        if (vinteReais != 0) {
            System.out.println("Cédulas de R$20,00: " + vinteReais);
        }
        if (dezReais != 0) {
            System.out.println("Cédulas de R$10,00: " + dezReais);
        }
        sc.close();
    }
}
