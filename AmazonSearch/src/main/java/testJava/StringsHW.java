package testJava;

public class StringsHW {
	int empId;
	String empName;
	Double empSalary;
	public static void main(String[] args) {
		StringsHW obj1= new StringsHW();
		obj1.empId=1;
		obj1.empName="Achyuth";
		obj1.empSalary=100000.00;
		
		StringsHW obj2= new StringsHW();
		obj2.empId=1;
		obj2.empName="Achyuth";
		obj2.empSalary=100000.00;
		
		System.out.println("Hash code for obj1 : "+ obj1.hashCode());
		System.out.println("Hash code for obj2 : "+ obj2.hashCode());
		System.out.println("=========================================");
		System.out.println("To String for obj1 : "+ obj1.toString());
		System.out.println("To String for obj2 : "+ obj2.toString());
		System.out.println("=========================================");
		System.out.println("Is obj1 and obj2 are equal : "+ obj1.equals(obj2));

	}

}
