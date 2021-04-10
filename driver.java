package student;

import java.util.Scanner;

public class driver {
public static void main(String[] args) {
	
	int choice=menu();
	while(choice!=3)
	{
		switch(choice) {
		case 1:CreateAttendenceList();break;
		case 2: PrintAttendenceList ();break;
		default:System.out.println("invalid choose");
		}
		choice=menu();
	}
}
	
public static int menu() {
	
	int choice=0;
	System.out.println("1.Create Attendence List");
	System.out.println("2.Print Attendence List");
	System.out.println("3.Exit");
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入选择：");
	choice=scan.nextInt();
	return choice;
}
	
	
	

public static void CreateAttendenceList( ) {
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入学期：");
	
 int	semester1=scan.nextInt();
System.out.println("请输入年份：");	
 int year=scan.nextInt();
 System.out.println("请输入学科信息：");
   subject subj=new subject();
   String subjectID=scan.nextLine();
   String subjectname=scan.nextLine();
   System.out.println("请输入学生1信息：");
   
   String studentID=scan.nextLine();
   String firstname=scan.nextLine();
   String lastname=scan.nextLine();
   
   student stu1=new student(studentID,firstname,lastname);
   stu1.getStudentID();
   stu1.getFirstName();
   stu1.getLastName();
   System.out.println("请输入学生2信息：");
  
   String studentID2=scan.nextLine();
   String firstname2=scan.nextLine();
   String lastname2=scan.nextLine();
   student stu2=new student(studentID,firstname,lastname);
   stu2.getStudentID();
   stu2.getFirstName();
   stu2.getLastName();
	
	
	
	
	
		
	}

public  static void PrintAttendenceList() {
	
	ClassList clst1=new ClassList();
	clst1.getSemester();
	clst1.getSubj();
	clst1.getYear();
	clst1.getS1();
	clst1.getS2();
	
	
	
	ClassList clst2=new ClassList();
	clst2.getSemester();
	clst2.getSubj();
	clst2.getYear();
	clst2.getS1();
	clst2.getS2();
	
	System.out.println(clst1.toString());
	System.out.println(clst2.toString());
}
}


