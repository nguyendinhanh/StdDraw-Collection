
public class Box {

	public static void main(String[] args) 
	{
		for ( int i = 0; i < 900; ++i )
		{
			double x = Math.random();
			double y = Math.random();
			double radius = Math.random()*(0.75 - .05)+.05;
			StdDraw.circle(x, y, radius);
		}

	}

}
