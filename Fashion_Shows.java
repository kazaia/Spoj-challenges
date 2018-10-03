import java.util.Arrays;
import java.util.Scanner;

public class Fashion_Shows {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		while (testCases > 0) {
			int size = scan.nextInt();
			int[] men = new int[size];
			int[] women = new int[size];
			int sum = 0, i = 0;
			for (i = 0; i < size; i++)
				men[i] = scan.nextInt();

			for ( i = 0; i < size; i++) 
				women[i] = scan.nextInt();
				
			Arrays.sort(men);
			Arrays.sort(women);

			for (i = 0; i < size; i++)
				sum += men[i] * women[i];
			
			System.out.println(sum);
			testCases--;
			}
		}
	}

