package exercicio3_loops;

import java.util.Scanner;

public class Ex3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float soma = 0;
		float media = 0;

		System.out.println("Insira a quantia de notas que será inserida: ");
		int cont = entrada.nextInt();
		for (int i = 1; i <= cont; i++) {
			System.out.println("Digite a nota:");
			float nota = entrada.nextFloat();
			soma = soma + nota;
		}
		media = soma / cont;
		System.out.println("A média final será: " + media);

		entrada.close();
	}

}
