package exercicio3_loops;

import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a nota: ");
		double num = entrada.nextDouble();

		while ((num < 0) || (num > 10)) {
			System.out.print("Informe uma nota válida: ");
			num = entrada.nextDouble();
		}
		System.out.print("A nota informada foi: "+num);
		
		entrada.close();
	}

}
