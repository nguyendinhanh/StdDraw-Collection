import java.util.Scanner;
public class exam2testing {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner ( System.in);

		double r;
		for ( int i = 100 ; i >= 1 ; i-- )
		{
			r = 0.5 * i + 0.5;
			StdDraw.circle ( 0.5, 0.5, r );
			//StdDraw.square ( 0.5, 0.5, r  * (Math.sqrt(2) / 2 ) );
		}
	}
}
