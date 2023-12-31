package udemi;

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		for(int i = 0; i <arr.length; i++) {
			System.out.print(i+1 + "番目　定数入力 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j <arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("整列された結果　：　");
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
