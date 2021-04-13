package week8;

public class CheckingAccount extends BankAccount {
	private double serviceCharge;

	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	public CheckingAccount(String accountNum, double balance) {
		super(accountNum, balance);
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	@Override
	public String toString() {
		return "CheckingAccount [serviceCharge=" + this.serviceCharge + ",toString()=" + super.toString() + "]";
	}

}
