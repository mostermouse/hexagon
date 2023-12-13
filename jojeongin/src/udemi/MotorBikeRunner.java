package udemi;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(150);
		honda.setSpeed(100);
		honda.increaseSpeed(100);
		honda.decreaseSpeed(150);
		
		/*int ducatiSpeed = ducati.getSpeed();//get speed
		ducatiSpeed = ducatiSpeed + 100;//increase it by 100
		ducati.setSpeed(ducatiSpeed);//set it to ducati
		
		int hondaSpeed = honda.getSpeed();//get speed
		hondaSpeed = hondaSpeed + 100;//increase it by 100
		honda.setSpeed(hondaSpeed);//set it to honda
		*/
		System.out.println("ducati speed = " + ducati.getSpeed());
		System.out.println("honda speed = " + honda.getSpeed());
		
	}

}
