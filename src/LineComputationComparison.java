import java.util.*;
public class LineComputationComparison {

	public static void main(String Args[])
	{
		System.out.println("Welcome to Line Computation and Comparison Program");
		
		System.out.println("Enter Point (x1,y1)");
		Scanner sc= new Scanner(System.in);
		int x1= sc.nextInt();
		int y1= sc.nextInt();  
	
		System.out.println("Enter Point (x2,y2)");
		int x2= sc.nextInt();
		int y2= sc.nextInt(); 
		
		int A=x2-x1;
		int B=y2-y1;
		double P= Math.pow(A, 2) + Math.pow(B, 2);
		double R=Math.sqrt(P);
		System.out.println("Lenght of the line based on the coordinates is : "+R);
		
		System.out.println("Enter Point of second line (x1,y1)");
		int x11= sc.nextInt();
		int y11= sc.nextInt();  
	
		System.out.println("Enter Point (x2,y2)");
		int x22= sc.nextInt();
		int y22= sc.nextInt(); 
		
		int A1=x22-x11;
		int B1=y22-y11;
		double P1= Math.pow(A1, 2) + Math.pow(B1, 2);
		double R1=Math.sqrt(P1);
		System.out.println("Lenght of the second line based on the coordinates is : "+R1);
		if(R==R1)
		{
			System.out.println("Lines are equal");
		}
		if (R<R1)
		{
			System.out.println("Line 1 is less than Line 2");
		}
		else if(R>R1)
		{
			System.out.println("Line 1 is greater than Line 2");
		}
		else if(R1<R)
		{
			System.out.println("Line 2 is Less than Line 1");
			
		}
		else if(R1>R)
		{
			System.out.println("Line 2 is greater than Line 1");
		}
	
	}

}
	