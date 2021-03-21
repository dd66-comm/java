package guess;

import java.util.Scanner;

public class gue{
private static Object fancy;

public  static  void  main(String[] args) {
	int length,width;
    String  type;
    String colour;
    int number;
	float money = 0;
	float money1;
	System.out.println("the length and the width is:");
	Scanner scan=new Scanner(System.in);
	length=scan. nextInt();
	width=scan.nextInt();
	 
	System.out.println("The type of the frame:");
   type=scan.next();
   boolean regular = true;
if(regular) {
   money=(float) ((0.1+0.15)*(length+width)*2);
   }else {
	   money=(float)((0.1+0.25)*(length+width)*2);
   }
   System.out.println("The money is:"+money);
   
	System.out.println("Customer's choice of colour to colour the frame");
	colour=scan.next();
	
    System.out.println("If the user wants to put the crowns,then the number of crowns:");
    number=scan.nextInt();
    money1=(float) (money+0.35*number);
    System.out.println("The money1  is:"+money1);
    }
}



