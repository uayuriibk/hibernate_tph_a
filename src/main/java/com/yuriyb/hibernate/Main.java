package com.yuriyb.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		
		@SuppressWarnings("deprecation")
		Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Alex Newton");

		RegularEmployee e2 = new RegularEmployee();
		e2.setName("Andrew Guk");
		e2.setSalary(20000);
		e2.setBonus(4);

		ContractEmployee e3 = new ContractEmployee();
		e3.setName("Artur Konandoyl");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("12 hours");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		
		System.out.println("The data has been saved into the DB!");
	}
}