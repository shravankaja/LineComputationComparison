import java.util.*;
import java.lang.*; 
public class LineComputationComparison {
	
	public static void main(String Args[])
	{
		System.out.println("Welcome to Line Computation and Comparison Program");
		Main m=new Main();
		System.out.println("Enter Point (x1,y1)");
		Scanner sc= new Scanner(System.in);
		float x1= sc.nextFloat();
		float y1= sc.nextFloat();  
	
		System.out.println("Enter Point (x2,y2)");
		float x2= sc.nextFloat();
		float y2= sc.nextFloat(); 
		double resultLine1=m.computeLine(x1,y1,x2,y2);
		
		System.out.println("Enter Point of second line (x1,y1)");
		float x11= sc.nextFloat();
		float y11= sc.nextFloat();  
	
		System.out.println("Enter Point (x2,y2)");
		float x22= sc.nextFloat();
		float y22= sc.nextFloat();
		double resultLine2 = m.computeLine(x11,y11,x22,y22);
		
		m.equalsTo(resultLine1,resultLine2);
		m.compareTo(resultLine1,resultLine2);
	}

}


	
 
