import java.util.Scanner;


class Calculation
{
	int total;
	public void addition(int x, int y)
	{
		total = x+y;
		System.out.println("Total = " + total);	
	}
	public void subtraction(int x, int y)
	{
		total = x-y;
		System.out.println("Total = " + total);	
	}
	public void multiplication(int x, int y)
	{
		total = x*y;
		System.out.println("Total = " + total);	
	}
	public void division(int x, int y)
	{
		total = x/y;
		System.out.println("Total = " + total);	
	}
}

public class Calcu
{
	public static void main(String[] args)
	{
	int choice;
	Calculation calcu = new Calculation();
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print(" 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division \n Enter your choice:");
	choice = scanner.nextInt();
	switch(choice)
	{
		case 1: calcu.addition(12,10);
			break;
		case 2: calcu.subtraction(12,10);
			break;
		case 3: calcu.multiplication(12,10);
			break;
		case 4: calcu.division(12,10);
			break;
		default: System.out.println("Invalid selection");
			break;
	}
	}
}
