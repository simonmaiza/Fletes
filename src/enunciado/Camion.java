package enunciado;

public class Camion extends Vehiculo {
	private Boolean tieneAcoplado;

	
	public Camion(String patente, String nombreTitular, String apellidoTitular, Double pesoMaximo,
			Boolean tieneAcoplado) {
		super(patente, nombreTitular, apellidoTitular, pesoMaximo);
		this.tieneAcoplado=tieneAcoplado;
	}

	/* Los camiones con acoplados soportan el doble de su pesoMaximo y si no tienen acoplados soportan
	 * hasta el pesoMaximo
	 */

	public Boolean getTieneAcoplado() {
		return tieneAcoplado;
	}


	public void setTieneAcoplado(Boolean tieneAcoplado) {
		this.tieneAcoplado = tieneAcoplado;
	}

	@Override
	public Boolean agregarCarga(Carga carga) throws SobrepesoException {
		if(tieneAcoplado == true && carga.getPeso() < getPesoMaximo()*2) {
			this.cargas.add(carga);
		}else if(tieneAcoplado == false && carga.getPeso() <= getPesoMaximo()) {
			this.cargas.add(carga);
		return true;
	}
		return null;
	}
	@Override
	public Integer obtenerCantidadDeCargas() {
		return this.cargas.size();
	}


	



}
