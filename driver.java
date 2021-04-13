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

public static int submenu() {
	int choice=menu();
	System.out.println("创建");
	System.out.println("退出重新选择");
	return choice;
	
	
}
	
public static void create() {
	System.out.println("创建成功");
}
public static void bye() {
System.out.println("重新选择：");
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
   subj.setSubjectID(subjectID);
   subj.setSubjectName(subjectname);
   System.out.println("请输入学生1信息：");
   
   String studentID=scan.nextLine();
   String firstname=scan.nextLine();
   String lastname=scan.nextLine();
   
   student stu1=new student(studentID,firstname,lastname);
   stu1.setStudentID(studentID);
   stu1.setFirstName(firstname);
   stu1.setLastName(lastname);
   System.out.println("请输入学生2信息：");
  
   String studentID2=scan.nextLine();
   String firstname2=scan.nextLine();
   String lastname2=scan.nextLine();
   student stu2=new student(studentID,firstname,lastname);
   stu2.setStudentID(studentID2);
   stu2.setFirstName(firstname);
   stu2.setLastName(lastname);
	
	System.out.println("学科："+subjectID+subjectname+"学生1信息"+stu1.getStudentID()+stu1.getFirstName()+stu1.getLastName());
	
	System.out.println("学科："+subjectID+subjectname+"学生2信息"+stu2.getStudentID()+stu2.getFirstName()+stu2.getLastName());
	
	
	
		
	}

public  static void PrintAttendenceList() {
	Scanner scan=new Scanner(System.in);
	 String studentID=scan.nextLine();
	   String firstname=scan.nextLine();
	   String lastname=scan.nextLine();
	   
	 student stu1=new student(studentID,firstname,lastname);
	   stu1.setStudentID(studentID);
	   stu1.setFirstName(firstname);
	   stu1.setLastName(lastname);
	
	ClassList clst1=new ClassList();
	clst1.getSemester();
	clst1.getSubj();
	clst1.getYear();
	clst1.setS1(stu1);
	clst1.getS2();
	subject subj=new subject();
	subj.getSubjectID();
	subj.getSubjectName();
	
	ClassList clst2=new ClassList();
	clst2.getSemester();
	clst2.getSubj();
	clst2.setYear(2);
	clst2.getS2();
	student s1=new student();
	 s1.setFirstName("欢");
	 s1.setLastName("刘");
	 s1.setStudentID("01");
	 student s2=new student();
	 s2.setFirstName("琳");
	 s2.setLastName("王");
	 s2.setStudentID("02");
	
	System.out.println("clist1:学期："+clst1.getSemester()+"年份："+clst1.getYear()+",学生1信息："+clst1.getS1()+",学科信息"+subj.getSubjectID()+subj.getSubjectName());
	System.out.println("clst2:学期："+clst2.getSemester()+"年份："+clst2.getYear()+",学生1信息："+s1+",学生2信息："+s2+"学科信息:"+subj.getSubjectID()+subj.getSubjectName());
}
}


