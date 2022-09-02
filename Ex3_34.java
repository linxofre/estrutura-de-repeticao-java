package exercicio3_loops;

import java.util.Scanner;

public class Ex3_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		int intervalo = 0;
		int intervalor2 = 0;
		int intervalo3 = 0;
		int intervalo4 = 0;

		while (true) {
			System.out.println("Insira um número: ");
			num = entrada.nextInt();

			if (num > 0) {

				if ((num >= 0) && (num <= 25)) {
					intervalo++;

				} else if ((num >= 26) && (num <= 50)) {
					intervalor2++;

				} else if ((num >= 51) && (num <= 75)) {
					intervalo3++;

				} else if ((num >= 76) && (num <= 100)) {
					intervalo4++;
				}

			}

			else {
				System.out.println("Programa finalizado! Foi inserido um número negativo!");
				break;
			}
		}

		System.out.println("Quantidade de números entre 0 e 25 [0-25]: " + intervalo);
		System.out.println("Quantidade de números entre 26 e 50 [26-50]: " + intervalor2);
		System.out.println("Quantidade de números entre 51 e 75 [51-75]: " + intervalo3);
		System.out.println("Quantidade de números entre 76 e 100 [76-100] : " + intervalo4);
		
		entrada.close();
	}

}
