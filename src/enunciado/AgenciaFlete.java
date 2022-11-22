package enunciado;

import java.util.HashSet;
import java.util.Set;

import enunciado.Vehiculo;
import enunciado.VehiculoNotFoundException;

public class AgenciaFlete extends Carga {

	private Set<Vehiculo> flota;

	public AgenciaFlete() {
		super(descripcion, peso);
		this.flota = new HashSet<Vehiculo>();
	}

	// Agrega Un vehiculo a la flota
	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		this.flota.add(vehiculo);
		if (this.flota.contains(vehiculo))
			return true;
		return true;

	}

	// * Busca Un vehiculo por patente y si no lo encuentra devuelve
	// VehiculoNotFoundException
	public Vehiculo buscarVehiculo(String patente) throws VehiculoNotFoundException {
		for (Vehiculo it : flota) {
			if (it.getPatente().equals(patente)) {
				return it;
			}
		}
		throw new VehiculoNotFoundException("Vehiculo no encontrado");
	}

	public void descargarCargasVehiculo(String patente) throws VehiculoNotFoundException {
		Vehiculo vehiculo = this.buscarVehiculo(patente);
		vehiculo.getCargas().clear();
	}

	// Transfiere todas las carga de un vehiculo
	public Boolean moverCargaDeUnVehiculoAOtro(String patenteOrigen, String patenteDestino, Carga carga1)
			throws VehiculoNotFoundException, SobrepesoException {
		Vehiculo origen = buscarVehiculo(patenteOrigen);
		Vehiculo destino = buscarVehiculo(patenteDestino);
		descargarCargasVehiculo(patenteOrigen);
		for (Vehiculo vehiculo : flota) {
			if (vehiculo.getPatente().equals(patenteDestino)) {
				vehiculo.agregarCarga(carga1);
			}
		}
		return null;

	}

	public Set<Vehiculo> getFlota() {
		return flota;
	}

	public void setFlota(Set<Vehiculo> flota) {
		this.flota = flota;
	}
}
