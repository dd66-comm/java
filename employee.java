package employee;

public class employee {
     private String number;
     private String name;
     private double basesalary;
     private   double salarygrowth;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBasesalary() {
		return basesalary;
	}
	
	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}
	
	public double getSalarygrowth() {
		return salarygrowth;
	}
	
	public void setSalarygrowth( double salarygrowth) {
		this.salarygrowth = salarygrowth;
	}
	public double  updateSalary(double basalary,double salarygrowth) {
		double updatesalary;
		updatesalary=basesalary*(1+salarygrowth);
		return updatesalary;
	}
}
