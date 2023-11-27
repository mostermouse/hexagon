package jojeongin;

public class ex1 {

	public static void main(String[] args) {
		 int number = 28;
		 int sum = 0;
		 //28 - 1,2,4,7,14
		 if(number <= 0)
			 System.out.println(false);
		 for(int i = 1; i < number; i++) {
			 if(number % i ==0)
			 {
				 sum += i;
			 }

		 }
		 System.out.println(sum);
		}
	}
		

	}

}
