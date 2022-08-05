package java_conditionalStatement;

import java.util.Scanner;

//Program with if else
//1) WAP to find greater between two number
//2) WAP to find positive and negative number
//take input from user 

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) WAP to find greater between two number
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greater than num2");
		}
		else {
			System.out.println("num2 is greater than num1");
		}

		//2) WAP to find positive and negative number
		//take input from user 
		int a;
		System.out.println("Enter a nummber");
		a=sc.nextInt();
		

		if(a>0) {
			System.out.println("It is a positive number");
		}
		else {
			System.out.println("It is a negative number");
		}
		
				
		
	}
	 
	

}








