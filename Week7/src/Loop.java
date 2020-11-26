
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For
			System.out.println("\nFor :");
			int term = 5;
			for(int i=0; i<=term;i++) {
			for(int j=term; j>i;j--) {
			System.out.print("*");		
			}
			System.out.println();
			}
		//While
			System.out.println("\nWhile :");
			int a=0;
			while(a<=term) {
			int b= term;
			while(b>a) {
				System.out.print("$");
				b--;
			}
				System.out.println();
				a++;
			}
		//Do While
			System.out.println("\nDoWhile :");
			  int e=0;
              	do {
              int f=term;
                do {
              System.out.print("%");
              f--;
              }while(f>e);
              System.out.println();
              e++;
              }while(e<term);
}

}
