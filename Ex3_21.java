package exercicio3_loops;

import java.util.Scanner;

public class Ex3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float soma = 0;
		float media = 0;

		System.out.println("Insira a quantia de pessoas que será inserida: ");
		int cont = entrada.nextInt();

		for (int i = 1; i <= cont; i++) {
			System.out.println("Digite a idade:");
			int idade = entrada.nextInt();
			soma = soma + idade;
		}
		media = soma / cont;
		System.out.println("A média final será: " + media);

		if ((media >= 0) && (media <= 25))
			System.out.println("Turma jovem.");
		else if ((media > 25) && (media <= 60))
			System.out.println("Turma adulta.");
		else if (media > 60)
			System.out.println("Turma idosa.");

		entrada.close();
	}

}
