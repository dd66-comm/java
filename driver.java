package employee;

public class driver {
	public static void main(String[] args) {
		employee emp=new employee();
		emp.setName("����");
		emp.setNumber("02");
		emp.setBasesalary(2000);
		emp.setSalarygrowth(0.10);
		emp.updateSalary(2000,0.1);
		
		
		System.out.println("Ա����Ϣ��");
		System.out.println("������"+emp.getName()+",��ţ�"+emp.getNumber()+",�������ʣ�"+emp.getBasesalary()+",���º�Ĺ��ʣ�"+emp.updateSalary(2000,0.1));
	}
	
  
}
