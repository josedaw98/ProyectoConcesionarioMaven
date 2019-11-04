package concesionarioMaven.modelo.reparaciones;

import javax.persistence.EntityManager;

import concesionarioMaven.negocio.ReparacionesBean;
import concesionarioMaven.negocio.TrabajadorBean;
import concesionarioMaven.util.ConnectionEntityManagerFactory;

/**
* Clase que inserta reparaciones en la base de datos
* @author jose
*
*/

public class CreateReparacion {

	/**
	 * Crea una reparacion. persistíendolo en la base de datos
	 * @param concesionario
	 */
	
	public void create(ReparacionesBean reparacion) {
		//recoge la conexion
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		//empieza la transacion, persistemos, cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(reparacion);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
