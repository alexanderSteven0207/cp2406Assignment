import java.awt.Color;
import java.awt.Graphics;

// Car --> Moderate
// all aspects in the middle of bike and car

public class Car extends Vehicle{

	public Car(int x, int y) {
		super(x, y);
		width=30;
		height=10;
		speed=15;
	}

	//bike -> pink
	//bus -> blue
	//car -> green

	public void paintMe(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}
	public void setRate(int r) {
		this.speed=r;
	}
	

}
