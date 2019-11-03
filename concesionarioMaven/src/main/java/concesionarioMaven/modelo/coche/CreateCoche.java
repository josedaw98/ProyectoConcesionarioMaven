package concesionarioMaven.modelo.coche;

import javax.persistence.EntityManager;

import concesionarioMaven.negocio.CocheBean;
import concesionarioMaven.util.ConnectionEntityManagerFactory;

/**
 * Clase que inserta coches en la base de datos
 * @author jose
 *
 */

public class CreateCoche {

	/**
	 * Crea un coche persistíendolo en la base de datos
	 * @param coche
	 */
	
	public void create(CocheBean coche) {
		
		//recoge la conexion
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();	
		
		//empieza la trasaccion, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(coche);
		entityManager.getTransaction().commit();
		entityManager.close();
	
	}
}
