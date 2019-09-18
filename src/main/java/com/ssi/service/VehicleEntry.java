package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ssi.model.Emp;
import com.ssi.model.Laptop;
import com.ssi.model.Vehicle;

public class VehicleEntry {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Vehicle e1 = new Vehicle("V111", "Bike", "pulsar", 50000,new Emp(1));
		Vehicle e2 = new Vehicle("V112", "auto", "bajaj", 60000,new Emp(2));
		Vehicle e3 = new Vehicle("V113", "activa", "pep", 70000,new Emp(3));

		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();

	}

}