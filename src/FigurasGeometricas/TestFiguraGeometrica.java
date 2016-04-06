package FigurasGeometricas;

public class TestFiguraGeometrica {

	public static void main(String[] args) {
		FiguraGeometricas c = new Cuadrado(3);
		FiguraGeometricas r = new Rectangulo(5, 7);
		
		FiguraGeometricas t = new TrianguloRectangulo(2, 3);
		FiguraGeometricas t1 = new TrianguloEquilatero(2);
		
		System.out.println(c);
		System.out.println(r);
		System.out.println(t);
		System.out.println(t1);
		System.out.println(Triangulo.numeroTriangulos);
		System.out.println(Cuadrilatero.numeroCuadrilateros);
	}

}
