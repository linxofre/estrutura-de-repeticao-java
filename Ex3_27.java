package exercicio3_loops;

import java.util.Scanner;

public class Ex3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int i = 0;
		float valor_total = 0;
		float troco = 0;
		float produto = 1;


		while (produto != 0) {
			System.out.println("Insira o valor do produto: \nObs:O valor zero deve ser informado pelo operador para indicar o final da compra!");
			produto = entrada.nextFloat();
			++i;
			System.out.println("Lojas Tabajara");
			System.out.println("Produto" + i + ": - R$" + produto);
			valor_total = (valor_total + produto);
		}
		System.out.println("Total: R$ " + valor_total);
		System.out.println("Insira o valor em dinheiro:");
		double money = entrada.nextDouble();
		System.out.println("Dinheiro: R$ " + money);
		troco = (float) (money - valor_total);
		System.out.println("Troco: R$ " + troco);

		entrada.close();
	}

}
