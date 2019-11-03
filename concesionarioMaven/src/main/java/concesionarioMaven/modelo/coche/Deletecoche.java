package concesionarioMaven.modelo.coche;

import javax.persistence.EntityManager;

import concesionarioMaven.negocio.CocheBean;
import concesionarioMaven.negocio.ConcesionarioBean;
import concesionarioMaven.util.ConnectionEntityManagerFactory;

/**
 * Clase que borra Concesionario en la base de datos
 * @author jose
 *
 */


public class Deletecoche {

	/**
	 * Borra un coche
	 * @param CocheBean del coche borrar
	 */
	
	public void delete(CocheBean coche) {
		
		//recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		//comienza la transaccion
		entityManager.getTransaction().begin();
		
		//busca al alumno por ID
		 CocheBean BorrarCoche  = entityManager.find( coche.getClass(), coche.getBastidor());
		if(BorrarCoche!=null) {
			//si lo encuentra lo borra
			entityManager.remove(BorrarCoche);
		}
		
		//cierra la transccion y la conexion ligero
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}
}
