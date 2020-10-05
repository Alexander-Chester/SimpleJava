package fibonacci;


public class SimpleJavaFibonacci {
	
	public static void main(String[] args) {
	
		int firstVariable = 0;
		int secondVariable = 1;
		int updaterVariable =1;
		
		System.out.println(firstVariable);
			/*https://www.youtube.com/watch?v=2kyctZDPeio&t=176s
		referenced for algorithm which after I went through and made sure I understood, I slightly
	    modified it to fit the assignment parameters*/
		while( updaterVariable<10000) {
			
			System.out.println(updaterVariable);
			updaterVariable = firstVariable + secondVariable;
			firstVariable = secondVariable;
			secondVariable = updaterVariable;
			
			
		
			
		}
		 
		
}
}
