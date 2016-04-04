package FigurasGeometricas;

public class TrianguloEquilatero extends Triangulo {
	
	private double lado;

	public TrianguloEquilatero(double lado) {
		super("Triangulo Equilatero",lado, lado, lado);
		this.lado = lado;
	}
	
	public double getArea(){
		return (Math.sqrt(3)/4)*Math.pow(lado, 2);
	}

	@Override
	public String toString() {
		return super.toString() + " de lado " + this.lado + " y de área " + this.getArea();
	}
	
	
}
