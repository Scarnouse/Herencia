package FigurasGeometricas;

public class Triangulo extends FiguraGeometricas {
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(String nombre, double lado1, double lado2, double lado3) {
		super(nombre , 3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public double getPerimetro(){
		return this.lado1 + this.lado2 + this.lado3;
	}

	@Override
	public String toString() {
		return super.toString() + " de perimetro " + getPerimetro();
	}
	
	
}
