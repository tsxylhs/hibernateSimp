package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// 创建一个sessionFactory对象，并且保证一个项目中只有一个对象》。
	private static Configuration  configuration= null;
	private static  SessionFactory sessionFactory= null;
	// 一旦被static修饰，那么这段代码就会在类加载阶段执行。
	static{
		configuration = new Configuration();
		configuration.configure();
		// 创建sessionFactory
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static SessionFactory  getSessionFactory(){
		
		return sessionFactory;
	}

}
