package FigurasGeometricas;
import FigurasGeometricas.FiguraGeometricas;

public class Cuadrilatero extends FiguraGeometricas {
	
	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	
	public Cuadrilatero(String nombre, int lado1, int lado2, int lado3, int lado4) {
		super(nombre, 4);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public int getPerimetro(){
		return this.lado1+ this.lado2 + this.lado3 + this.lado4;
	}

	@Override
	public String toString() {
		return super.toString() + " con perimetro " + this.getPerimetro();
	}
	
}
