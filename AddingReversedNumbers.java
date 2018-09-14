import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int reverse(int original) {

		String temp = Integer.toString(original);
		char[] digits = temp.toCharArray();

		for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
			int tempo = digits[i];
			digits[i] = digits[j];
			digits[j] = (char) tempo;
		}
		int result = Integer.parseInt(Arrays.toString(digits).replaceAll("\\[|\\]|,|\\s", ""));
		return result;
	}

	public static int sumOfReversedNumbers(int a, int b) {
		return reverse(a) + reverse(b);
	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int[][] numbers = new int[testCases][2];
		for (int i = 0; i < testCases; i++) {
			numbers[i][0] = scan.nextInt();
			numbers[i][1] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < testCases; i++) {
			sum = sumOfReversedNumbers(numbers[i][0], numbers[i][1]);
			System.out.println( reverse(sum));
		}
	}
}
