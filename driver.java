package week8;

import java.util.Scanner;

public class driver {
  public static void main(String args[]) {
	 int choice=menu();
     while(choice!=8){
    	 switch(choice) {
    	 case 1: create();break;
    	 case 2: save();break;
    	 
    	 }
     
     }
  }
  public static int menu() {
	 int  choice=0;
	 System.out.println("欢迎使用银行系统");
	 System.out.println("1.开户create");
	 System.out.println("2.存款save");
	 System.out.println("3.取款withdraw");
	 System.out.println("4.消费comsume");
	 System.out.println("5.还款repay");
	 System.out.println("6.银行结算settle");
	 System.out.println("7.查询余额balance");
	 System.out.println("8.退出exit");
	 System.out.println("请选择（1-8）：");
	 Scanner scan=new Scanner(System.in);
	 choice=scan.nextInt();
	 return choice;
	  
  }
  
  
  public static void create() {
	 int choice1=submenu();
	 switch(choice1) {
	 
	 case 1:checkingAccount();break;
	 case 2:savingAccount();break;
	 case 3:System.out.println("返回主菜单");int choice= menu();
	 
	 
	 }
	 
  }
  public static void save() {
	  System.out.println("输入存款金额money·：");
	  Scanner scan=new Scanner(System.in);
	  int money=scan.nextInt();
  }

public static int submenu() {
	int choice1=0;
	System.out.println("1.信用卡checkingAccount");
	System.out.println("2存储卡savingAccount");
	System.out.println("请选择：（1-3）：");
	Scanner scan=new Scanner(System.in);
	choice1=scan.nextInt();
	return choice1;
}

public static void checkingAccount() {
	System.out.println("请输入");
	Scanner scan=new Scanner(System.in);
	String ssn=scan.nextLine();
	String name=scan.nextLine();
	String accountnum=scan.nextLine();
	double servicecharge=scan.nextDouble();
	CheckingAccount ch1=new CheckingAccount(accountnum, 0);
	ch1.setAccountNum(accountnum);
	ch1.setBalance(1000);
	ch1.setServiceCharge(500);
	
	System.out.println("开卡成功！");
	System.out.println(ch1.toString());
	
	
	
	
	
}






public static void savingAccount() {
	System.out.println("请输入");
	Scanner scan=new Scanner(System.in);
	String ssn=scan.nextLine();
	String name=scan.nextLine();
	String accountnum=scan.nextLine();
	double interestRate=scan.nextDouble();
	SavingsAccount s1=new SavingsAccount(accountnum, 0, 0);
	s1.setAccountNum(accountnum);
	s1.setBalance(900);
	s1.setInterestRate(interestRate);
	System.out.println("开卡成功！");
	System.out.println(s1.toString());
	
	
}
}