package exercicio3_loops;

import java.util.Scanner;

public class Ex3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a quantia de n�meros do conjunto:");
		int conjunto = entrada.nextInt();

		int menor = 0;
		int maior = 0;

		for (int cont = 1; cont <= conjunto; cont++) {
			System.out.println("Insira o n�mero do conjunto:");
			int num_conjunto = entrada.nextInt();
			if (cont == 1) {
				menor = num_conjunto;
				maior = num_conjunto;
			}
			if (num_conjunto > maior) {
				maior = num_conjunto;
			} else if (num_conjunto < menor) {
				menor = num_conjunto;
			}
		}
		int soma = menor + maior;
		System.out.println("Menor n�mero � = " + menor);
		System.out.println("Maior n�mero � = " + maior);
		System.out.println("A soma ser� = " + soma);

		entrada.close();
	}

}
