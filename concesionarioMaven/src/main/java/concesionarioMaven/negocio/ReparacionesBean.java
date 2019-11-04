package concesionarioMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Reparaciones")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//preguntar para que sirve
public class ReparacionesBean {
	
	@Id
	@Column
	private String Matr�cula;
	
	@Column
	private String Marca;
	
	@Column
	private String Modelo;
	
	@Column
	private String Color;
	
	@Column
	private String Bastidor;
	
	@Column
	private String Descripci�nAv;
	
	@Column
	private int Presupuesto;
	
	@ManyToOne
	private ConcesionarioBean concesionario;

	public String getMatr�cula() {
		return Matr�cula;
	}

	public void setMatr�cula(String matr�cula) {
		Matr�cula = matr�cula;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getBastidor() {
		return Bastidor;
	}

	public void setBastidor(String bastidor) {
		Bastidor = bastidor;
	}

	public String getDescripci�nAv() {
		return Descripci�nAv;
	}

	public void setDescripci�nAv(String descripci�nAv) {
		Descripci�nAv = descripci�nAv;
	}

	public int getPresupuesto() {
		return Presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		Presupuesto = presupuesto;
	}

	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(ConcesionarioBean concesionarioBean) {
		this.concesionario = concesionarioBean;
	}

	@Override
	public String toString() {
		return "ReparacionesBean [Matr�cula=" + Matr�cula + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color="
				+ Color + ", Bastidor=" + Bastidor + ", Descripci�nAv=" + Descripci�nAv + ", Presupuesto=" + Presupuesto
				+ ", concesionario=" + concesionario + "]";
	}
	
	
	
}
