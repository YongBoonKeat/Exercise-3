
public class QUIZ2 {

	public static void main(String[] args) {
{	
	//QUESTION 1	
	System.out.println("1.");
	int max = 5;
		for (int n = 1; n <= max; n++) {
	System.out.println(n);
	}
	System.out.println();
	
	//ANSWER 
	int a = 5;
	int b = 1;
		while(b<=a) {
	System.out.print(b);
		b++;
	System.out.println();
	}
	System.out.println();
}
{
	//QUESTION 2	
		{
	System.out.println("2.");
	int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
		total = total - number;
	System.out.println(total + " " + number);
	}
	System.out.println();
		
	//ANSWER	
	int sum = 25;
	int num = 1;
		while(num <= (sum/2)) {
		sum = sum - num;
	System.out.println(sum + " " + num);
	num++;
		}
	System.out.println();
	}
}
{
	//QUESTION 3
	System.out.println("3.");
		for (int i = 1; i <= 2; i++) {
		for (int j = 1; j <= 3; j++) {
		for (int k = 1; k <= 4; k++) {
	System.out.print("*");
	}
	System.out.print("!");
	}
	System.out.println();
	}
	System.out.println();
	
	//ANSWER
	int a = 1;
		while (a <= 2) {
	int b=1;
		while (b <= 3) {
	int c=1;
		while (c <= 4 ) {
	System.out.print("*");
		c++;
	}
	System.out.print("!");
		b++;
	}
	System.out.println();
		a++;
	}
	System.out.println();
}
{
	//QUESTION 4
	System.out.println("4.");
	int number = 4;
	for (int count = 1; count <= number; count++) {
	System.out.println(number);
	number = number / 2;
	}
	System.out.println();
	
	//ANSWER
	int num1 = 4; 
	int c = 1;
	while (c <= num1) {
	System.out.println(num1);
	num1 = num1/2;
	c++;
	}
}
}
}
