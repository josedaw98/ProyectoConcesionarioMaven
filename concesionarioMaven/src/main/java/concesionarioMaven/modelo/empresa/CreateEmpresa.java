package concesionarioMaven.modelo.empresa;

import javax.persistence.EntityManager;

import concesionarioMaven.negocio.EmpresaBean;
import concesionarioMaven.util.ConnectionEntityManagerFactory;

/**
* Clase que inserta empresas en la base de datos
* @author jose
*
*/

public class CreateEmpresa {
	/**
	 * Crea una empresa persistíendolo en la base de datos
	 * @param empresa
	 */
	
	public void create(EmpresaBean empresa) {
		//recoge la conexion
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		//empieza la transacion, persistemos, cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(empresa);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
