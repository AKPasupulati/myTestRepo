package testJava;

import java.util.List;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) throws Exception{
		int age;
		String name;
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Name:: ");	
		String input= scn.nextLine();
		name = input.equalsIgnoreCase("null") ? null : input;
		System.out.println("Enter Age:: ");
		age= scn.nextInt();
		
		if(age<=0) {
			throw new Exception("Age should not be less than and equal to zero");
		}
		if(name==null || name.trim().isEmpty()) {
			throw new Exception("Name should not be null");
		}
		System.out.println("Main Ends");
		
	}

}
