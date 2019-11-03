package concesionarioMaven.modelo.concesionario;

import javax.persistence.EntityManager;

import concesionarioMaven.negocio.ConcesionarioBean;
import concesionarioMaven.util.ConnectionEntityManagerFactory;

/**
 * Clase que borra Concesionario en la base de datos
 * @author jose
 *
 */


public class DeleteConcesionario {

	/**
	 * Borra un concesionario
	 * @param ConcesionarioBean del concesionario borrar
	 */
	
	public void delete(ConcesionarioBean concesionario) {
		
		//recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		//comienza la transaccion
		entityManager.getTransaction().begin();
		
		//busca al alumno por ID
		ConcesionarioBean BorrarConcesionario = entityManager.find(concesionario.getClass(),concesionario.getCIF());
		if(BorrarConcesionario!=null) {
			//si lo encuentra lo borra
			entityManager.remove(BorrarConcesionario);
		}
		
		//cierra la transccion y la conexion ligero
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}
}
