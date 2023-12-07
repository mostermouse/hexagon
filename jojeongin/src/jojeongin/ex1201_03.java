package jojeongin;

import java.util.Scanner;




public class ex1201_03 {

	     public static void main(String[] args) {
	    	 Person firstP = new Person("조정인", 26);
	    	 Person secondP = new Person("유건표", 26);
	    	 Person thirdP = new Person("최가람", 26, "P20231207");
	    	 
	    	 Bankaccount firstPaccount = new Bankaccount("유건표", "신한은행", "110-444-739027", "천재");
	    	 Bankaccount secondPaccount = new Bankaccount("조정인", "카카오뱅크", "33333-000-0000");
	    	 Bankaccount thirdPaccount = new Bankaccount("최가람", "우리은행", "10-484-6423");
	     
	      Scanner sc = new Scanner(System.in);
	      System.out.println("이름을 입력하시오 :");
	      String myname = sc.nextLine();
	      System.out.println("직급을 입력하시오 :");
	      String mylevel = sc.nextLine();
	      
	      System.out.println("이름 : " + myname + "직금 :" + mylevel);
	   
	        firstPaccount.monthSalary(1, mylevel);
	      firstPaccount.salaryInfo(myname, firstP);
	        
	     }
	}

