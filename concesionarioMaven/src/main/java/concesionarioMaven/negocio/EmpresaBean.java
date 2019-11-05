package concesionarioMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // preguntar para que sirve

public class EmpresaBean {

	@Id
	@Column
	private String nombre;

	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<ConcesionarioBean> concesionarios = new ArrayList<ConcesionarioBean>();

	/**
	 * Operación que permite añadir concesionarios a la empresa y este concesionario
	 * a la lista de concesionarios
	 * 
	 * @param empresa
	 */

	public void addTrabajador(ConcesionarioBean concesionario) {
		if (!concesionarios.contains(concesionario)) {
			concesionarios.add(concesionario);
			concesionario.setEmpresa(this);
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ConcesionarioBean> getConcesionarios() {
		return concesionarios;
	}

	public void setConcesionarios(List<ConcesionarioBean> concesionarios) {
		this.concesionarios = concesionarios;
	}
}
