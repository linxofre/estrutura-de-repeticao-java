package exercicio3_loops;

import java.util.Scanner;

public class Ex3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o n−ésimo termo:");
		int enesimo = entrada.nextInt();
		int num = 1;
		int num2 = 0;
		
		System.out.println(num2);
		System.out.println(num);
		
		for (int i = 0; i <= enesimo; i++) {
			num = num + num2;
            num2 = num - num2;
            System.out.println(num);
		}
		entrada.close();
	}

}
