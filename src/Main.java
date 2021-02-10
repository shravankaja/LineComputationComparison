
public class Main {

	double computeLine(float x, float y, float z, float k)
	{
		float A=x-y;
		float B=z-k;
		double Power = Math.pow(A, 2) + Math.pow(B, 2);
		double resultLine1 = Math.sqrt(Power);
		System.out.println("Lenght of the line  based on the coordinates is : "+resultLine1);
		return resultLine1;
	}
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
						System.out.println("Line2 is greater than Line1");
					}
	
	}
	
	
}
