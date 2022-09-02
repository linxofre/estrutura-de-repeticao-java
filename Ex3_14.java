package exercicio3_loops;

public class Ex3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 1;
		int n2 = 1;

		System.out.print("S = ");
		while (n1 <= 5) {
			System.out.print(n1 + " / " + n2 + " + ");
			n1++;
			n2 += 2;
		}
		System.out.print(" ... + n/m");
	}

}
