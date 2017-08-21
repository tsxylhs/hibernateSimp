package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// ����һ��sessionFactory���󣬲��ұ�֤һ����Ŀ��ֻ��һ�����󡷡�
	private static Configuration  configuration= null;
	private static  SessionFactory sessionFactory= null;
	// һ����static���Σ���ô��δ���ͻ�������ؽ׶�ִ�С�
	static{
		configuration = new Configuration();
		configuration.configure();
		// ����sessionFactory
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static SessionFactory  getSessionFactory(){
		
		return sessionFactory;
	}

}
