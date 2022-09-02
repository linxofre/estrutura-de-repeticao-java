package exercicio3_loops;

import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String nome;
		int idade;
		float salario;
		char genero, estado_civil;

		while (true) {
			System.out.println("Informe um nome: ");
			nome = entrada.nextLine();
			if (nome.length() > 3) {
				System.out.println("Nome válido.");
				break;
			} else {
				System.out.println("O nome precisa ter mais que 3 caracteres.");
			}
		}

		while (true) {
			System.out.println("Informe uma idade entre 0 a 150: ");
			idade = entrada.nextInt();
			if ((idade > 0) && (idade <= 150)) {
				System.out.println("Idade válida.");
				break;
			} else {
				System.out.println("Idade precisa ser entre 0 a 150");
			}
		}

		while (true) {
			System.out.println("Informe um salário maior que 0: ");
			salario = entrada.nextFloat();
			if (salario > 0) {
				System.out.println("Salario válido.");
				break;
			} else {
				System.out.println("o Salario precisa ser maior que 0 (zero)");
				
			}
		}

		while (true) {
			System.out.println("Informe o sexo (f ou m): ");
			genero = entrada.next().charAt(0);
			genero = (Character.toString(genero).toUpperCase()).charAt(0);
			if ((genero == 'M') || (genero == 'F')) {
				System.out.println("Sexo válido.");
				break;
			} else {
				System.out.println("O sexo precisa ser Feminino ou Masculino (f ou m)");
			}
		}

		while (true) {
			System.out.println("Informe um estado civil: soleiro (s), Casado(c), Viúvo (v), Divorciado (d): ");
			estado_civil = entrada.next().charAt(0);
			estado_civil = (Character.toString(estado_civil).toUpperCase()).charAt(0);
			if (estado_civil == 'S'|| 
					estado_civil == 'C' || 
					estado_civil == 'V' || 
					estado_civil == 'D') {
				System.out.println("estado civil válido.");
				break;
			} else {
				System.out.println("estado civil inválido.");
			}
		}
			entrada.close();
	}



}
