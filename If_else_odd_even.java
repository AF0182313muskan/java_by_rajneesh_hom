package java_conditionalStatement;

import java.util.Scanner;

//Program with if else
//1) WAP to find number is odd or even but you have to take number from from user
public class If_else_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("It is a odd number");
		}

	}

}
