package FigurasGeometricas;

public class FiguraGeometricas {
	
	private String nombre;
	private int numeroLados;
	
	public FiguraGeometricas(String nombre, int numeroLados) {
		this.nombre = nombre;
		this.numeroLados = numeroLados;
	}
	
	@Override
	public String toString() {
		return "Figura Geometrica: " + nombre + ", con numero de lados " + numeroLados;
	}
	
}
