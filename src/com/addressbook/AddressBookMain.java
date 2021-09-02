package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		int phoneNo;
		String email;
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		List<Contact> list = new ArrayList<>();

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
