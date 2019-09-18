package com.ssi.service.EmpCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ssi.model.Emp;
import com.ssi.model.Laptop;
import com.ssi.utility.Util;

public class EmpUpdate {
	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();

		Emp e = session.get(Emp.class,3);
		System.out.println(e);
		e.setSal(55000);
		e.setEname("sadiya");
		e.setLaptop(new Laptop("l36"));
		System.out.println(e);
		Transaction tr = session.beginTransaction();
		session.update(e);
		tr.commit();
		session.close();
		System.out.println("Updated Successfully");

	}
}