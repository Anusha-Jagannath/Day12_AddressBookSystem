package com.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Contact contact = new Contact("sam","thomas","UP","uttar","UP",60980,9874536,"abc@gmail.com");
		contact.displayContact();

	}

}
