package concesionarioMaven.inicio;

import java.security.cert.CertificateEncodingException;

import concesionarioMaven.modelo.coche.CreateCoche;
import concesionarioMaven.modelo.concesionario.CreateConcesionario;
import concesionarioMaven.modelo.reparaciones.CreateReparacion;
import concesionarioMaven.modelo.trabajador.CreateTrabajador;
import concesionarioMaven.negocio.CocheBean;
import concesionarioMaven.negocio.ConcesionarioBean;
import concesionarioMaven.negocio.ReparacionesBean;
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
	jorge.setApellidos("Menendez Rojo");
	jorge.setDireccion("Castilla 22");
	jorge.setLocalidad("Oviedo");
	jorge.setProvincia("Asturias");
	jorge.setSueldoBase(1200);
	jorge.setTelefono("673253748");
	
	TrabajadorBean carlos = new TrabajadorBean();
	carlos.setDNI("72756565X");
	carlos.setNombre("carlos");
	carlos.setApellidos("Fanjul Gonzalez");
	carlos.setDireccion("Chile 12");
	carlos.setLocalidad("Oviedo");
	carlos.setProvincia("Asturias");
	carlos.setSueldoBase(1100);
	carlos.setTelefono("186253726");
	
	
	ConcesionarioBean oviedo = new ConcesionarioBean();
	oviedo.setCIF("6162");
	oviedo.setNombre("TartiereAuto");
	oviedo.setLocalidad("oviedo");
	oviedo.setTelefono("9856273654");
	oviedo.setProvincia("Asturias");
	
	
	ConcesionarioBean mieres = new ConcesionarioBean();
	mieres.setCIF("5152");
	mieres.setNombre("IRTRacing");
	mieres.setLocalidad("oviedo");
	mieres.setTelefono("985435243");
	mieres.setProvincia("Asturias");
	
	
	
	
	CocheBean ibiza = new CocheBean();
	ibiza.setBastidor("11d11e");
	ibiza.setModelo("ibiza");
	ibiza.setCaballos(75);
	ibiza.setColor("blanco");
	ibiza.setEjes(4);
	ibiza.setPlazas(5);
	ibiza.setPrecioMinimo(5400);
	
	CocheBean leon = new CocheBean();
	leon.setBastidor("22d22e");
	leon.setModelo("leon");
	leon.setCaballos(110);
	leon.setColor("negro");
	leon.setEjes(6);
	leon.setPlazas(5);
	leon.setPrecioMinimo(8600);
	
	CocheBean C5 = new CocheBean();
	C5.setBastidor("33d33e");
	C5.setModelo("C5");
	C5.setCaballos(133);
	C5.setColor("gris");
	C5.setEjes(8);
	C5.setPlazas(5);
	C5.setPrecioMinimo(10400);
	
	
	
	
	ReparacionesBean M3 = new ReparacionesBean();
	M3.setMatrícula("1272erd");
	M3.setPresupuesto(350);
	M3.setBastidor("21j34j");
	M3.setDescripciónAv("Fallo embrague");
	M3.setMarca("BMW");
	M3.setModelo("M3");
	
	
	ReparacionesBean cls = new ReparacionesBean();
	cls.setMatrícula("2256dvd");
	cls.setPresupuesto(500);
	cls.setBastidor("32k73j");
	cls.setDescripciónAv("Fallo hidraulico");
	cls.setMarca("Mercedes");
	cls.setModelo("cls");
	
	
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
	
	oviedo.addReparacion(M3);
	mieres.addReparacion(cls);
	
	
	/*
	 * **************************************************
	 * P E R S I S T I E N D O    L O S     D A T O S
	 * **************************************************
	 */	
	
	CreateCoche crearCoche = new CreateCoche();
	crearCoche.create(ibiza);
	crearCoche.create(C5);
	crearCoche.create(leon);
	
	CreateConcesionario createConcesionario = new CreateConcesionario();
	createConcesionario.create(oviedo);
	createConcesionario.create(mieres);
	
	CreateTrabajador createtrabajador = new CreateTrabajador();
	createtrabajador.create(jorge);
	createtrabajador.create(carlos);
	
	CreateReparacion createReparacion = new CreateReparacion();
	createReparacion.create(M3);
	createReparacion.create(cls);
	

	
	


	
	}
}
