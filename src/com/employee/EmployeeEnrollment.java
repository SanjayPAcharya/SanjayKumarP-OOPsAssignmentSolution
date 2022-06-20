package com.employee;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeEnrollment {

	public static void main(String[] args) {
		Employee emp = new Employee();

		// First let us take input from user [ First Name, Last Name, Company, Department ]
		
		System.out.println("Employee Details ");
		System.out.print("Enter First Name : ");
		Scanner scanner = new Scanner(System.in);
		emp.setFirstName(scanner.nextLine());

		System.out.print("Enter Last Name : ");
		emp.setLastName(scanner.nextLine());

		System.out.print("Enter Company : ");
		emp.setCompany(scanner.nextLine());
		
		
		// until user enters right department show suggestion to user and take in input until right
		
		do {
			System.out.print("Enter Department : ");
			String _str = scanner.nextLine();
			if (emp.checkIfDepartmentPresent(_str)) {
				emp.setDepartment(_str);
			} else {
				System.out.println("\nPlease enter one of these departments : " + Arrays.toString(emp.departmentsList) + "\n");
			}
		} while(emp.department == null);
		
		scanner.close();
		
		// display generated credentials
		
		emp.showCredentials();
		
	}
}
