package exercicio3_loops;

import java.util.Scanner;

public class Ex3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double a = 80000;
		double b = 200000;
		double taxaA = 0.03;
		double taxaB = 0.015;
		
		int anos = 0;
		
		while (a < b) {
			a = a + (a * taxaA);
			b =b + (b * taxaB);
			anos = anos + 1 ;
		}
		System.out.print("ser�o necess�rios "+anos+
				" anos para a popula��o do pa�s A"+
				" ultrapasse ou iguale a popula��o"+
				" do pa�s B");
		entrada.close();
	}

}
