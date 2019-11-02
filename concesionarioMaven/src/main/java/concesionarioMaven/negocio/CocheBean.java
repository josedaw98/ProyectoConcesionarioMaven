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
@Table(name="coche")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//preguntar para que sirve
public class CocheBean {

	@Id
	@Column
	private String bastidor;
	
	@Column
	private String modelo;
	
	@Column
	private String color;
	
	@Column
	private int plazas;
	
	@Column 
	private int caballos;
	
	@Column
	private int ejes;
	
	@Column(name="MinPrecio")
	private int precioMinimo;
	
	//un coche se vende en varios concesionarios
	@ManyToMany( cascade = CascadeType.ALL)
	private List<ConcesionarioBean> concesionarios = new ArrayList<ConcesionarioBean>();


	public void addConcesionario(ConcesionarioBean concesionario) {
		if(!concesionarios.contains(concesionario)) {
			concesionarios.add(concesionario);
			List<CocheBean> coches = concesionario.getCoches();
			if(!coches.contains(this)) {
				coches.add(this);
			}
		}
	}
	
	
	
	
	
	
	
	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public int getPrecioMinimo() {
		return precioMinimo;
	}

	public void setPrecioMinimo(int precioMinimo) {
		this.precioMinimo = precioMinimo;
	}

	public List<ConcesionarioBean> getConcesionarios() {
		return concesionarios;
	}

	public void setConcesionarios(List<ConcesionarioBean> concesionarios) {
		this.concesionarios = concesionarios;
	}
	
}	

