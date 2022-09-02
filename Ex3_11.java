package exercicio3_loops;

import java.util.Scanner;

public class Ex3_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int impar = 0;
		int par = 0;
		int n = 0;

		for (int x = 0; x < 10; x++) {
			System.out.println("Digite um número inteiro: ");
			n = entrada.nextInt();
			if (n % 2 == 0) {
				par = par + 1;
			} else
				impar = impar + 1;
		}
		System.out.println("Pares:" + par);
		System.out.println("Impares:" + impar);

		entrada.close();

		
	}

}
