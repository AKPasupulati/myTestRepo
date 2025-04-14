package testJava;

public class BofaImpl implements Bank{

	@Override
	public void ccPayments() {
		// TODO Auto-generated method stub
		System.out.println("Bofa Credit Card payments");
	}

	@Override
	public void dcPayments() {
		// TODO Auto-generated method stub
		System.out.println("Bofa Dedit Card payments");
	}

	@Override
	public void cashPayments() {
		// TODO Auto-generated method stub
		System.out.println("Bofa Cash payments");
	}

}
