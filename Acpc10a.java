import java.util.*;

public class Acpc10a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int ratio = 0; 
		int next = 0; 
		while( a!= 0 || b !=  0 || c != 0 ) {
			
			if( b - a  == c - b  ) {
				ratio = c - b; 
				next = c + ratio; 
				System.out.println("AP" + " " + next );
				}
			else if ( c*a == b*b && a!= 0) {
				ratio = b/a; 
				next = c*ratio; 
				System.out.println("GP" + " " + next );
			}	
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		}
	}
}
