
public class EXERCISE {

	public static void main(String[] args) {
//Exercise1
{	
			int choice = 1, total = 0;
			while (choice < 4){
				//increase the choice n put it into total variable
				total = choice++;
				System.out.println(total);	
				}	
				System.out.println();
}

//Exercise2
{
			for (int number = 2; number < 20; number++)	
			{
				//number multiply by 2
				number = number * 2;
				//If number is less than 15 then print out the number
				//Now number is equal to 4 then the number will increase by 1 equal to 5
				if (number < 15)
					System.out.println(number);
			}
			System.out.println();
}
//Exercise3
{
		int i = 1;
		 do {	
			if ((i%2) == 0)
			System.out.println(i);
			i++;
		    } while(i<5);
}

}
}
