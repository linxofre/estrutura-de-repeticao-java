package exercicio3_loops;

public class Ex3_6 {

	public static void main(String[] args) {

		int n = 0;
		
		for (int i = 1; i < 50; i++) {
			if(i % 2 != 0) {
				n = i;
				System.out.println("ímpar: "+ n);
			}
		}
	}

}
