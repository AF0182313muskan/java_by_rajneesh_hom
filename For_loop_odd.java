package looping_stm;

import java.util.Scanner;

//WAP to print odd number from 1 to 99
public class For_loop_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=99;
		System.out.println("odd no");
		for(int i=0;i<=n;i++) {
			if(i%2==1) {
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
		System.out.println("odd numbers are");
		for(int i=n1;i<=n2;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		
	}

}



