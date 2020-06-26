
package _01_else_if._1_robot_color_chooser;
import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rab = new Robot();
		rab.setSpeed(100);
		rab.penDown();
		rab.setPenWidth(10);
		for (int l = 10; l > 0; l++) {
		String colreo = JOptionPane.showInputDialog("What color do you want? (red, blue, or green)");
		if (colreo.equalsIgnoreCase("red")) {
			rab.setPenColor(255, 0, 0);
		}
		else if (colreo.equalsIgnoreCase("green")) {
			rab.setPenColor(0, 255, 0);
		}
		else {
			rab.setPenColor(0, 0, 255);
		}
		for (int i = 0; i < 7; i++) {
		rab.move(100);
		rab.turn(60);
		}}
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
