package exercicio3_loops;

import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1 = entrada.nextInt();
		int fat = 1;

		for (int i = 1; i <= n1; i++) {
			fat = fat * i;
		}
		System.out.println("Fatorial:" + fat);
		entrada.close();
	}

}
