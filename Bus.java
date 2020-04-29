import java.awt.Color;
import java.awt.Graphics;

//Bus --> Biggest size, slowest speed

public class Bus extends Vehicle{

	public Bus(int x, int y) {
		super(x, y);
		width=45;
		height=10;
		speed=7;
	}

	//Bike --> Pinnnk
	//Bus --> bluee
	//Car --> green

	public void paintMe(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}

}
