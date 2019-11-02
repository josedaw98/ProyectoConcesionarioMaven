package concesionarioMaven.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionEntityManager {
	
	private static EntityManager entityManager = null;
	
	private ConnectionEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.jose.concesionarioMaven.H2");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public static EntityManager getEntityManager() {
		
		if(entityManager==null) {
			new ConnectionEntityManager();
		}
		
		return entityManager;
		
	}

}
