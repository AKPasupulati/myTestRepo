package testJava;

import java.util.Objects;

public class EmployeeWithOverrideOfObjClassMethods {
	int empId;
	String empName;
	Double empSalary;
	@Override
	public int hashCode() {
		return Objects.hash(empId + " " + empName + " " + empSalary);
	}
	@Override
	public String toString() {
		return "Employee{" +
		           "Employee Id = " + empId +
		           ", Employee Name = '" + empName + '\'' +
		           ", Employee Salary = " + empSalary +
		           '}';
	}
	@Override
	public boolean equals(Object obj) {
		EmployeeWithOverrideOfObjClassMethods empObj = (EmployeeWithOverrideOfObjClassMethods) obj;
		if(empId == empObj.empId && empName.equals(empObj.empName) && empSalary.equals(empObj.empSalary)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		EmployeeWithOverrideOfObjClassMethods obj1= new EmployeeWithOverrideOfObjClassMethods();
		obj1.empId=1;
		obj1.empName="Achyuth";
		obj1.empSalary=100000.00;
		
		EmployeeWithOverrideOfObjClassMethods obj2= new EmployeeWithOverrideOfObjClassMethods();
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
