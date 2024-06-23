package divisionproblem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int constantNumber=50;
		
		try {
			System.out.println("Enter an integer: ");
			int inputValue=scanner.nextInt();
			double result=constantNumber/inputValue;
			System.out.println("Result of division: "+ result);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter enter an Integer value");
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero");
		}
		finally {
			System.out.println("Exception handling process completed");
			scanner.close();
		}
		

	}

}
