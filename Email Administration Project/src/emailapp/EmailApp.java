package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String args[]) {
	
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your first name: ");
		String firstName = in.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = in.nextLine();
		
		Email em1 = new Email(firstName,lastName);
		System.out.print(em1.showInfo()); //use system.out.print as the method returns a string
	}
}