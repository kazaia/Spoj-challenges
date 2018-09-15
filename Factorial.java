import java.util.Scanner;

public class Main {

// Utility method to find trailing zeros 
	public static int findZeros(int a) {
		int result = a;
		int temp = 0;
		while (result > 0) {
			result = result / 5;
			temp += result;
		}
		return temp;
	}

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int nums[] = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			nums[i] = scan.nextInt();
		}
		for (int i = 0; i < testCases; i++) {
			System.out.println(findZeros(nums[i]));
		}
	}
}
