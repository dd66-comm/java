package week8;

	public class Customer {
		private String ssn;
		private String name;
		private CheckingAccount CheckingAccount ;
		private SavingsAccount  SavingsAccount ;
		public CheckingAccount getCheckingAccount() {
			return CheckingAccount;
		}
		public void setCheckingAccount(CheckingAccount checkingAccount) {
			CheckingAccount = checkingAccount;
		}
		public SavingsAccount getSavingsAccount() {
			return SavingsAccount;
		}
		public void setSavingsAccount(SavingsAccount savingsAccount) {
			SavingsAccount = savingsAccount;
		}
		public Customer() {
			super();
		}
		public Customer(String ssn, String name) {
			super();
			this.ssn = ssn;
			this.name = name;
		}

		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
		   String msg;
		   msg="ssn:"+this.ssn;
		   msg+="name:"+this.name;
		   msg+="CheckingAccount"+CheckingAccount;
		   msg+="SavingsAccount"+SavingsAccount;
		   return msg;
			
}
		}
	
