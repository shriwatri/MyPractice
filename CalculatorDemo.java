import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		double num1,num2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = scn.nextDouble();
		System.out.println("Enter second number:");
		num2 = scn.nextDouble();
		System.out.println("Enter an operator to perform operation(+,-,*,/)");
		char opr = scn.next().charAt(0);
		double outPut = 0;
		switch (opr) {
		case '+':
			outPut = num1+num2;			
			break;
			
		case '-':
			outPut = num1-num2;			
			break;
			
		case '*':
			outPut = num1*num2;			
			break;
			
		case '/':
			outPut = num1/num2;			
			break;

		default:
			System.out.println("Please enter valid operator from operation(+,-,*,/)");
			return;
		}
		System.out.println(num1 +" "+ opr+" "+num2+" "+"= "+outPut);

	}

}
