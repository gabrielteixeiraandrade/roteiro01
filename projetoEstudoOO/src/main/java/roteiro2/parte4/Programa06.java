package roteiro2.parte4;

import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {
        double a, b, c, delta, x, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais distintas");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("A equação possui uma raíz real dupla: x = " + x);
        } else {
            System.out.println("Não existem raízes reais");

        }
    }
}
