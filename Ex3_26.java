package exercicio3_loops;

import java.util.Scanner;

public class Ex3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira Pre�o do p�o:");
		double p= entrada.nextDouble();
		int i = 0;
		double quantia;
		
		System.out.println("Pre�o do p�o: " + p);
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
	
		while(i>=0 && i<50) {
			++i;
			quantia=(i*p);
			System.out.println(i + " - R$ " + quantia);
		}
		
		entrada.close();
	}

}
