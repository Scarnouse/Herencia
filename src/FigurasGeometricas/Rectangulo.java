package FigurasGeometricas;

public class Rectangulo extends Cuadrilatero {
	
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		super("Rectangulo", base, altura, base, altura);
		this.base = base;
		this.altura = altura;
	}
	
	public int getArea(){
		return this.base*this.altura;
	}

	@Override
	public String toString() {
		return super.toString() + " de área " + this.getArea() + " de base " + this.base + " y altura " + this.altura;
	}
	
		
	
}
