package exercicio3_loops;

import java.util.Scanner;

public class Ex3_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);	

		int codAlto = 0;
		int codBaixo = 0;
		int cod_acima_do_peso = 0;  
		int codimagro = 0;
		
		double omaisalto = Double.MIN_VALUE;
		double omaisbaixo = Double.MAX_VALUE;
		double gordo = Double.MIN_VALUE;
		double magro = Double.MAX_VALUE;
		
		double peso_total = 0;
		double alturatotal = 0;
		
		int i=0;
		while (true) {
		    System.out.print("Cliente, insira seu código: ");
		    int codicliente = entrada.nextInt();
		    if (codicliente == 0) 
		      	break;
		   
		    i++;	   
		    System.out.print("Insira sua altura: ");
		    double altura = entrada.nextDouble();
		    System.out.print("Insira seu peso: ");
		    double peso = entrada.nextDouble();
		    peso_total+=peso;
		    alturatotal+=altura;
		    
		    if (peso > gordo) {
		    	cod_acima_do_peso = codicliente;
		        gordo = peso;
		    }
		    if (peso < magro) {
		        codimagro = codicliente;
		        magro = peso;
		    }
		    if (altura > omaisalto) {
		    	codAlto  = codicliente;
		        omaisalto = altura;
		    }
		    if (altura < omaisbaixo) {
		    	codBaixo = codicliente;
		        omaisbaixo = altura;
		    }
		   
		}
		
		System.out.println("O código do cliente mais alto: " + codAlto );
		System.out.println("O código do cliente mais baixo: " + codBaixo);
		System.out.println("O código do cliente mais gordo: " + cod_acima_do_peso);
		System.out.println("O código do cliente mais magro: " + codimagro);
		System.out.println("A média da altura dos clientes: " + (alturatotal/i));
		System.out.println("A média de peso dos clientes: " + (peso_total/i));
	
		entrada.close();
	}

}
