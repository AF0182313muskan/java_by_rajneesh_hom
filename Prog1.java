package method_prog;

import java.util.Scanner;

//To find square of any number
public class Prog1 {
 void square() {
	 int n1 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		n1=sc.nextInt();
	 System.out.println(n1*n1);
 }
 //To find number is even or odd
	void evenodd() {
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		n1= sc.nextInt();
		if(n1%2==0) {
			System.out.println("it is even no");
		}
		else {
			System.out.println("it is odd no");
		}
	}
	}


