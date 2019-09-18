
package com.ssi.service.EmpCrud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.ssi.model.Emp;
import com.ssi.model.Laptop;
import com.ssi.model.Project;
import com.ssi.model.Vehicle;
import com.ssi.utility.Util;

public class EmpInsert {
	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		Emp e = new Emp();
		 e.setEno(114);
	        e.setEname("DDD");
	        e.setSal(20000);
	        e.setLaptop(new Laptop("L15"));
	        e.setVehicle(new Vehicle("V56"));
	       e.getProjects().add(new Project("P115"));
	    
	   
	   
		Transaction tr = session.beginTransaction();
		 session.save(e);
		    

		tr.commit();
		 System.out.println("Inserted Successfully");
		session.close();
		

	}
}