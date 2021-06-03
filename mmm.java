package shouyingxitong;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class mmm {
    public static void main(String[] args) {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("请输入销售信息，以此为商品名称，商品单价，销售数量，之间，分隔");
    	 
    	 String aLine =scan.nextLine();
    	 int seq=0;
    	 while(!aLine.equals("0000")){
    	 String arr[]=aLine.split(",|，");
    	 String name=arr[0];
    	 float price=Float.parseFloat(arr[1]);
    	 int number=Integer.parseInt(arr[2]);
    	 float totalMoney=price*number;
    	 String sno=generateSno(String.valueOf(seq));   	 
    	 product product=new product(sno,name,price,number,totalMoney);
    	 
    	 System.out.println("流水号\t商品名称\t单价\t商品数量\t总价");
    	 
    	 System.out.println(sno+product.toString());
    	    
    	 aLine=scan.nextLine();

    	 
    	 }
    }
    
    public static String generateSno(String initNo) {
    	String sno="";
    	//1. 获取流水号的前缀yyyyMMdd
    	SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
    	String prefic=df.format(new Date());
    	String newNo=String.valueOf(Integer.parseInt("0000")+1);
    	sno=prefic+newNo;
    	return sno;
    }
   
}

	

