
package roteiro3.parte_10;
 import java.util.Scanner;

public class Programa10 {
	public static void main(String[] args) {
		double tempoMinimo, tempo, pts, diferenca;
		Scanner sc = new Scanner(System.in);

		System.out.println("Sistema de tempo de prova - Rally");
		System.out.println("Insira seu tempo de prova (em minutos):");
		tempo = sc.nextDouble();
		if (tempo == 0) {
			System.out.println("O seu tempo não pode ser zero, encerrando programa...");
			System.exit(0);
		}
		System.out.println("Insira o tempo mínimo da prova (em minutos):");
		tempoMinimo = sc.nextDouble();
		if (tempoMinimo == 0) {
			System.out.println("O tempo mínimo não pode ser zero, encerrando programa...");
			System.exit(0);
		}
		diferenca = tempo - tempoMinimo;

		if (diferenca < 3) {
			pts = 100;
		} else if (diferenca >= 3 && diferenca <= 5) {
			pts = 80;
		} else {
			pts = 80 - (diferenca - 5);
		}

		if (pts <= 0) {
			System.out.println("Sua pontuação é zero.");
		} else {
                    System.out.println("A diferença entre o tempo da prova e o seu tempo é: " + diferenca + " minutos!");
			System.out.println("Sua pontuação é de: " + pts + " pontos!");
		}
		sc.close();
	}
}
