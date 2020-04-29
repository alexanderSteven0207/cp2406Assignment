import java.awt.Color;
import java.awt.Graphics;

//Bike --> Smallest size, fastest speed

public class Bike extends Vehicle{

	public Bike(int x, int y) {
		super(x, y);
		width=15;
		height=10;
		speed=20;
	}

	//Bike -> pink
	//Bus -> blue
	//car -> greeen

	public void paintMe(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(x, y, width, height);
	}
	

}
