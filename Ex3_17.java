package exercicio3_loops;

import java.util.Scanner;

public class Ex3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um número inteiro:");
		int primo = entrada.nextInt();

		if ((primo % 2 == 0) && (primo != 2))
			System.out.println("Não é um número primo!");
		else if (primo == 1)
			System.out.println("Não é um número primo!");
		else 
			System.out.println("É um número primo!");
		entrada.close();
	}

}
