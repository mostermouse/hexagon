package udemi;
import java.util.*;
public class bubllesort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(i+1 + "番目　定数入力 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<arr.length-1; i++) {
			for(int j=0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("整列された結果 :");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		System.out.println("整列後最後の数と数の合 : " + (arr[0] + arr[arr.length]));
	sc.close();
	}

}
