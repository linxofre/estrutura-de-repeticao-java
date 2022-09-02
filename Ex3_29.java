package exercicio3_loops;

import java.util.Scanner;

public class Ex3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a taboada desejada:");
		int tab = entrada.nextInt();

		System.out.println("Informe o valor inicial:");
		int inicio = entrada.nextInt();
		System.out.println("Informe o valor final:");
		final int fim = entrada.nextInt();
		
		System.out.println("Montar a tabuada de: " + tab);
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em: " + fim);

		while (true) {
			if (fim > inicio) {
				for (int i = inicio; i <= fim; i++) {
					System.out.println(tab + " x " + i + " = " + (tab * i));
				}
				break;
			} else
				System.out.println("erro = Usuário digitou o valor final menor que o valor inicial.");
			break;
		}
		
		entrada.close();
	}

}
