package exercicio3_loops;

import java.util.Scanner;

public class Ex3_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int cod_cidade;
		int cidade = 0;
		int maior_cidade = 0;
		int menor_cidade =0;
		int cidadeMenosVeiculos = 0;
		float total = 0;
		float menosVeiculos = 0;
		float quantveiculos = 0;
		float quant_acidentes = 0;
		float maiorAcidentes = 0;
		float menorAcidentes = 999;  
		float menormedia = 0;
		
		while(cidade<5) {
			System.out.println("Insira o código da cidade: ");
			cod_cidade = entrada .nextInt();
			System.out.println("Insira a quantidade de veiculos de passeios no ano de 1999: ");
			 	quantveiculos = entrada .nextInt();
			 System.out.println("Insira a quantidade de acidentes de transito com vítimas no ano de 1999: ");
			 quant_acidentes=entrada .nextFloat();
		
			 	cidade++;
			 	total=quantveiculos + total;
		
		if (quant_acidentes < menorAcidentes) {
			menor_cidade = cod_cidade;
			menorAcidentes = quant_acidentes; 	
		}
		
		if (quant_acidentes > maiorAcidentes) {
			maior_cidade = cod_cidade;
			maiorAcidentes = quant_acidentes; 	
		}
				
		if (quantveiculos < 2000) {
			menosVeiculos=quantveiculos+menosVeiculos;
			cidadeMenosVeiculos++;
			menormedia= (menosVeiculos/cidadeMenosVeiculos);
		}
		
	}
		System.out.println("A cidade com a maior quantidade de acidentes: " + maior_cidade);
		System.out.println("O número de acidentes: " + maiorAcidentes);
		System.out.println("A cidade com a menor quantidade de acidentes: " + menor_cidade);
		System.out.println("O número de acidentes: " + menorAcidentes);
		System.out.println("média de veículos nas cinco cidades juntas: " + (total/cidade));
		System.out.println("média de acidentes nas cidades com menos de 2000 veículos de passeios: " + menormedia);

		entrada.close();
	}

}
