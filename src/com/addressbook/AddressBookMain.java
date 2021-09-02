package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		List<Contact> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("1. Add\n 2.Edit\n3. delete\n4.Exit");
		choice = sc.nextInt();
		switch(choice) {
		case 1: addContact();
				break;
		case 2:System.out.println("Enter name of person to edit");
		String name = sc.nextLine();
		Contact person = getperson(list,name);
		
		}
		
		
	}

	private static Contact getperson(List<Contact> list, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addContact() {
		List<Contact> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		int phoneNo;
		String email;
		
	

		System.out.println("Enter first name");
		firstName = sc.nextLine();

		System.out.println("Enter second name");
		lastName = sc.nextLine();

		System.out.println("Enter address");
		address = sc.nextLine();

		System.out.println("Enter city");
		city = sc.nextLine();

		System.out.println("Enter state");
		state = sc.nextLine();

		System.out.println("Enter zip");
		zip = scanner.nextInt();

		System.out.println("Enter phone no");
		phoneNo = scanner.nextInt();

		System.out.println("Enter email");
		email = sc.nextLine();

		Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNo,email);
		list.add(contact);
		System.out.println(contact);

		
	}

}
