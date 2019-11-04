package concesionarioMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//preguntar para que sirve
public class TrabajadorBean {
	
	@Id
	@Column
	private String DNI;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String direccion;
	
	@Column
	private String localidad;
	
	@Column
	private String provincia;
	
	@Column
	private String telefono;
	
	@Column
	private int sueldoBase;
	
	@ManyToOne
	private ConcesionarioBean concesionario;

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}

	@Override
	public String toString() {
		return "TrabajadorBean [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + ", localidad=" + localidad + ", provincia=" + provincia + ", telefono=" + telefono
				+ ", sueldoBase=" + sueldoBase + ", concesionario=" + concesionario + "]";
	}
	

}
