package com.employee;

// class to generate password and emailId

public class CredentialService {

	private String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789!@#$%^&*()+=";

	public String generatePassword(int l) {
		StringBuilder s = new StringBuilder(l);
		for (int i=0; i<l; i++) {
			int ch = (int)(this.AlphaNumericStr.length() * Math.random());
			s.append(AlphaNumericStr.charAt(ch));
		}
		return s.toString();
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department, String company) {
		return firstName.replaceAll("\\s", "").toLowerCase() + 
				lastName.replaceAll("\\s", "").toLowerCase() + 
				"@" + 
				department.replaceAll("\\s", "").toLowerCase() + "." + 
				company.replaceAll("\\s", "").toLowerCase() + 
				".com";
	}
}
