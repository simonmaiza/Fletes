package enunciado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class Vehiculo extends Carga {
	private String patente;
	private String apellidoTitular;
	private String nombreTitular;
	public List<Carga> cargas;
	private Double pesoMaximo;
	
	
	
	public Vehiculo(String patente,String nombreTitular, String apellidoTitular, Double pesoMaximo) {
		super(descripcion, peso);
		this.patente = patente;
		this.nombreTitular = nombreTitular;
		this.apellidoTitular = apellidoTitular;
		this.pesoMaximo = pesoMaximo;
		this.cargas = new ArrayList<Carga>();
		
	}
	
	
	
	//obtiene el peso cargado del vehiculo
	public Double obtenerPesoCargado () {
		Double pesoCargado = 0.0;
			for (Carga it : cargas) {
				pesoCargado = it.getPeso();
			}
			return pesoCargado ;
		}
	
	public abstract Boolean agregarCarga(Carga carga) throws SobrepesoException;
			
	
	public String getApellidoTitular() {
		return apellidoTitular;
	}

	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public Double getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}



	public abstract Integer obtenerCantidadDeCargas();
	

		

	
	

}
