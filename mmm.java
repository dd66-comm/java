package shouyingxitong;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class mmm {
    public static void main(String[] args) {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("������������Ϣ���Դ�Ϊ��Ʒ���ƣ���Ʒ���ۣ�����������֮�䣬�ָ�");
    	 
    	 String aLine =scan.nextLine();
    	 int seq=0;
    	 while(!aLine.equals("0000")){
    	 String arr[]=aLine.split(",|��");
    	 String name=arr[0];
    	 float price=Float.parseFloat(arr[1]);
    	 int number=Integer.parseInt(arr[2]);
    	 float totalMoney=price*number;
    	 String sno=generateSno(String.valueOf(seq));   	 
    	 product product=new product(sno,name,price,number,totalMoney);
    	 
    	 System.out.println("��ˮ��\t��Ʒ����\t����\t��Ʒ����\t�ܼ�");
    	 
    	 System.out.println(sno+product.toString());
    	    
    	 aLine=scan.nextLine();

    	 
    	 }
    }
    
    public static String generateSno(String initNo) {
    	String sno="";
    	//1. ��ȡ��ˮ�ŵ�ǰ׺yyyyMMdd
    	SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
    	String prefic=df.format(new Date());
    	String newNo=String.valueOf(Integer.parseInt("0000")+1);
    	sno=prefic+newNo;
    	return sno;
    }
   
}

	

