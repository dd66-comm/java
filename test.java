package test;
import java.util.Scanner;
public class test {
	public static void main(String arg[]) {
		String songTitle;
        float songPrice;
        int number;
        float totalRevence;
        float siteTevence;
        float manageRevence;
        float siteRate=0;
        float manageRate=0;
        
        Scanner scan=new Scanner(System.in);{
        System.out.println("������������ƣ�");
        songTitle=scan.nextLine();
        System.out.println("�����뵥�ۣ�");
        songPrice=scan.nextFloat();
        System.out.println("������������");
        number=scan.nextInt();
        }
        
        totalRevence=songPrice*number;
        siteTevence=totalRevence*siteRate;
        manageRevence=totalRevence*manageRate;
        
        System.out.println("������"+totalRevence);
        System.out.println("��������"+manageRevence);
        System.out.println("վ������"+siteTevence);
        		
}

}
