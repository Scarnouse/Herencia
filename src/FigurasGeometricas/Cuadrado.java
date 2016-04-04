package FigurasGeometricas;

public class Cuadrado extends Cuadrilatero {
	
	private int lado;
	
	public Cuadrado(int lado) {
		super("Cuadrdado", lado, lado, lado, lado);
		this.lado = lado;
	}
	
	public int getArea(){
		return this.lado*this.lado;
	}

	@Override
	public String toString() {
		return super.toString() + " de área " + this.getArea() + " y de lado " + this.lado;
	}
	
	
	
}
