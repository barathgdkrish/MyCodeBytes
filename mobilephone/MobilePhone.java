package mobilephone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	private static Scanner sc= new Scanner(System.in);
	private static ArrayList<Contacts> contacts= new ArrayList<Contacts>();
	public static void main(String[] args) {
		store();
		update();
	}
	
	public static void store() {
		System.out.println("Enter The Contact Details: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Number: ");
		String number = sc.nextLine();
		Contacts contact = new Contacts(name,number);
		contacts.add(contact);
	}
	public static void update() {
		System.out.println("Enter The Contact to be updated: ");
		String name = sc.nextLine();
		int index = contacts.indexOf(name); 
		System.out.println("Index is: "+index);
	}
}
