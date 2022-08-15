package array_prog;

import java.util.Scanner;

public class Prog_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size");
		int size;
		size=sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter a number");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i] =a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the descending numbers are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}

	}

}
