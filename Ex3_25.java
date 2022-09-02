package exercicio3_loops;

import java.util.Scanner;

public class Ex3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Loja Quase Dois - Tabela de Preços");
		int i = 0;
		double produto;

		while (i >= 0 && i < 50) {
			++i;
			produto = (i * 1.99);
			System.out.println(i + " - R$ " + produto);
			entrada.close();
	
		}
	}
}
