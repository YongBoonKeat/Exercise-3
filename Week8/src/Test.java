import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Exercise1();
		Exercise2();
	}
		public static void Exercise1(){	
{
		int value; 		// to hold number
		int sum = 0; 	//initialize the sum
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer(enter 0 to quit): ");
		value = input.nextInt();
		
		while (value != 0)//Write your expression/condition
		{
			sum = sum + value;
			
			System.out.print("Enter first integer(enter 0 to quit): ");
			value = input.nextInt();
		}
		
		System.out.println("Sum of the integer: " + sum);	
}
}
		public static void Exercise2(){	
{
	int value; 		
	int sum = 0; 
	char choice; 	//to hold 'y' or 'n'
	
		Scanner input = new Scanner(System.in);
	do
	{	
		System.out.print("Enter integer: ");
		value = input.nextInt();
	
		sum = sum + value;
	
		System.out.print("Enter Y for yes or N for no: ");
		choice = input.next().charAt(0);
	}
	while (choice != 'N' || choice == 'Y');//Write your expression/condition
	
	System.out.print("Sum of the integer: " + sum);	
}
}	
	
}



