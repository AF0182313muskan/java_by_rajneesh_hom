package java_conditionalStatement;

import java.util.Scanner;

/*Program with if else if ladder
1) WAP to find addition ,subtraction ,multiplication,division 
and  modulo and you have to take input from user and at
a time you have to perform only single calculation it may be addition, 
subtraction, multiplication,division.
*/

public class If_else_if_ladder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		char a;
		a = sc.next().charAt(0);
		if(a=='+') {
			System.out.println("the addition is : "+(num1+num2));	
		}
		else if(a=='-') {
			System.out.println("the substraction is : "+(num1-num2));	
		}
		else if(a=='*') {
			System.out.println("the multiplication is : "+(num1*num2));	
		}
		else if(a=='/') {
			System.out.println("the division is : "+(num1/num2));	
		}
		else if(a=='%') {
			System.out.println("the modulo is : "+(num1%num2));	
		}
		else {
			System.out.println("Invalid");
		}
		
		
		
		

	}

}
