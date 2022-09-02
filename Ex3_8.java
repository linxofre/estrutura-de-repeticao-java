package exercicio3_loops;

import java.util.Scanner;

public class Ex3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o inicio: ");
		int n1 = entrada.nextInt();
		System.out.print("Informe o fim: ");
		int n2 = entrada.nextInt();
		int apoio = 0;
		int soma = 0;
		
		if (n1 > n2) {
			apoio = n2;
			n2 = n1;
			n1 = apoio;
		}
		for (int i = n1+1; i < n2; i++) {
			soma = soma + i;
			System.out.println(i);
		}
		System.out.println("soma: "+soma);
		entrada.close();
	}

}
