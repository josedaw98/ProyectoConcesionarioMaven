package concesionarioMaven.modelo.concesionario;

import javax.persistence.EntityManager;

import concesionarioMaven.negocio.ConcesionarioBean;
import concesionarioMaven.util.ConnectionEntityManagerFactory;

/**
* Clase que inserta concesionarios en la base de datos
* @author jose
*
*/

public class CreateConcesionario {

	/**
	 * Crea un concesionario persistíendolo en la base de datos
	 * @param concesionario
	 */
	
	public void create(ConcesionarioBean concesionario) {
		//recoge la conexion
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		//empieza la transacion, persistemos, cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(concesionario);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
