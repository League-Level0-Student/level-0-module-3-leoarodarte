package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot rob=new Robot();
	rob.penDown();
	rob.setSpeed(5);
	rob.setPenWidth(10);
	rob.setPenColor(109, 70, 19);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
}
}
