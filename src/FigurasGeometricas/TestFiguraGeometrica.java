package FigurasGeometricas;

public class TestFiguraGeometrica {

	public static void main(String[] args) {
		Cuadrado c = new Cuadrado(3);
		Rectangulo r = new Rectangulo(5, 7);
		
		Triangulo t = new TrianguloRectangulo(4, 7);
		Triangulo t1 = new TrianguloEquilatero(5);
		
		System.out.println(c);
		System.out.println(r);
		System.out.println(t);
		System.out.println(t1);
	}

}
