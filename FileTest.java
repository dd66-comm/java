package week16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileTest {
 public static void main(String[] args) {
	 try {
		 String fileName="c:/aaa";
		 File aFile=new File(fileName);
		 FileReader fr=new FileReader(aFile);
		 BufferedReader bf=new BufferedReader(fr);
		 
		 String aLine=bf.readLine();
		 System.out.println(aLine);
		 aLine=bf.readLine();
		 System.out.println(aLine);
		 aLine=bf.readLine();
		 System.out.println(aLine);
		 bf.close();
		 fr.close();
		 
	 }
	 catch(Exception e){
		 e.printStackTrace();
		 
	 }
 }
}
