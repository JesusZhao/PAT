import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long s = 0;
		long temp = 1;
		for (int i = 1; i <= n; i++) {
			temp *= i;
			s += temp;
		}
		System.out.print(s);
	}
	
}