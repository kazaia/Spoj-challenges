import java.util.Scanner;

public class Main {

	public static String getPosition( int x, int y) {
		
		String output = null; 
		int result = 0;
		if( x == y || y == (x - 2)) {
			if( x % 2 == 0 && y % 2 == 0 ) { 
				 result = x + y ;
				 output = Integer.toString(result);
			}
			else {
				 result = x + y -1 ;
			     output = Integer.toString(result);
			}
		}	else 
			output = "No Number";
		return output; 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		 int num[][] = new int[testCases][2];
		 
		 for( int i = 0; i < testCases ; i ++) {
			 num[i][0] = scan.nextInt();
			 num[i][1] = scan.nextInt();
		 }
		 for( int i = 0; i < testCases ; i ++) {
			 System.out.println(getPosition(num[i][0], num[i][1]));
		 }	
	}
}
