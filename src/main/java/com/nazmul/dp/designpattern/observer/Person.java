package com.nazmul.dp.designpattern.observer;

public class Person implements Observer{

	String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void update(Object obj) {
		if(obj instanceof PostOffice) {
			PostOffice office = (PostOffice)obj;
			
			for(Mail mail : office.allMails) {
				if(mail.receiver.equalsIgnoreCase(name))
				{
					System.out.println("New mail for "+name+ " Content:"+mail.content);
				}
			}
		}
		
	}

}
