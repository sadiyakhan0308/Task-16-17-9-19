package com.ssi.service.LaptopCrud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ssi.model.Laptop;

public class LaptopCrud {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
	    SessionFactory sf=config.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction tr=session.beginTransaction();
	    
	    /*Laptop laptop=new Laptop();
	    laptop.setCode("L6");
       laptop.setBrand("HCL");
       laptop.setPrice(80000);    
       session.save(laptop);
   
    tr.commit();
    System.out.println("Inserted Successfully");
    
    
	    /*Laptop l=new Laptop("L115");
	    session.delete(l);
	    
	    tr.commit();
	    System.out.println("Laptop deleted");
	   */
	    System.out.println("Update row");
	    Laptop lp=session.get(Laptop.class,"L3");
	    lp.setBrand("Lenovo");
	    session.update(lp);
	    tr.commit();
	    System.out.println("Updated");

	}

}