package enunciado;

public class Carga{
	
	protected static String descripcion;
	protected static Double peso;
	public Carga(String descripcion, Double peso) {
		super();
		this.descripcion = descripcion;
		this.peso = peso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	

}
