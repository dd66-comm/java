package week10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test1 {
   public static void main(String[] args){
	  Date date=new Date();
	  System.out.println(date);
	   
	   Calendar cal=new GregorianCalendar();
	   int year=cal.get(Calendar.YEAR);
	   System.out.println(year);
	  int month=cal.get(Calendar.MONTH);
	   System.out.println(month);
	   
	   int week=cal.get(Calendar.DAY_OF_WEEK);
	   StringBuffer weekStr=new StringBuffer("ÐÇÆÚ");
	   
	   switch(week-1){
	   case 0:weekStr=weekStr.append("ÈÕ");break;
	   default:weekStr=weekStr.append(week-1);break;
	   }
	   
	   System.out.println(weekStr);
	   
	   
	   
	   
	 /*  SimpleDateFormat df=new SimpleDateFormat("hh:mm");
	   String  today=df.format(date);
	   System.out.println(today);*/
	   
			   
   }
}
