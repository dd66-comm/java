package password;
import java.util.Scanner;
	
	public class StringSplit {
	public static void main(String[] args){
		
		//1.输入合法运算表达式
		Scanner  scan=new Scanner(System.in);
		String express=scan.next();
		//2.找出（的位置
	     int pos1=express.indexOf("(");
	     
		//3.取出运算符字串。如add
		String operateCode=express.substring(0,pos1);
		int pos2,pos3;
		double number1,number2;
		pos3=express.indexOf(")");
		
		//4.如果运算符是doubleMe,则只需要取一个数首先只需查找）的位置
		if(operateCode.equals("doubleMe")) {
			String operateNumber=express.substring(pos1+1,pos3);
			number1=Double.parseDouble(operateNumber);
			System.out.println(number1*2);
		}
		//5.否则需要取两个数，首先要分别查找,和)的位置
		else {
			if((operateCode.equals("add"))) {
			pos2=express.indexOf(",");
			String operateNumber1=express.substring(pos1+1,pos2);
			String operateNumber2=express.substring(pos2+1,pos3);
			number1=Double.parseDouble(operateNumber1);
			number2=Double.parseDouble(operateNumber2);
			double result=number1+number2;
			String info=express+"="+String.valueOf(result);
			System.out.println(info);
			}
			else {
				if((operateCode.equals("sub"))) {
					pos2=express.indexOf(",");
					String operateNumber1=express.substring(pos1+1,pos2);
					String operateNumber2=express.substring(pos2+1,pos3);
					number1=Double.parseDouble(operateNumber1);
					number2=Double.parseDouble(operateNumber2);
					double result=number1-number2;
					String info=express+"="+String.valueOf(result);
					System.out.println(info);
				}
				else {
					if((operateCode.equals("multiple"))) {
				    pos2=express.indexOf(",");
					String operateNumber1=express.substring(pos1+1,pos2);
					String operateNumber2=express.substring(pos2+1,pos3);
					number1=Double.parseDouble(operateNumber1);
					number2=Double.parseDouble(operateNumber2);
					double result=number1*number2;
					String info=express+"="+String.valueOf(result);
					System.out.println(info);
				}
					else {
						if((operateCode.equals("divide"))) {
							pos2=express.indexOf(",");
							String operateNumber1=express.substring(pos1+1,pos2);
							String operateNumber2=express.substring(pos2+1,pos3);
							number1=Double.parseDouble(operateNumber1);
							number2=Double.parseDouble(operateNumber2);
							double result=number1/number2;
							String info=express+"="+String.valueOf(result);
							System.out.println(info);
						}
						}
					}
				}
			}
			}
		}
		
		
	
