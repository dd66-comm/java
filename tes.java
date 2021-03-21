package test;

import java.util.Scanner;

public class tes {
 public static void main(String[] args) {
	 
   String again;
	do { 
		
     int randomnumber;
	 randomnumber=(int)(Math.random()*1000);
	 int myguess;
	 boolean success=false;
	 int times=0;
	 int i;
	 System.out.println(randomnumber);
	 System.out.println("I have a number between 1 to 1000.");
	 System.out.println("Can you guess mynumber?");
	 System.out.println("please type your first guess:");
	
		
		
	 for( i=1;i<=10;i++) {
		 
		 Scanner scan=new Scanner(System.in);
		 myguess=scan.nextInt();
		 times=i;
		if(myguess==randomnumber) {
			System.out.println("Excellent! you are right");
			success=true;
			break;
		}
		
		else { if(myguess>randomnumber){
			System.out.println("Too big! try again.");
		}else {
			System.out.println("Too small! try again.");
		}
        
		}System.out.println("please type your guess again:");
		}
	 if(success) {
	 System.out.println("π≤ ‰»Îtime¥Œ£∫"+times);
	 }
	 else {
		 System.out.println("sorry,you fail!");
	 }
	 System.out.println("Would you like to play again(y or n)?");
	 Scanner scan1=new Scanner(System.in);
	 again=scan1.next();
	 }
     while (again.equalsIgnoreCase("y"));
      System.out.println("game over,welcome to play again!");
	 
 }
}


