package FigurasGeometricas;

public class TrianguloRectangulo extends Triangulo {
	
	public double cateto1;
	public double cateto2;
	
	public TrianguloRectangulo(double cateto1, double cateto2) {
		super("Triangulo Rectangulo",cateto1, cateto2, Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2)));
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public double getArea(){
		return (this.cateto1*this.cateto2)/2;
	}

	@Override
	public String toString() {
		return super.toString() + " de catetos " + cateto1 + ", " + cateto2 + " e hipotenusa " + Math.sqrt(Math.pow(this.cateto1, 2)+Math.pow(this.cateto2, 2)) +" y área " + this.getArea();
	}
	
	
	
}
