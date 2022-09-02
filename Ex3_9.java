package exercicio3_loops;
import java.util.Scanner;


public class Ex3_9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe uma tabuada: ");
		int tab = entrada.nextInt();
		
		final int TAM = 10;

		for (int x = 1; x <= TAM; x++) {
			System.out.println(tab + " x " + x + " = " + (tab * x));
		}
		entrada.close();
		
	}
		
	
}