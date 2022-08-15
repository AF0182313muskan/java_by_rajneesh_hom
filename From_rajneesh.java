package array_prog;

import java.util.Scanner;

public class From_rajneesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] a=new int[size];
	    System.out.println("Hey user can you enter the number for array");
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    System.out.println("Before swapping the number are");
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    try
	    {
	    for(int i=0;i<a.length;i+=2)
	    {
	    	for(int j=i;j<=i;j++)
	    	{
	    		if(a[i]%2==0 && a[++j]%2==1)
	    		{
	    			temp1=a[i];
	    			a[i]=a[j];
	    			a[j]=temp1;
	    		}
	    		else if(a[i]%2==1 && a[++j]%2==0)
	    		{
	    			temp1=a[i];
	    			a[i]=a[j];
	    			a[j]=temp1;
	    		}
	    	}
	    }
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	e.printStackTrace();
	    }
	    	 System.out.println("After swapping the number are");
	 	    for(int i=0;i<a.length;i++)
	 	    {
	 	    	System.out.println(a[i]);
	 	    }
	    }
}