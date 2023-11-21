import java.util.Scanner;
import javax.swing.JOptionPane;
public class Calculator 
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
	    String Function;
	   
	    Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number:");
		num1 = input.nextInt();
		System.out.println("Enter the second number:");
		num2 = input.nextInt();
		
		Scanner op = new Scanner(System.in);
		 
		System.out.println("choose Function");
		System.out.println("+ - * /");
		Function = op.next();
		if (Function == "+");
		{
			System.out.println("Answer is " + (num1+num2));
		}

		if (Function == "-");
		{
			System.out.println("Answer is " + (num1-num2));
		}
		
		if (Function == "*");
		{
			System.out.println("Answer is " + (num1*num2));
		}
		
		if (Function == "/");
		{
			System.out.println("Answer is " + (num1/num2));
		}

	}

}
