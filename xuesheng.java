package lll;

import java.util.Scanner;


public class xuesheng {
	public static void main(String[] args){
	System.out.println("��һ��������ѧ��������Ϣ����ʽ���£�ѧ�ţ��������������ڣ��Ա�");
	Scanner scan=new Scanner(System.in);
	String data=scan.next();
	String array[]=data.split(",");
	String id=array[0];
	String name=array[1];
	String gender=array[3];
	String birth=array[2];
	
	student stu=new student(id,name,birth,gender);
	System.out.println(stu.toString());
	
	
	System.out.println(data.indexOf(name));
}
}
