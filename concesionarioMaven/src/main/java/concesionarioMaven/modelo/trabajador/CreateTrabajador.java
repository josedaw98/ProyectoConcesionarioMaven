package concesionarioMaven.modelo.trabajador;

import javax.persistence.EntityManager;

import concesionarioMaven.negocio.ConcesionarioBean;
import concesionarioMaven.negocio.TrabajadorBean;
import concesionarioMaven.util.ConnectionEntityManagerFactory;

/**
* Clase que inserta trabajador en la base de datos
* @author jose
*
*/

public class CreateTrabajador {
	
	/**
	 * Crea un trabajador persistíendolo en la base de datos
	 * @param trabajador
	 */
	
	public void create(TrabajadorBean trabajador) {
		//recoge la conexion
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		//empieza la transacion, persistemos, cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(trabajador);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
