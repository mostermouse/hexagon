package jojeongin;

public class Bankaccount {
	// data, data ó�� ���
	public String bankname = "";
	public String name = "";
	public String account = "";
	private int basesalary = 0; //�⺻ �޿�
	private int salary = 0; // �� �޿�
	public String desc = ""; //��� : �� �� ������ 
	
	//instance  ���� �� ��� ���� ���ΰ�
	//������
	// �̸�, ����, ���
	// �̸�, ����
	public Bankaccount(String name, String bankname, String account, String desc) {
		this.name = name;
		this.bankname = bankname; 
		 this.account = account;
		 this.desc = desc;
		 
	}
	public Bankaccount(String name, String bankname, String account) {
		this.name = name;
		this.bankname = bankname;
		this.account = account;
	}
	
	//getter, setter
	
	//�⺻ �޿� setBaseSalary(int baseSalary)
	//�� �޿� setter
	
	public void monthSalary(int month , String level ) {
		if(level.equals("�λ���") || level.equals("����")) {
		
		int total = this.basesalary + month; // �̴��� �޿�
		this.salary = total;
		System.out.println("�����Ϸ�");
		}
		else {
			System.out.println("error");
		}
	}
	public void salaryInfo(String name, Person pio) {
		if(name.equals(pio.getName())) {
			System.out.println("�̴��� �޿� :"  + this.salary);	
		}
		else {
			System.out.println("error");
		}
	}
	
	
	//�̴��� �޿� ���� ���
	public Bankaccount(int basesalary, int salary) {
		this.basesalary = basesalary;
		this.salary = salary;
		}
	
	public void salaryInfo() {
		System.out.println("basesalary = " + basesalary + ", salary = " + salary);	
	}
	
	//getter
	
		public String getName() {
			return this.name;
		}
	
		public String getBankame() {
			return this.bankname;
		}
		public String getAccount() {
			return this.account;
		}
		public String getDesc() {
			return this.desc;
		}
		public int getBasesalary() {
			return this.basesalary;
		}
		public int getSalary() {
			return this.salary;
		}
		
		
		
		//setter
		public void setName(String name) {
			this.name = name;
		}
		
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		
		public void setAccount(String account) {
			this.account = account;
		}
		
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		public void setBasesalary(int basesalary) {
			this.basesalary = basesalary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
		}	
			
		
	//���� ���� ����
	public void bankaccountInfo() {
		System.out.println("name : " + name + ", account : " + account);
	}
}