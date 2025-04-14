package testJava;

public class BankAudit {
	
	public static void BanksAudit(Bank b) {
		b.ccPayments();
		b.dcPayments();
		b.cashPayments();
		b.ApplicationCheck();
		Bank.utilityPayments();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanksAudit(new BofaImpl());
		BanksAudit(new ChaseImpl());

	}

}
