package exercicio3_loops;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		int base = entrada.nextInt();
		System.out.print("Informe o expoente: ");
		int exp = entrada.nextInt();
		int result = 1;
		
		for (int i = 0; i < exp; i++) {
			result = base * result;
			System.out.println(i);
		}
		System.out.print("o número "+base+" elevado a "+exp+" é: "+result);
		
		entrada.close();
	}

}
