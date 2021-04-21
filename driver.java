package employee;

public class driver {
	public static void main(String[] args) {
		employee emp=new employee();
		emp.setName("张三");
		emp.setNumber("02");
		emp.setBasesalary(2000);
		emp.setSalarygrowth(0.10);
		emp.updateSalary(2000,0.1);
		
		
		System.out.println("员工信息：");
		System.out.println("姓名："+emp.getName()+",编号："+emp.getNumber()+",基本工资："+emp.getBasesalary()+",更新后的工资："+emp.updateSalary(2000,0.1));
	}
	
  
}
