package exercicio3_loops;

import java.util.Scanner;

public class Ex3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira Preço do pão:");
		double p= entrada.nextDouble();
		int i = 0;
		double quantia;
		
		System.out.println("Preço do pão: " + p);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
	
		while(i>=0 && i<50) {
			++i;
			quantia=(i*p);
			System.out.println(i + " - R$ " + quantia);
		}
		
		entrada.close();
	}

}
