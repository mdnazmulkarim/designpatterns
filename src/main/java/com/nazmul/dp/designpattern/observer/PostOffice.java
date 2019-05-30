package com.nazmul.dp.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {

	public List<Mail> allMails;
	public List<Observer> allObservers;
	
	public PostOffice()
	{
		allMails = new ArrayList<Mail>();
		allObservers = new ArrayList<Observer>();
	}
	
	public void addMail(Mail m)
	{
		allMails.add(m);
		notifyAllObservers();
	}
	
	public void attach(Observer o) {
		allObservers.add(o);
		
	}

	public void dettach(Observer o) {
		allObservers.remove(o);
		
	}

	public void notifyAllObservers() {
		for(Observer o : allObservers)
			o.update(this);
	}

}
