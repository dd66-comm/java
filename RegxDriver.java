package week17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDriver {
public static void main(String[] args) {
	String express="add((min12,3),max(1,sub(2,1)))";
	String regex="((add)|(sub)|(max)|(min)|doubleMe))\\(\\d{1,}(,\\d{1,})?\\";
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(express);
	while(m.find()) {
		String s=m.group();
	System.out.println(s);
	String result=cal(s);
	express =express.replaceAll(s, result);
	
	}
}

public static String cal(String express) {
	String result="";
	String code=express.substring(0);
	return result;
	
}
}
