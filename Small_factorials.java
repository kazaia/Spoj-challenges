import java.math.BigInteger;
import java.util.Scanner;

class Small_factorials {

	public static BigInteger factorial(BigInteger n) {

		BigInteger i = BigInteger.ONE;
		BigInteger fact = BigInteger.ONE;

		while (i.compareTo(n) <= 0) {
			fact = fact.multiply(i);
			i = i.add(BigInteger.ONE);
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int[] nums = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			nums[i] = scan.nextInt();
		}
		for (int i = 0; i < testCases; i++) {
			System.out.println(factorial(BigInteger.valueOf(nums[i])));
		}
	}
}
