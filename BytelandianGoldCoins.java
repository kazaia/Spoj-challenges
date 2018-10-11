import java.util.HashMap;
import java.util.Scanner;

class BytelandianGoldCoins {

	public static long calculateCoins(long n, HashMap<Long, Long> memoized) {
		if (memoized.containsKey(n))
			return memoized.get(n);
		if (n == 0) {
			memoized.put(n,  0L);
			return memoized.get(n);
		}
		long value = Math.max(n,
				calculateCoins(n / 2, memoized) + calculateCoins(n / 3, memoized) + calculateCoins(n / 4, memoized));
		memoized.put(n, value);
		return value;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Long, Long> memoized = new HashMap<>();
		while (scan.hasNextLong()) {
			int n = scan.nextInt();
			System.out.println(calculateCoins(n, memoized));
		}
	}
}
