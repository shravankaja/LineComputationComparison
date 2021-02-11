
public class Main {
	
	
	private final float POINT_X1;
	private final float POINT_Y1;
	private final float POINT_X2;
	private final float POINT_Y2;
	private final float POINT_X12;
	private final float POINT_Y12;
	private final float POINT_X22;
	private final float POINT_Y22;
	public double resultLineOne;
	public  double resultLineTwo;
	

	public Main(float p_x1, float p_y1, float p_x2, float p_y2, float p_x12, float p_y12, float p_x22, float p_y22)
			{
				this.POINT_X1 = p_x1;
				this.POINT_Y1 = p_y1;
				this.POINT_X2 = p_x2;
				this.POINT_Y2 = p_y2;
				this.POINT_X12 = p_x12;
				this.POINT_Y12 = p_y12;
				this.POINT_X22 = p_x22;
				this.POINT_Y22 = p_y22;
			}
	
	

	void computeLine()
				{
					float temp1 =  POINT_X1 - POINT_X2;
					float temp2 =  POINT_Y2 - POINT_Y1;
					float temp3 =  POINT_X22 - POINT_X12;
					float temp4 =  POINT_Y22 - POINT_Y12;
			
					double Power = Math.pow(temp1, 2) + Math.pow(temp2, 2);
					resultLineOne = Math.sqrt(Power);
					System.out.println("Lenght of the line  based on the coordinates is : "+resultLineOne);
					double Power1 = Math.pow(temp3, 2) + Math.pow(temp4, 2);
					resultLineTwo = Math.sqrt(Power1);
					System.out.println("Lenght of the line  based on the coordinates is : "+resultLineTwo);
				}
	 
	void equalsTo() 
	 			{
					if(this.resultLineOne == this.resultLineTwo)
							{
								System.out.println("Lines are equal");
							}
					else 
							{
								System.out.println("Lines are not equal");
							}
	 			}
	void compareTo()
				{
					if (this.resultLineOne>this.resultLineTwo)
							{
								System.out.println("Line1 is greater than Line2");
							}
					else if (resultLineOne<resultLineTwo)
							{
								System.out.println("Line2 is greater than Line1");
							}
	
				}
	
	
}
