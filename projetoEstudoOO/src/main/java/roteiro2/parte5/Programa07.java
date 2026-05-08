package roteiro2.parte5;

import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {
        double altura, largura, area, litros;
        int numLatas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de altura da parede");
        altura = sc.nextDouble();
        System.out.println("Insira o valor de largura da parede");
        largura = sc.nextDouble();
        
        area = altura * largura;
        litros = area / 4.0;
        numLatas = (int) Math.ceil(litros / 5.0);
        
        System.out.println("A quantidade necessária para pintar uma parede com área de " + area + " m² é: " + numLatas + " lata(s) de tinta");
    }
}
