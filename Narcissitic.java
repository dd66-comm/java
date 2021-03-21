import java.util.Scanner;


public class Narcissitic {
   public static void main(String[] args) {
	  System.out.println("ÇëÊäÈëÎ»Êı(3-7)");
	 Scanner scan =new Scanner(System.in);
	 int weishu=scan.nextInt();
	 
	 for(int number=(int)Math.pow(10, weishu-1);
	 number<(int)Math.pow(10, weishu)-1;number++) {
	             int wei;
				 int newNumber=number;
				 int sum=0;
				 while(newNumber!=0) {
					 wei=newNumber%10;
					 sum=sum+(int)Math.pow(wei, weishu);
					 newNumber=newNumber/10;
					 
						if(sum==number) {
				    		 System.out.println(number);
				    	 }
				    	 
				 }
			 }
    	 
	
    	 
   }
}

