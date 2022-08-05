package java_conditionalStatement;

import java.util.Scanner;

//Program with if else if ladder
//1) WAP to find number is positive, negative or zero
public class If_else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		if(a>0) {
			System.out.println("It is a positive number");
		}
		else if(a<0) {
			System.out.println("It is a negative number");
		}
		else {
			System.out.println("zero");
		}

	}

}
