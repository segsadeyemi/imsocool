
/*	======================================================================
		 <<<<<<<<<<<<<<<<<<------- Samuel Danquah ---------->>>>>>>>>>>>
		<<<<<<<<<<<<<<<<<<------Oluwasegun Adeyemi ---------->>>>>>>>>>>>
	======================================================================
*/
import java.util.Scanner;

import java.lang.Math;

public class calc{

	//Perform Operation
	public static void operation() {

		//Operation Input
		System.out.println("=========================================");
		System.out.println("Press '1' for Addition:");
		System.out.println("Press '2' for Subtraction:");
		System.out.println("Press '3' for Product:");
		System.out.println("Press '4' for Division:");
		System.out.println("Press '5' for Modulus:");
		System.out.println("Press '6' for Average:");
		System.out.println("Press '7' for Square Root:");
		System.out.println("=========================================");

		Scanner in = new Scanner(System.in);
		int operation = in.nextInt();	
		
		if (operation == 1) {
			//First Input
			System.out.println("Enter First Number:");
			System.out.println("=========================================");
			int a = in.nextInt();

			//Second Input
			System.out.println("Enter Second Number:");
			System.out.println("=========================================");
			int b = in.nextInt();	

			add(a,b);	


		} else if (operation == 2) {

				//First Input
			System.out.println("Enter First Number:");
			System.out.println("=========================================");
			int a = in.nextInt();

			//Second Input
			System.out.println("Enter Second Number:");
			System.out.println("=========================================");
			int b = in.nextInt();	

			subtract(a,b);

		} else if (operation == 3) {

				//First Input
			System.out.println("Enter First Number:");
			System.out.println("=========================================");
			int a = in.nextInt();

			//Second Input
			System.out.println("Enter Second Number:");
			System.out.println("=========================================");
			int b = in.nextInt();

			multiply(a,b);

		} else if (operation == 4) {

				//First Input
			System.out.println("Enter First Number:");
			System.out.println("=========================================");
			int a = in.nextInt();

			//Second Input
			System.out.println("Enter Second Number:");
			System.out.println("=========================================");
			int b = in.nextInt();	
			divide(a,b);

		} else if (operation == 5) {

				//First Input
			System.out.println("Enter First Number:");
			System.out.println("=========================================");
			int a = in.nextInt();

			//Second Input
			System.out.println("Enter Second Number:");
			System.out.println("=========================================");
			int b = in.nextInt();	

			modulus(a,b);

		}  else if (operation == 6) {

				//First Input
			System.out.println("Enter First Number:");
			System.out.println("=========================================");
			int a = in.nextInt();

			//Second Input
			System.out.println("Enter Second Number:");
			int b = in.nextInt();	

			average(a,b);

		}	else if (operation == 7) {

				//First Input
			System.out.println("Enter Number:");
			System.out.println("=========================================");
			double a = in.nextInt();

			sqroot(a);
		}	
		
	} 

	//Add
	public static void add(int a, int b){


		int add = a + b;
		System.out.println("The Sum is: " + add);

	}

	//Subtract
	public static void subtract(int a, int b){

	
		int subtract = a - b;
		System.out.println("The Subtraction is: " + subtract);

	}

	//Multiply
	public static void multiply(int a, int b){

	
		int multiply = a * b;
		System.out.println("The Product is: " + multiply);

	}

	//Division
	public static void divide(int a, int b){

		
		double divide = a / b;
		System.out.println("The Division is: " + divide);

	}

	//Modulus
	public static void modulus(int a, int b){

		int modulus = a % b;
		System.out.println("The Modulus (a mod b): " + modulus);

	}

	//Average
	public static void average(int a, int b){

		double average = (a + b)/2;
		System.out.println("The Average: " + average);

	}

	//Square Root
	public static void sqroot(double a){

		double sqroot = Math.sqrt(a);
		System.out.println("The Square Root is: " + sqroot);

	} 

	

	public static void main(String[] args) {

		operation();

		
	}
}