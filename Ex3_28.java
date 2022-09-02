package exercicio3_loops;

import java.util.Scanner;

public class Ex3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int quantidade_temperatura = 0;
		int i = 0;
		float temperatura = 0;
		float maior = 0;
		float menor = 0;
		float soma = 0;
		float media = 0;

		System.out.println("Quantas temperaturas serão inseridas? ");
		quantidade_temperatura = entrada.nextInt();

		for (i = 0; i < quantidade_temperatura; i++) {
			System.out.println("Insira a temperatura:");
			temperatura = entrada.nextFloat();

			if (i == 0) {
				maior = temperatura;
				menor = temperatura;
				soma = soma + temperatura;
			} else {
				if (temperatura > maior) {
					maior = temperatura;
					soma = soma + temperatura;
				} else {
					menor = temperatura;
					soma = soma + temperatura;
				}
			}
		}
		entrada.close();
		media = soma / i;

		System.out.println("A menor temperatura é: " + menor);
		System.out.println("A maior temperatura é: " + maior);
		System.out.println("A média das temperaturas informadas foi: " + media);
		
	}

}
