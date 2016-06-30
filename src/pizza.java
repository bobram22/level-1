import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class pizza {
public static void main(String[] args) {
	Tortoise.penDown();
	Tortoise.setSpeed(10);
	Tortoise.setPenWidth(5);
	Tortoise.setPenColor(Color.green);
	Tortoise.setX(0);
	Tortoise.setY(430);
Tortoise.setAngle(90);
	Tortoise.move(800);
	Tortoise.setAngle(270);
	Tortoise.move(750);
	House("small");
	House("medium");
	House("medium");
	House("large");
	House("small");
	House("large");
	House("small");
	House("large");
	House("medium");
	House("small");
}

private static void House(String dino) {
	int rrr = new Random().nextInt(10);
			if(rrr == 1){
				Tortoise.setPenColor(Color.BLUE);
			}
			if(rrr == 2){
				Tortoise.setPenColor(Color.GREEN);
			}
			if(rrr == 3){
				Tortoise.setPenColor(Color.MAGENTA);
			}
			if(rrr == 4){
				Tortoise.setPenColor(Color.ORANGE);
			}
			if(rrr == 5){
				Tortoise.setPenColor(Color.PINK);
			}
			if(rrr == 6){
				Tortoise.setPenColor(Color.RED);
			}
			if(rrr == 7){
				Tortoise.setPenColor(Color.YELLOW);
			}
			if(rrr == 8){
				Tortoise.setPenColor(Color.BLACK);
			}
			if(rrr == 9){
				Tortoise.setPenColor(Color.CYAN);
			}
			if(rrr == 10){
				Tortoise.setPenColor(Color.GRAY);
			}
	int pigs = 0;
	if (dino .equals("small")){
		pigs = 80;
	}
	if (dino .equals("medium")){
		pigs = 120;
	}
	if (dino .equals("large")){
		pigs = 250;
	}
	Tortoise.penDown();
	Tortoise.setAngle(0);
	Tortoise.move(pigs);
	Tortoise.setAngle(45);
	Tortoise.move(20);
	Tortoise.setAngle(135);
	Tortoise.move(20);
	Tortoise.setAngle(180);
Tortoise.move(pigs);
Tortoise.setAngle(90);
Tortoise.penUp();
Tortoise.move(20);
}
}
