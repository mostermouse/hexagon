package udemi;

public class MotorBike {
	//state
	private int speed; //��� variable
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void increaseSpeed(int howMuch) { //�ܼ� ���� ������ ĸ��ȭ�� �Ѿ� 2�ܰ� ĸ��ȭ�� 
		this.speed = this.speed + howMuch;   //��ü�� ���� �� �ִ� �پ��� ������ ���
	}
	public void decreaseSpeed(int howMuch) { //�ܼ� ���� ������ ĸ��ȭ�� �Ѿ� 2�ܰ� ĸ��ȭ��
		this.speed = this.speed - howMuch;    //��ü�� ���� �� �ִ� �پ��� ������ ���
	}
	void start() {
		System.out.println("start");
	}
}
