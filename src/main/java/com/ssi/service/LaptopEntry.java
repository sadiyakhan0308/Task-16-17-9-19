package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ssi.model.Laptop;
import com.ssi.utility.Util;

public class LaptopEntry {

	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		Laptop l1 = new Laptop("L1", "Lenovo", 50000);
		Laptop l2 = new Laptop("L2", "Hp", 70000);
		Laptop l3 = new Laptop("L3", "Asus", 40000);

		Transaction tr = session.beginTransaction();
		session.save(l1);
		session.save(l2);
		session.save(l3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}

}
