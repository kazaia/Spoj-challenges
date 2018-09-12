import java.util.*;
import java.lang.*;

public class PrimeGenerator {

	public static boolean isPrime(int num) {

		if (num == 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) throws Exception{

		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		int tab[][] = new int[testcases][2];
		for (int i = 0; i < testcases; i++) {
			tab[i][0] = scan.nextInt();
			tab[i][1] = scan.nextInt();
		}


		for (int i = 0; i < testcases; i++) {
			int m = tab[i][0];
			int n = tab[i][1];

			for (int aNmuber = m; aNmuber <= n; aNmuber++) {
				if (isPrime(aNmuber) == true)
					System.out.println(aNmuber);
			}
			System.out.println();
		}
	}

}
