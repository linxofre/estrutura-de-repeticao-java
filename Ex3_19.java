package exercicio3_loops;

import java.util.Scanner;

public class Ex3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int divisivel = 0;

		System.out.println("Insira um número inteiro:");
		int num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			if ((i % 2 == 1) && (i != 2) || (i == 2)){
				System.out.print(i + " | ");
				divisivel++;
			} else {
				divisivel++;
			}
		}
		System.out.println("\nO número de divisões executadas foi: " + divisivel);
		
		entrada.close();
	}

}
