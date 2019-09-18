package com.ssi.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ssi.model.Project;
import com.ssi.utility.Util;

public class ProjectEntry {

	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		Project p1=new Project("p1","Banking",5500000);
		Project p2=new Project("p2","hosital",60450000);
		Project p3=new Project("p3","School",9780000);
	
		
		Transaction tr=session.beginTransaction();
		session.save(p1); session.save(p2);
		session.save(p3); 
		tr.commit();
		session.close();
		System.out.println("PROJECT STORED");

	}

}