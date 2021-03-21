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
        System.out.println("请输入歌曲名称：");
        songTitle=scan.nextLine();
        System.out.println("请输入单价：");
        songPrice=scan.nextFloat();
        System.out.println("请输入数量：");
        number=scan.nextInt();
        }
        
        totalRevence=songPrice*number;
        siteTevence=totalRevence*siteRate;
        manageRevence=totalRevence*manageRate;
        
        System.out.println("总利润："+totalRevence);
        System.out.println("经理利润："+manageRevence);
        System.out.println("站点利润："+siteTevence);
        		
}

}
