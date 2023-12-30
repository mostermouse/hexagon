package udemi;

public class stringcharat {

	public static void main(String[] args) {
		String someString = "This is a lot of text again";
		String some = "This is a lot of text again";
		for(int i = 0; i < someString.length(); i++) {
		System.out.print(someString.charAt(i)); //해당 자리에 있는 거 출
		}
		System.out.println("");
		System.out.println(someString.indexOf("lot")); //몇번 째 자리에 있는지 출
		System.out.println(someString.startsWith("This") ); //시작 그 문자가 있는지 확
		System.out.println(someString.endsWith("in") ); //끝에 있는거 부터 
		System.out.println(someString.isEmpty()); //빈공간 확인
		System.out.println(someString.equals(some)); //안의 값 비교
		
	}
	

}
