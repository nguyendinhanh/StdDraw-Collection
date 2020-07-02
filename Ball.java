
public class Ball {
	private double x;
	private double y;
	private double radius;
	private double xVelocity;
	private double yVelocity;
	
	public Ball(double x, double y, double radius, double xVelocity, double yVelocity) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
	}
	
	public void update(double time) {		
		x += xVelocity*time;
		y += yVelocity*time;
		
		if( x < 0.0 || x > 1.0 )
			xVelocity *= -1;
		
		if( y < 0.0 || y > 1.0 )
			yVelocity *= -1;
	}
	
	public void draw() {
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(x, y, radius);		
	}
}
