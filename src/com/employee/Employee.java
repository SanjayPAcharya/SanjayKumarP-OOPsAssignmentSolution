package com.employee;
import java.util.Arrays;

// class for employee instance

public class Employee {

	protected String firstName;
	protected String lastName;
	protected String department;
	protected String company;
	protected String[] departmentsList = {"Technical", "Admin", "Human Resource", "Legal"};

	Employee() {	}
	
	public void setFirstName(String _firstname) {
		this.firstName = _firstname;
	}
	
	public void setLastName(String _lastname) {
		this.lastName = _lastname;
	}
	
	public void setDepartment(String _department) {
		this.department= _department;
	}
	
	public void setCompany(String _company) {
		this.company = _company;
	}

	public void showCredentials() {
		CredentialService empService = new CredentialService();
		System.out.println("\nPlease save the following credentials :");
		System.out.println("Email ID : " + empService.generateEmailAddress(this.firstName, this.lastName, this.department, this.company));
		System.out.println("Password : " + empService.generatePassword(6));
	}
	
	public boolean checkIfDepartmentPresent(String str) {
		return Arrays.stream(this.departmentsList).anyMatch(str::equals);
	}
}