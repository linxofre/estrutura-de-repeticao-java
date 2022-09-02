package exercicio3_loops;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		/*2. Faça um programa que leia um 
		 * nome de usuário e a sua senha e 
		 * não aceite a senha igual ao nome 
		 * do usuário, mostrando uma mensagem 
		 * de erro e voltando a pedir as 
		 * informações.	 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.next();
		System.out.print("Informe a senha: ");
		String senha = entrada.next();

		while (nome.equals(senha)) {
			System.out.println("Dados incorretos, tente novamente ");
			System.out.print("Informe o nome: ");
			nome = entrada.next();
			System.out.print("Informe a senha: ");
			senha = entrada.next();
		}
		System.out.print("Acessado com sucesso! ");
		
		entrada.close();
	}

}
