import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner scan = new Scanner(System.in);

				List<Integer> nums = new ArrayList<Integer>();
				while(scan.hasNextInt()) {
					nums.add(scan.nextInt());
				}
				
				for(int i = 0 ; i< nums.size(); i++) {
					if (nums.get(i) != 42) {
						System.out.println(nums.get(i));
					}else {
						break;
						
					}
					
				}
	
	}
}