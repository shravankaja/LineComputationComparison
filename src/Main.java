
public class Main {

	private final double POINT_X1;
	private final double POINT_Y1;
	private final double POINT_X2;
	private final double POINT_Y2;
	public double result_Line_Lenght;

	public Main(double p_x1, double p_y1, double p_x2, double p_y2) {
		this.POINT_X1 = p_x1;
		this.POINT_Y1 = p_y1;
		this.POINT_X2 = p_x2;
		this.POINT_Y2 = p_y2;
	}

	double computeLine() {
		double temp1 = POINT_X1 - POINT_X2;
		double temp2 = POINT_Y2 - POINT_Y1;

		double Power = Math.pow(temp1, 2) + Math.pow(temp2, 2);
		result_Line_Lenght = Math.sqrt(Power);
		System.out.println("Lenght of the line  based on the coordinates is : " + result_Line_Lenght);
		return result_Line_Lenght;
	}

	static void compareTo(double len_Line1, double len_Line2) {
		if (len_Line1 > len_Line2) {
			System.out.println("Line1 is greater than Line2");
		} else if (len_Line1 == len_Line2) {
			System.out.println("Lines are equal");
		} else {
			System.out.println("Line 2 is grater than Line1");
		}
	}

}
