package concesionarioMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="concesionario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//preguntar para que sirve
public class ConcesionarioBean {
	
	

	@Id
	@Column 
	private String CIF;
	
	@Column
	private String localidad;
	
	@Column
	private String provincia;
	
	@Column
	private String telefono;
	
	@Column
	private String nombre;
	
	@ManyToOne
	private EmpresaBean empresa;
	
	//un coche se vende en varios concesionarios
		@ManyToMany(mappedBy="concesionarios", cascade = CascadeType.ALL)
		private List<CocheBean> coches = new ArrayList<CocheBean>();
	

		//un concesionario tiene varios trabajadores
		@OneToMany(mappedBy="concesionario" , cascade = CascadeType.ALL)
		private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();
		
		//un concesionario tiene varios trabajadores
		@OneToMany(mappedBy="concesionario" , cascade = CascadeType.ALL)
		private List<ReparacionesBean> reparaciones = new ArrayList<ReparacionesBean>();
		
		
		/**
		 * Operación que permite añadir trabajadores al concesionario y este trabajador a la lista de coches
		 * @param concesionario
		 */
		
		public void addTrabajador(TrabajadorBean trabajador) {
			if(!trabajadores.contains(trabajador)) {
				trabajadores.add(trabajador);
				trabajador.setConcesionario(this);
		}
		}
		
		
		/**
		 * Operación que permite añadir repareciones al concesionario y esta reparacion a la lista de reparaciones
		 * @param concesionario
		 */
			public void addReparacion(ReparacionesBean reparacion) {
			if(!trabajadores.contains(reparacion)) {
				reparaciones.add(reparacion);
				 reparacion.setConcesionario(this);
			}
		}
		
		
		/**
		 * Operación que permite añadir coches al concesionario y este coche a la lista de coches
		 * @param concesionario
		 */
		
		public void AddCoche(CocheBean coche){
			
			if(!coches.contains(coche)) {
				coches.add(coche);
				List<ConcesionarioBean> concesionarios = coche.getConcesionarios();
				
				if(!concesionarios.contains(this)) {
					concesionarios.add(this);
				}
			}
		}
	
	public List<CocheBean> getCoches() {
			return coches;
		}

		public void setCoches(List<CocheBean> coches) {
			this.coches = coches;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public EmpresaBean getEmpresa() {
		return empresa;
	}


	public void setEmpresa(EmpresaBean empresa) {
		this.empresa = empresa;
	}


	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}


	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}


	public List<ReparacionesBean> getReparaciones() {
		return reparaciones;
	}


	public void setReparaciones(List<ReparacionesBean> reparaciones) {
		this.reparaciones = reparaciones;
	}
	
	

	

}
