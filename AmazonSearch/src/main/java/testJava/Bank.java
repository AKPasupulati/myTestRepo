package testJava;

public interface Bank {
	
	public abstract void ccPayments();
	public abstract void dcPayments();
	public abstract void cashPayments();
	public static void utilityPayments() {
		System.out.println("Utility Payments appliciable for all Banks");
	}
	public default void ApplicationCheck() {
		System.out.println("Checking whether application is break or not");
	}
}
