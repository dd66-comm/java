package week8;

public class SavingsAccount extends BankAccount{
		private double interestRate;

		public SavingsAccount(String accountNum, double balance) {
			super(accountNum,balance);
		}

		public SavingsAccount(String accountNum, double balance, double interestRate) {
			super(accountNum, balance);
			this.interestRate = interestRate;
		}

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		@Override
		public String toString() {
			return "SavingsAccount [interestRate=" + this.interestRate + ",toString()="+super.toString()+"]";
		}
		

		
		
		
		
	}

	

