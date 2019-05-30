package com.nazmul.dp.designpattern.observer;

public class Main {
	public static void main(String[] args) {
		
		PostOffice postOffice = new PostOffice();
		
		Mail aNewMail = new Mail();
		aNewMail.setSender("John");
		aNewMail.setReceiver("Kamal");
		aNewMail.setContent("Hi Kamal, How are you?");
		
		Person johnPerson = new Person();
		johnPerson.setName("John");
		
		Person kamalPerson = new Person();
		johnPerson.setName("Kamal");
		
		postOffice.attach(johnPerson);
		postOffice.attach(kamalPerson);
		
		postOffice.addMail(aNewMail);
	}

}
