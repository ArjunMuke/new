package condition;

import java.util.Scanner;

public class trueFalse {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number");
		int a = scanner.nextInt();
		
		if(a<=10)
		{
			System.out.println("The given number is negtive");
		}
		else if(a<50 || a<0)
		{
			System.out.println("The given number is between 0 to 100");
		}
		else if(a<101 && a<=200)
		{
            System.out.println("The given number is between 101 to 200");
		}
			
	}

}
