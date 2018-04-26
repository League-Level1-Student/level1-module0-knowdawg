import org.jointheleague.graphical.robot.Robot;

public class houses {

public static void main(String[] args) {
	
	
	
	Robot meep = new Robot();
	meep.setSpeed(1);
	meep.miniaturize();
	meep.penDown();
	
	meep.move(50);
	meep.turn(45);
	meep.move(25);
	meep.turn(90);
	meep.move(25);
	meep.turn(45);
	meep.move(50);
	
	meep.turn(270);
	meep.penUp();
	meep.move(20);
	meep.penDown();
	meep.turn(270);
	
	meep.move(100);
	meep.turn(90);
	meep.move(50);
	meep.turn(90);
	meep.move(100);
	
	
	
	
}
	
	
}
