package roteiro3.parte8;

import java.util.Scanner;

public class Programa08 {

    public static void main(String[] args) {
        int idade, grupoRisco;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade");
        idade = sc.nextInt();
        if (idade < 17 || idade > 90) {
            System.out.println("Faixa fora do aceitável, encerrando programa...");
            System.exit(0);
        }
        System.out.println("Informe o grupo de risco");
        System.out.println("(1) - Baixo Risco");
        System.out.println("(2) - Alto Risco");
        grupoRisco = sc.nextInt();

        switch (grupoRisco) {
            case 1:
                grupoRisco = 1;
                break;
            case 2:
                grupoRisco = 2;
                break;
            default:
                System.out.println("Grupo de risco inválido, encerrando programa...");
                System.exit(0);
                break;
        }

        if (idade < 51 && grupoRisco == 1) {
            System.out.println("Você está na categoria: C1");
        } else if (idade < 51 && grupoRisco == 2) {
            System.out.println("Você está na categoria: C2");
        } else if (idade > 50 && grupoRisco == 1) {
            System.out.println("Você está na categoria: C3");
        } else {
            System.out.println("Você está na categoria: C4");
        }
        sc.close();
    }
}
