package enunciado;

public class SobrepesoException extends Exception {

	private String mensaje;

	public SobrepesoException(String mensaje) {
		this.mensaje = mensaje;
	}

}
