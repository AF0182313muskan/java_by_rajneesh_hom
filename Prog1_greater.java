package array_prog;
//Greater number in array

import java.util.Scanner;

public class Prog1_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter a size");
		size=sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter a number");
				for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("the greater number is: "+temp);
		
}
}
