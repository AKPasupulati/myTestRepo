package testJava;

public class EmployeeHW extends PersonHW{
	Double salary=105086.89;
	String designation="Java Automation Tester";
	public static void main(String[] args) {
		
		EmployeeHW emp1= new EmployeeHW();
		System.out.println(PersonHW.age);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		System.out.println(emp1.designation);
		System.out.println("----------------------------------");
		PersonHW per1= new PersonHW();
		System.out.println(PersonHW.age);
		System.out.println(per1.name);

	}

}
