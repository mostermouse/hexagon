package jojeongin;

import java.util.Scanner;




public class ex1201_03 {

	     public static void main(String[] args) {
	    	 Person firstP = new Person("������", 26);
	    	 Person secondP = new Person("����ǥ", 26);
	    	 Person thirdP = new Person("�ְ���", 26, "P20231207");
	    	 
	    	 Bankaccount firstPaccount = new Bankaccount("����ǥ", "��������", "110-444-739027", "õ��");
	    	 Bankaccount secondPaccount = new Bankaccount("������", "īī����ũ", "33333-000-0000");
	    	 Bankaccount thirdPaccount = new Bankaccount("�ְ���", "�츮����", "10-484-6423");
	     
	      Scanner sc = new Scanner(System.in);
	      System.out.println("�̸��� �Է��Ͻÿ� :");
	      String myname = sc.nextLine();
	      System.out.println("������ �Է��Ͻÿ� :");
	      String mylevel = sc.nextLine();
	      
	      System.out.println("�̸� : " + myname + "���� :" + mylevel);
	   
	        firstPaccount.monthSalary(1, mylevel);
	      firstPaccount.salaryInfo(myname, firstP);
	        
	     }
	}

