package fibonacci;
import java.util.Scanner;
public class Fibonacci {
		static int [] members;

		public static void main(String[] args) {
			// Input the number of terms using a Scanner to take an integer
			//To do
			Scanner input = new Scanner(System.in);
			System.out.println("enter a number of elements for the array");
			int elements = input.nextInt();
			int[] members = new int[elements];
			members[0] = 1;
			members[1] = 1;
			System.out.print( members[0]+" "+members[1] );
			
		
			for (int i = 2; i<members.length; i++) {
				members[i] = members[i-1]+members[i-2];
				
				System.out.print(" " + members[i]);
				
			}
		
		}

	}


