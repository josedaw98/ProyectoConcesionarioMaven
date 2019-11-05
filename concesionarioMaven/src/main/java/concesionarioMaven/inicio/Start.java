package concesionarioMaven.inicio;

import concesionarioMaven.modelo.coche.CreateCoche;
import concesionarioMaven.modelo.concesionario.CreateConcesionario;
import concesionarioMaven.modelo.empresa.CreateEmpresa;
import concesionarioMaven.modelo.trabajador.CreateTrabajador;
import concesionarioMaven.negocio.CocheBean;
import concesionarioMaven.negocio.ConcesionarioBean;
import concesionarioMaven.negocio.EmpresaBean;
import concesionarioMaven.negocio.TrabajadorBean;

public class Start {
	
	public static void main(String[] args) {
	
	
	/*
	 * ********************************
	 * C R E A N D O    O B J E T O S
	 * ********************************
	 */
		
	EmpresaBean seat = 	new EmpresaBean();
	seat.setNombre("seat");

	TrabajadorBean jorge = new TrabajadorBean();
	jorge.setDNI("71726615X");
	jorge.setNombre("jorge");
	
	TrabajadorBean carlos = new TrabajadorBean();
	carlos.setDNI("71726615X");
	carlos.setNombre("carlos");
	
	
	ConcesionarioBean oviedo = new ConcesionarioBean();
	oviedo.setCIF("6162");
	
	ConcesionarioBean mieres = new ConcesionarioBean();
	mieres.setCIF("5152");
	
	
	
	
	CocheBean ibiza = new CocheBean();
	ibiza.setBastidor("11d11e");
	ibiza.setModelo("ibiza");
	
	CocheBean leon = new CocheBean();
	leon.setBastidor("22d22e");
	leon.setModelo("leon");
	
	CocheBean C5 = new CocheBean();
	C5.setBastidor("33d33e");
	C5.setModelo("C5");
	
	
	/*
	 * **************************************************
	 * A Ñ A D I E N D O    I N F O R M A C I Ó N
	 * **************************************************
	 */		
	
	oviedo.AddCoche(ibiza);
	mieres.AddCoche(ibiza);
	oviedo.AddCoche(leon);
	mieres.AddCoche(C5);
	
	oviedo.addTrabajador(jorge);
	mieres.addTrabajador(carlos);
	
	
	/*
	 * **************************************************
	 * P E R S I S T I E N D O    L O S     D A T O S
	 * **************************************************
	 */	
	
	CreateEmpresa createEmpresa = new CreateEmpresa();
	createEmpresa.create(seat);
	

	
	


	
	}
}
