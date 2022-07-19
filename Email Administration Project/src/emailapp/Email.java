package emailapp;

import java.util.Scanner;
import java.util.Random;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int defaultPasswordLength = 10; 
	private String emailDomain;
	
	//receive first and last names
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		
		//call method for generating random passwords
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your password is " + this.password + "\n");
		
		
		//call method for asking email domain
		this.emailDomain = emailDomain();
		//System.out.println("Your email domain is " + this.companySuffix);
		
		Random random = new Random();
		int randomNum = random.nextInt(10000);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + randomNum 
				+ "@" + emailDomain + ".com";
		
	}
	

	
	//method for generating random passwords
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%";
		
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++) {
			int randomValue = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomValue);
		}
		
		return new String(password);
	}
	
	//method for asking the user for the email domain
	private String emailDomain() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your email domain?(ex- gmail, yahoo, etc): ");
		String domain = in.nextLine(); 
		
		return domain; 
	}
	
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
		
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return  "Random email: " + email + "\n"
				+ "Random password: " + password; 			
	}

}
