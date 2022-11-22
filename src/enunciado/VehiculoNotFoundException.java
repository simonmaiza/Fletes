package enunciado;

public class VehiculoNotFoundException extends Exception {

	private String mensaje;

	public VehiculoNotFoundException(String mensaje) {
		this.mensaje = mensaje;
	}

}
