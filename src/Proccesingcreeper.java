
public class Proccesingcreeper {

	public Proccesingcreeper() {
		// TODO Auto-generated constructor stub
	}

	int x = 540;

	int y = 9;
	PImage creeper;
	PImage minecraft;

	boolean isNear(int a, int b) {
		if (abs(a - b) < 10)
			return true;
		else
			return false;
	}

	void draw() {
		background(minecraft);
		image(creeper, x, y);
		// println(X+" "+ mouseY);
		fill(255, 0, 0);

		if (mouseX < 10 && mouseY < 10) {
			fill(0, 255, 0);
		}

		if (isNear(x, mouseX) && isNear(y, mouseY)) {
			fill(0, 255, 0);
			text("You found the creeper!!!!!", 225, 352);
			x = (int) random(width);
		}
		ellipse(mouseX, mouseY, 15, 15);
	}

	void setup() {
		size(550, 550);
		minecraft = loadImage("forest.jpg");
		minecraft.resize(width, height);
		creeper = loadImage("Creeper.png");
		creeper.resize(10, 10);
	}

}
