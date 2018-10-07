import java.util.Scanner;

public class TOANDFRO {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int columns = scan.nextInt();

		while (columns != 0) {
			String message = scan.next();
			int matrixRows = columns != 0 ? message.length() / columns : 0;
			int matrixColumns = columns;

			String[][] matrix = new String[matrixRows][matrixColumns];
			int k = 0, j = 0, i = 0;

			for (i = 0; i < matrixRows && k < message.length(); i++) {
				if (i % 2 == 0) {
					for (j = 0; j < matrixColumns; k++, j++) {
						matrix[i][j] = message.substring(k, k + 1);
					}
					System.out.println();
				}

				else {
						for (j = matrixColumns - 1; j >= 0; k++, j--) {
							matrix[i][j] = message.substring(k, k + 1);
					}
						System.out.println();
				}
			}
			
			for (i = 0; i < matrixColumns ; i++) {
				for (j = 0; j < matrixRows ; j++) {
				System.out.print(matrix[j][i]);
				}
				
			}
			columns = scan.nextInt();
		}
	}
}
