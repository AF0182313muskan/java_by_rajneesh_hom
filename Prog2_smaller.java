package array_prog;

import java.util.Scanner;

public class Prog2_smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter a size");
		size=sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter a number");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		int temp=a[0];
		for(int i=0;i<a.length;i++) {
			if(temp>a[i]) {
				temp=a[i];
			}
		}
		System.out.println("the smaller number is : "+temp);
		

}
}
 
		
		