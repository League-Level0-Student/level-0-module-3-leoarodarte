//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob=new Robot();
		for(int i=0; i<1000; i++) {
		//3. Ask the user what color they would like the robot to draw
		String h= JOptionPane.showInputDialog("Which color do you want? Red, blue, green, purple-ish color or pink?");
		//5. Use an if/else statement to set the pen color that the user requested
if(h.equals("Red.")) {
rob.setPenColor(Color.RED);
}
else if(h.equals("Blue.")) {
	rob.setPenColor(Color.BLUE);
}
else if(h.equals("Pink.")) {
	rob.setPenColor(Color.PINK);
}
else if(h.equals("Purple-ish color.")) {
	rob.setPenColor(Color.MAGENTA);
}
else if(h.equals("Green.")) {
	rob.setPenColor(Color.GREEN);
}else {
	rob.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(40);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(5);
rob.move(200);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(200);
	}
}
}
