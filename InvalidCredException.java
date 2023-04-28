package com.ericsson.java.training;

import java.util.Scanner;


class InvalidCredential extends Exception {
	public String username;
	public String password;

	public InvalidCredential() {

	}

	public InvalidCredential(String user, String pwd) {
		this.username = user;
		this.password = pwd;
		System.out.println("InvalidCredential param Constructor");
	}

	public String toString() {
		return ("Invalid username or password for username: " + username);
	}
}

public class InvalidCredException {

	private String uName = "ericsson";
	private String pWord = "ericsson123";

	public void validate (String usr, String pass) throws InvalidCredential
	{
		
			if (uName.equals(usr) && pWord.equals(pass))
			{
				System.out.println("Login successful");
			}
			else
			{
				throw new InvalidCredential(usr, pass);
			}
		//}
		//finally
		//{
		//	System.out.println("Finally called");
		//}
	}
	

	public static void main(String[] args) throws InvalidCredential{
		Scanner scan = new Scanner(System.in);
		InvalidCredException iCE = new InvalidCredException();
		System.out.println("Enter username\n");
		String usr = scan.next();
		System.out.println("Enter Password\n");
		String pwd = scan.next();
		scan.close();
		iCE.validate(usr, pwd);
		
	}

}
