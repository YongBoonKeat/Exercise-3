
public class Exercise3 {

	public static void main(String[] args) {
{
//Use For Loop
		System.out.println("For Loop");
		int sum=0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
	
		for (int number = lowerbound; number <= upperbound; ++number) {
		sum += number; 	
		}
		average= sum/100;
	
		System.out.println("The sum of 1 to 100 is " +sum);
		System.out.println("The average is " +average);
		System.out.println();
}
{
//Use while-do
		System.out.println("While-do");
		int sum1 = 0;
		double average1;
		int lowerbound = 1;
		int upperbound = 100;
	    int number = lowerbound;        
	      while (number <= upperbound) {  
	         sum1 += number;
	         ++number;   
	     }
	     average1= sum1/100;
			
		System.out.println("The sum of 1 to 100 is " +sum1);
		System.out.println("The average is " +average1);
		System.out.println();
}			
{
//Use do-while
		System.out.println("Do-while");
		int sum2 = 0;
		double average2;
		int lowerbound = 1;
		int upperbound = 100;
		int number2 = lowerbound;      
		      
		   do {
		      sum2 += number2;
		      ++number2;                     
		   } while (number2 <= upperbound);
		      
		     average2= sum2/100;
				
		System.out.println("The sum of 1 to 100 is " +sum2);
		System.out.println("The average is " +average2);
		System.out.println();
}		      

}
}

	

		

