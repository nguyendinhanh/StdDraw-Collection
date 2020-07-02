import java.awt.Color;
public class Star {

	public static void main(String[] args) 
	{
		for ( int i = 0; i < 100; ++i ) {
			double x = Math.random();
			double y = Math.random();
			double scale = Math
		}

	}
	
	public static void drawStar(double scale, double x, double y, color color)
	{
		double[] xValues = new double[5];
		double[] yValues = new double[5];
		
		xValues[0] = x;
		yValues[0] = y;
		
		xValues[1] = x + scale*Math.sin(Math.toRadians(18));
		yValues[1] = y - scale*Math.cos(Math.toRadians(18));
		
		xValues[2] = x - 0.5*scale;
		yValues[2] = y - 0.5*scale *Math.tan(Math.toRadians());
		
		xValues[3] = x + 0.5*scale;
		yValues[3] = y - 0.5*scale*Math.tan(Math.toRadians(angdeg))
				
		StdDraw.filledPolygon(,);
		
	}
}
