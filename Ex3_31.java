package exercicio3_loops;

import java.util.Scanner;

public class Ex3_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int alto = 0;
		int baixo = 0;
		int numero_alto = 0;
		int numero_baixo = 0;
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("Insira o n�mero do aluno: ");
			int num = entrada.nextInt();
			System.out.println("Insira a altura do aluno: ");
			int alt = entrada.nextInt();
			
			if( i == 0) {
				alto = alt;
				numero_alto = num;
				baixo = alt;
				numero_baixo = num;
			}	
			else {
				if(alt < baixo) {
					baixo = alt;
					numero_baixo = num;
				}else if(alt > alto) {
					alto = alt;
					numero_alto = num;
				}
			}
		}
		
		System.out.println("N�mero do aluno mais alto: " + numero_alto);
		System.out.println("O aluno mais alto possui: " + alto + " cent�metros.");
		System.out.println("N�mero do aluno mais baixo: " + numero_baixo);
		System.out.println("O aluno mais baixo possui: " + baixo + " cent�metros.");
		entrada.close();
	}

}
