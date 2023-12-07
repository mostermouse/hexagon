package jojeongin;

public class Person {
    // �̸�
	   // ����
	   // ����
	   // ��å�ּ�
	   // desc
	   // ��� �ִ� ��
	   // �̸� ���̸�
	   // �̸� �����ּ� desc��
	   //method ���� ���� ���
	
	   //������
	 
	
	public String name = "";
	public int age = 0;
	public int sex = 1;
	public String address = "";
	public String desc = "";
	private String p_num = ""; 
	
	public Person(String name, int age, int sex, String address, String desc ) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.desc = desc;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, String address, String desc) {
		this.name = name;
		this.address = address;
		this.desc = desc;	
	}
	
	public Person(String name, int age, String p_num ) {
		this.name = name;
		this.age = age;
		this.p_num = p_num;
	}
	 
	
	
	//getter
	
	public String getP_num() {
		return this.p_num;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
		
	}
	
	public int getSex() {
		return this.sex;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getDesc() {
		return this.desc;
	}
 
	
	//setter
	
	public void setP_num(String p_num) {
		this.p_num = p_num;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public void setSex(int sex) {
		this.sex = sex;
		
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
		
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}

	//���� ���� ���
	public void personInfo() {
		System.out.println("name = " + getName() + ", age = " + getAge() + ", sex = " + getSex() + ", address =" + getAddress() + ", desc = " + getDesc() + ", p_num = " + getP_num());
		
	}
}