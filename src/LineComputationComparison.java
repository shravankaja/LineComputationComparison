import java.util.*;
import java.lang.*;

public class LineComputationComparison {

	public static void main(String Args[]) {
		System.out.println("Welcome to Line Computation and Comparison Program");
		Main line1_Lenght = new Main(4.1,8.5,9.1,4.7);
		Main line2_Lenght = new Main(5.7,6.8,9.3,8.5);
		double lenght_Line1 = line1_Lenght.computeLine();
		double lenght_Line2 = line2_Lenght.computeLine();
		Main.compareTo(lenght_Line1, lenght_Line2);
	}

}
