package exercicio3_loops;

import java.util.Scanner;

public class Ex3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um n�mero inteiro:");
		int primo = entrada.nextInt();

		if ((primo % 2 == 0) && (primo != 2))
			System.out.println("N�o � um n�mero primo!");
		else if (primo == 1)
			System.out.println("N�o � um n�mero primo!");
		else 
			System.out.println("� um n�mero primo!");
		entrada.close();
	}

}
