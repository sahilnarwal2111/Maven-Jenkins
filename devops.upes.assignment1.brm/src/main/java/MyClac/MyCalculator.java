package MyClac;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double num1, num2, result;
	        char operator;

	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter first number: ");
	        num1 = input.nextDouble();

	        System.out.println("Enter second number: ");
	        num2 = input.nextDouble();

	        System.out.println("Enter operator (+, -, *, /): ");
	        operator = input.next().charAt(0);

	        switch(operator) {
	            case '+':
	                result = num1 + num2;
	                break;

	            case '-':
	                result = num1 - num2;
	                break;

	            case '*':
	                result = num1 * num2;
	                break;

	            case '/':
	                result = num1 / num2;
	                break;

	            default:
	                System.out.println("Invalid operator!");
	                return;
	        }

	        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

	}

}
