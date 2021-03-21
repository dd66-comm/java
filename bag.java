package bag;

import java.util.Scanner;


public class bag {
    public static void main(String[] args) {
    	int choose=menu();
    	while(choose!=5) {
    		switch(choose) {
    		case 1: EnterStudentResults();break;
    		case 2:ClassAverage();break;
    		case 3:HighestGrade();break;
    		case 4:LowestGrade();break;
    		default:System.out.println("无效的选择");
    		}
    	choose=menu();
    }
    	System.out.println("bye!");
    }
  public static int menu(){
	  int choose=0;
	  System.out.println("1.Enter Student Results");
      System.out.println("2.Class Average");
      System.out.println("3.Highest Grade");
      System.out.println("4.Lowest Grade");
      System.out.println("Exit");
      System.out.println("请输入(1-5):");
      
      Scanner scan=new Scanner(System.in);
      choose=scan.nextInt();
      return choose;
      

  }
  public static void EnterStudentResults() {
	  System.out.println("select 1:");
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  for(int i=1;i<=n;i++) {
	int  result=scan.nextInt();
	  while(result<0||result>100) {
		  System.out.println("please re-entry :");
		  result=scan.nextInt();
	  }
	  }
  }
 
 public static void ClassAverage() {
	 System.out.println("select 2:");
	int sum=0;
	int n;
	System.out.println("请输入n个学生成绩：");
	 Scanner scan=new Scanner(System.in);
	 n=scan.nextInt();
	 for(int i=1;i<=n;i++) {
	 Scanner scan1=new Scanner(System.in);
	 int  result=scan.nextInt(); 
     sum=sum+result;
	 }
	 System.out.println("class Average is:"+sum/n);
	 }


 public static void  HighestGrade() {
	 System.out.println("select 3:");
	 int a[]= {};
	 Scanner scan=new Scanner(System.in);
	int  n=scan.nextInt();
	 int Highest=a[0];
	 for(int i=1;i<=n;i++) {
		 if(Highest<a[i]) {
			 Highest=a[i];
		 }
	 }
	 System.out.println("The HghestGrade is:"+Highest);
 }
public static void LowestGrade() {
	System.out.println("select 4:");
	 int a[]= {};
	 Scanner scan=new Scanner(System.in);
	int  n=scan.nextInt();
	 int Lowest=a[0];
	 for(int i=1;i<=n;i++) {
		 if(Lowest>a[i]) {
			 Lowest=a[i];
		 }
	 }
	 System.out.println("The LowestGrade is:"+Lowest);
}



}
