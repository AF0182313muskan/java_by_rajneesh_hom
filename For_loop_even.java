package looping_stm;

import java.util.Scanner;

//WAP to print even number from 2 to 100
public class For_loop_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=100;
		System.out.println("even no");
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		*/
		//using scanner
				int n1,n2;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter n1");
				n1=sc.nextInt();
				System.out.println("enter n2");
				n2=sc.nextInt();
				System.out.println("even numbers are");
				for(int i=n1;i<=n2;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
					
				}
	}

}
