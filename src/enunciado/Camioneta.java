package enunciado;

public class Camioneta extends Vehiculo {

	private Integer modelo;
	
	
	/*
	 * Las camionetas soportan cagargas hasta su pesoMaximo
	 * 
	 */

	public Camioneta(String patente, String nombreTitular, String apellidoTitular, Double pesoMaximo , Integer modelo) {
		super(patente, nombreTitular, apellidoTitular, pesoMaximo);
		this.modelo = modelo;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public Boolean agregarCarga(Carga carga) throws SobrepesoException {
		if(carga.getPeso() < getPesoMaximo()) {
		this.cargas.add(carga);
		}else {
			throw new SobrepesoException("Sobrepeso");
		}
		return true;
	}

	@Override
	public Integer obtenerCantidadDeCargas() {
		return this.cargas.size();
	}

	

}
