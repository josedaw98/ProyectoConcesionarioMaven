package concesionarioMaven.inicio;

import concesionarioMaven.modelo.coche.CreateCoche;
import concesionarioMaven.modelo.concesionario.CreateConcesionario;
import concesionarioMaven.modelo.trabajador.CreateTrabajador;
import concesionarioMaven.negocio.CocheBean;
import concesionarioMaven.negocio.ConcesionarioBean;
import concesionarioMaven.negocio.TrabajadorBean;

public class Start {
	
	public static void main(String[] args) {
	
	
	/*
	 * ********************************
	 * C R E A N D O    O B J E T O S
	 * ********************************
	 */

	TrabajadorBean jorge = new TrabajadorBean();
	jorge.setDNI("71726615X");
	jorge.setNombre("jorge");
	
	TrabajadorBean carlos = new TrabajadorBean();
	carlos.setDNI("71726615X");
	carlos.setNombre("carlos");
	
	
	
	ConcesionarioBean gijon = new ConcesionarioBean();
	gijon.setCIF(7172L);
	
	ConcesionarioBean oviedo = new ConcesionarioBean();
	oviedo.setCIF(6162L);
	
	ConcesionarioBean mieres = new ConcesionarioBean();
	mieres.setCIF(5152L);
	
	
	
	
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
	gijon.AddCoche(C5);
	gijon.AddCoche(leon);
	
	oviedo.addTrabajador(jorge);
	oviedo.addTrabajador(carlos);
	
	
	/*
	 * **************************************************
	 * P E R S I S T I E N D O    L O S     D A T O S
	 * **************************************************
	 */	
	
	CreateTrabajador createTrabajador = new CreateTrabajador();
	createTrabajador.create(jorge);
	createTrabajador.create(carlos);
	
	
	CreateConcesionario createConcesionario = new CreateConcesionario();
	createConcesionario.create(oviedo);
	createConcesionario.create(mieres);
	createConcesionario.create(gijon);
	
	CreateCoche createCoche = new CreateCoche();
	createCoche.create(ibiza);
	createCoche.create(leon);
	createCoche.create(C5);
	
	}
}
