package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob=new Robot();
	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(5);
		rob.setPenWidth(10);
		rob.hide();
		String s = JOptionPane.showInputDialog("What do you want me to draw? Square, triangle, or a circle.");
		String c = JOptionPane.showInputDialog("Waht color do you want? Red, Green, Yellow or Blue.");
		if(c.equals("Red.")) {
			rob.setPenColor(224, 13, 13);
		}
		if(c.equals("Blue.")) {
			rob.setPenColor(13,13,224);
		}
		if(c.equals("Yellow.")) {
			rob.setPenColor(255, 229, 0);
		
		}
		if(c.equals("Green.")) {
			rob.setPenColor(13,224,13);
		}
		if(s.equals("Square.")) {
			drawSquare();
		}
		else if(s.equals("Triangle.")) {
			drawTriangle();
		}
		else if(s.equals("Circle.")) {
			drawCircle();
		}

		}
	
public static void drawSquare() {
	
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	
}
public static void drawTriangle() {
	rob.turn(-90);
rob.move(300);
rob.turn(120);
rob.move(300);
rob.turn(120);
rob.move(300);
}
public static void drawCircle() {
	for(int i=0; i<360; i++) {
		rob.move(2);
		rob.turn(1);
	}
}
}
