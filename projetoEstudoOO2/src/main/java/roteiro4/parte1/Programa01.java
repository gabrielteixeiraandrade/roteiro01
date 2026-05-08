package roteiro4.parte1;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] numeros = new int [10];
        int numeral = 0;
        
        System.out.println("É par ou impar?");
        for (int i = 0; i < numeros.length; i++) {
            numeral = numeral + 1;
            System.out.println("Digite o " + numeral + "° número");
            numeros [i] = sc.nextInt();
        }
        for(int i = 0; i < numeros.length;i++) {
            if (numeros [i] % 2 == 0) {
                System.out.println(numeros [i] + " é um número par");
            }else{
                System.out.println(numeros [i] + " é um número ímpar");
            }
        }
    }
}