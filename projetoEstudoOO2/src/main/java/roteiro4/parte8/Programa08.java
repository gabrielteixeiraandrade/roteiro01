package roteiro4.parte8;

import java.util.Scanner;

public class Programa08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeral = 0;
        int[] array = new int[16];

        System.out.println("Troca números");

        for (int i = 0; i < array.length; i++) {
            numeral = numeral + 1;
            System.out.println("Digite o " + numeral + "° número");
            array[i] = sc.nextInt();
        }
        System.out.println("Resultado:");
        for (int i = 8; i < 16; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
