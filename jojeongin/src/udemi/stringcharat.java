package udemi;

public class stringcharat {

	public static void main(String[] args) {
		String someString = "This is a lot of text again";
		String some = "This is a lot of text again";
		for(int i = 0; i < someString.length(); i++) {
		System.out.print(someString.charAt(i)); //�ش� �ڸ��� �ִ� �� ��
		}
		System.out.println("");
		System.out.println(someString.indexOf("lot")); //��� ° �ڸ��� �ִ��� ��
		System.out.println(someString.startsWith("This") ); //���� �� ���ڰ� �ִ��� Ȯ
		System.out.println(someString.endsWith("in") ); //���� �ִ°� ���� 
		System.out.println(someString.isEmpty()); //����� Ȯ��
		System.out.println(someString.equals(some)); //���� �� ��
		
	}
	

}
