import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int squares = 0; 

		while( n != 0 ) {
		     squares = n * (n+1) * (2*n+1) / 6;
		     System.out.println(squares);
		     n = scan.nextInt(); 
		}
	}
}
