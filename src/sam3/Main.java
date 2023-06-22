package sam3;
import java.util.Scanner;

import sam3.Register;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Register register = new Register();
		System.out.println("1. Register");
		System.out.println("2. Log In");
		int select1 = sc.nextInt();
		switch(select1) {
		
		case 1 :
			 	System.out.println("User Registration Started.");
	            System.out.println(" Enter fullName => ");
	            String fullName = sc.nextLine();
	            register.setFirstName(fullName);
	            
	           // System.out.println(" Enter lastName => ");
	            String lastName = sc.nextLine();
	            register.setLastName(lastName);

	            System.out.println(" Enter emailId => ");
	            String emailId = sc.nextLine();
	            register.setEmailId(emailId);

	            
	            System.out.println(" Enter password => ");
	            String password = sc.nextLine();
	            register.setPassword(password);
	     
	            System.out.println("User Succesfully Registered.");
	  
		case 2 :
			 System.out.println("User Log In Started."); 
			System.out.println(" Enter emailId=> ");
	        String emailID = sc.nextLine();

	        System.out.println(" Enter password => ");
	        String password1 = sc.nextLine();

	        if (register.getEmailId().equals(emailID) && register.getPassword().equals(password1)) {
	            System.out.println(" User successfully logged-in.. ");
	        } else {
	            System.out.println(" In valid userName of password ");
	        }
	    
		
		}
	}
}
