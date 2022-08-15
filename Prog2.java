package method_prog;
//Write a program to find area of triangle with method
//formula area of circle = base*height/2
public class Prog2 {
 void triangle(float a,float b) { //we have used float bcz the result is in point so we cant use int data type
	float area1=a*b/2;
	 System.out.println("the area of triangle is : "+area1 );
	 
 }
 //Write a program to find area of rectangle with method
 //formula area of rectangle = width*length
 void rectangle(int w,int l) {
	 int area2 = w*l;
	 System.out.println("the area of rectangle is : "+area2);
	 
 }
 //Write a program to find area of square with method
 //formula area of square = side*side
 void square(int s1,int s2) {
	 int area3=s1*s2;
	 System.out.println("the area of square is : "+area3);
	 
 }
 //Write a program to find perimeter of rectangle with method
 //formula of perimeter of rectangle = P=2(l+w)
 
 void perimeter(float c, float d) {
	 float area4 =(c+d)*2;
	 System.out.println("the perimeter of rectangle is : "+area4);
 }
//Write a program to find area of circle with method
 //formula of area of circle = 3.14*r*r
 void circle(double r1, double r2) {
	 double area5 = (3.14*r1*r2);
	 System.out.println("The area of circle is : "+area5);
	 
 }
}










