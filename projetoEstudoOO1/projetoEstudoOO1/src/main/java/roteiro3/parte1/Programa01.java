package roteiro3.parte1;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {

        double saldo, valor;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Iniciando sistema de saque...");
        System.out.println("Digite seu saldo, ou digite -1 para saldo padrão (R$1500");
        saldo = sc.nextDouble();
        if (saldo == -1) {
            saldo = 1500;
        }
        System.out.println("Digite o valor para o saque (Apenas múltiplos de 10)");
        System.out.println("Saldo disponível: R$" + saldo);
        valor = sc.nextDouble();

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else if (valor == 0 || valor % 10 != 0) {
            System.out.println("Valor inválido");
        } else {
            System.out.println("Sacando o valor de R$" + valor + "...");
            saldo = saldo - valor;
            System.out.println("Saldo restante: R$" + saldo + ".");
            sc.close();
        }
    }
}
