package looping_stm;

import java.util.Scanner;

//WAP to print number from 855 to 500 with for loop
public class For_loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using Scanner
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1");
		n1=sc.nextInt();
		System.out.println("Enter n2");
		n2=sc.nextInt();
		for(int i=n1;i>=n2;i--) {
			System.out.println(i);
		}
		

	}
	//without using scanner
	/*for(int i=855;i>=500;i-- ) {
		System.out.println(i);
	}

}*/
}