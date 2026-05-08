package roteiro4.parte7;

import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {
        int escolhaIdade, qntd = 0, total = 0, mediaMulheres = 0;
        double porcHomens = 0;
        String escolhaGenero;
        int[] genero = {0, 0};

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Dados levantados por pesquisa com alunos - 8 alunos");

        while (true) {
            System.out.println("Qual o seu Gênero?");
            System.out.println("M - Masculino");
            System.out.println("F - Feminino");
            escolhaGenero = sc1.next();
            if (escolhaGenero.equalsIgnoreCase("M") || escolhaGenero.equalsIgnoreCase("F")) {
            } else {
                System.out.println("Gênero Invalido, retornando...");
                System.out.println(" ");
                continue;
            }

            System.out.println("Qual a sua idade?");
            escolhaIdade = sc.nextInt();
            if (escolhaIdade < 1) {
                System.out.println("Idade inválida, retornando...");
                System.out.println(" ");
                continue;
            }
            if (escolhaIdade > 22 && escolhaGenero.equalsIgnoreCase("M")) {
                genero[0] = genero[0] + 1;
                porcHomens = porcHomens + 1;
            } else if (escolhaIdade < 18) {
                qntd = qntd + 1;
            } else if (escolhaGenero.equalsIgnoreCase("M")) {
                genero[0] = genero[0] + 1;
            } else if (escolhaGenero.equalsIgnoreCase("F")) {
                genero[1] = genero[1] + 1;
                mediaMulheres = mediaMulheres + escolhaIdade;
            }

            System.out.println("Informação contabilizada, obrigado!");
            System.out.println(" ");
            total = total + 1;
            if (total == 8) {
                break;
            }
        }
        if (qntd == 0) {
            System.out.println("Não há nenhuma pessoa abaixo de 18 anos!");
        } else {
            System.out.println("Quantidade de pessoas menores de 18 anos: " + qntd + " pessoas");
        }
        if (porcHomens == 0) {
            System.out.println("Não há nenhum homem acima de 22 anos na pesquisa!");
        } else {
            porcHomens = (porcHomens / genero[0]) * 100;
            System.out.println("Porcentagem de Homens Acima de 22 anos: " + String.format("%.2f", porcHomens) + "%");
        }
        if (mediaMulheres == 0) {
            System.out.println("Não há nenhuma mulher na pesquisa!");
        } else {
            mediaMulheres = mediaMulheres / genero[1];
            System.out.println("Média de idade das mulheres: " + mediaMulheres);
        }

        sc.close();
        sc1.close();
    }
}
