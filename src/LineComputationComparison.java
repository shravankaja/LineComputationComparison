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
	}

}
	