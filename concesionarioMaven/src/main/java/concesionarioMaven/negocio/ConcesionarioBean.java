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
import javax.persistence.Table;

@Entity
@Table(name="concesionario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//preguntar para que sirve
public class ConcesionarioBean {
	
	

	@Id
	@Column 
	private long CIF;
	
	@Column
	private String localidad;
	
	@Column
	private String provincia;
	
	@Column
	private String telefono;
	
	@Column
	private String nombre;
	
	//un coche se vende en varios concesionarios
		@ManyToMany(mappedBy="concesionarios", cascade = CascadeType.ALL)
		private List<CocheBean> coches = new ArrayList<CocheBean>();
	
	
		/**
		 * Operación que permite añadir alumnos a la asignatuta y esta asignatura a la lista de alumnos
		 * @param alumno
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

	public long getCIF() {
		return CIF;
	}

	public void setCIF(long cIF) {
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

	

}
