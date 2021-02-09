import java.util.*;
import java.lang.*; 
public class LineComputationComparison {
	static void equalsTo(double x, double y) 
		{
				if(x==y)
						{
							System.out.println("Lines are equal");
						}
				else 
						{
							System.out.println("Lines are not equal");
						}
		}
	static void compareTo(double x, double y)
		{
				if (x > y)
						{
							System.out.println("Line1 is greater than Line2");
						}
				else if (y > x)
						{
							System.out.println("Line2 is greater than Line2");
						}
		
		}
	public static void main(String Args[])
	{
		System.out.println("Welcome to Line Computation and Comparison Program");
		
		System.out.println("Enter Point (x1,y1)");
		Scanner sc= new Scanner(System.in);
		float x1= sc.nextFloat();
		float y1= sc.nextFloat();  
	
		System.out.println("Enter Point (x2,y2)");
		float x2= sc.nextFloat();
		float y2= sc.nextFloat(); 
		
		float A=x2-x1;
		float B=y2-y1;
		double Power = Math.pow(A, 2) + Math.pow(B, 2);
		double resultLine1 = Math.sqrt(Power);
		System.out.println("Lenght of the line based on the coordinates is : "+resultLine1);
		
		System.out.println("Enter Point of second line (x1,y1)");
		float x11= sc.nextFloat();
		float y11= sc.nextFloat();  
	
		System.out.println("Enter Point (x2,y2)");
		float x22= sc.nextFloat();
		float y22= sc.nextFloat(); 
		
		float A1=x22-x11;
		float B1=y22-y11;
		double Power1 = Math.pow(A1, 2) + Math.pow(B1, 2);
		double resultLine2 = Math.sqrt(Power1);
		System.out.println("Lenght of the second line based on the coordinates is : "+resultLine2); 
		equalsTo(resultLine1,resultLine2);
		compareTo(resultLine1,resultLine2);
	}

}


	
