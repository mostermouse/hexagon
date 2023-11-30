package jojeongin;

class Car {
    int speed = 0;

    public void setSpeed(int speed_change) {
        this.speed += speed_change;
        System.out.println(this.speed);
    }
}

class Sonata extends Car {
    final int MAX_SPEED = 150;

    public int setSpeed(int speed) {
        this.speed += speed;

        if (this.speed > MAX_SPEED) {
            this.speed = MAX_SPEED;
        }

        return this.speed;
    }
}
public class ex1130 {

	public static void main(String[] args) {
	      Car car = new Car();
			car.setSpeed(30);

	        Sonata sonata = new Sonata();
			sonata.setSpeed(180);
	    }
	}