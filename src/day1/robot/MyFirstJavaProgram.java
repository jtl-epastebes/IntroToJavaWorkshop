package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Dust=new Robot();
Dust.setSpeed(200);
Dust.setPenColor(0,0,255);
Dust.penDown();
for (int i = 0; i < 4; i++) {
	Dust.move(300);
Dust.turn(90);
Dust.move(300);		
Dust.turn(90);
Dust.move(300);
Dust.turn(90);
Dust.move(300);
}
;               


}
}