package exercicio3_loops;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int n = -1;
		
		for (int i = 0; i < 20; i++) {
			n = n + 1;
			System.out.println(n+1);
		}
		n = 0;
		for (int i = 0; i < 20; i++) {
			n = n+1;
			System.out.print(" | "+n);
		}
	}

}
