import java.util.Scanner;

public class Candy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		while( size != -1) {
			int[] num = new int[size];
      
			// input from the scan 
			for(int i = 0 ; i < size ; i++) 
				num[i] = scan.nextInt();
        
			// Initializing variables 
			int sum = 0, count = 0 , output = 0, j = 0;
      
			// calculating the sum 
			for(int i = 0 ; i < size ; i++) 
				sum += num[i];
			// the output test
			if(sum % size != 0 && size != 0) 
				output = -1;
			else
				output = sum / size;
        
			// counting the numbers of moves 
			for(j = 0 ; j < size ; j++) 
				while( num[j] > output) {
					count++;
					num[j]--;
				}
        
			// printing the number of candies per packet
			if( output != -1)
				System.out.println(count);
			else 
				System.out.println(output);
        
			size = scan.nextInt();
			}
		}
	}
