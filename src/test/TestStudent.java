package test;

import org.hibernate.SessionFactory;
import org.junit.Test;

import util.HibernateUtil;

public class TestStudent {
	@Test
	public void createTable(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		sessionFactory.close();
		
	}

}
