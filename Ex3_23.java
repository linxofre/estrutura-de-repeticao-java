package exercicio3_loops;

import java.util.Scanner;

public class Ex3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float soma = 0;
		float media = 0;
		
		
		System.out.println("Qual ser� a quantidade de turmas?");
		int turmas = entrada.nextInt();
		
		for(int i = 1; i <= turmas; i++) {
		System.out.println("Insira a quantidade de alunos?");
		int alunos = entrada.nextInt();
			while (alunos>40) {
				System.out.println("O n�mero m�ximo de alunos aceito por turma s�o 40!");
				System.out.println("Insira a quantidade de alunos?");
				alunos = entrada.nextInt();
			}
			soma = soma + alunos;
			}
		media = soma/turmas;
		
		System.out.println("O n�mero m�dio de alunos por turma ser�:" + media);
		
		entrada.close();
	}

}
