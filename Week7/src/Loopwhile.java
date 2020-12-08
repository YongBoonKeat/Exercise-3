
public class Loopwhile {

	public static void main(String[] args) {
	{
		
		//For
		System.out.print("\nFor :");
		for(int i=0; i<=5;i++) {
		for(int j=0; j<i;j++) {
		System.out.print("*");		
		}
		System.out.println();
		}
	
		//While
		System.out.print("\nWhile :");
		int i=0;
		while(i<=5) {
		int j= 0;
		while(j<i) {
		System.out.print("$");
		j++;
		}
		System.out.println();
		i++;
		}
	
		//Do While
		System.out.println("\nDoWhile :");
		int a=0;
			do {
		int b=0;
			do {
		System.out.print("%");
		b++;
		}while(b<=a);
		a++;
		System.out.println();
		}while (a<5);
	}		
	
	{
		
		//For
		System.out.println("\nFor :");
		for(int i=0; i<=5;i++) {
		for(int j=5; j>i;j--) {
		System.out.print("*");		
		}
		System.out.println();
		}
	
		//While
		System.out.println("\nWhile :");
		int i=0;
			while(i<=5) {
		int j=5;
			while(j>i) {
		System.out.print("$");
		j--;
		}
		System.out.println();
		i++;
		}
			
		//Do While
		System.out.println("\nDoWhile :");
		int a=0;
			do {
		int b=5;
			do {
		System.out.print("%");
		b--;
		}while(b>a);
		a++;
		System.out.println();
		}while (a<5);
	}

}
}


