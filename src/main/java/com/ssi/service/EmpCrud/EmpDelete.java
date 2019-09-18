package com.ssi.service.EmpCrud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.ssi.model.Emp;
import com.ssi.utility.Util;

public class EmpDelete {
	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		Emp e = new Emp();
		e.setEno(1);
        
		Transaction tr = session.beginTransaction();
		session.delete(e);

		tr.commit();
		session.close();
		System.out.println("Deleted Successfully");

	}
}