package udemi;

public class MotorBike {
	//state
	private int speed; //멤버 variable
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void increaseSpeed(int howMuch) { //단순 게터 세터의 캡슐화를 넘어 2단계 캡슐화로 
		this.speed = this.speed + howMuch;   //객체에 행할 수 있는 다양한 연산을 고안
	}
	public void decreaseSpeed(int howMuch) { //단순 게터 세터의 캡슐화를 넘어 2단계 캡슐화로
		this.speed = this.speed - howMuch;    //객체에 행할 수 있는 다양한 연산을 고안
	}
	void start() {
		System.out.println("start");
	}
}
