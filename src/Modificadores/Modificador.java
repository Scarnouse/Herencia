package Modificadores;

public class Modificador {
	
	public int valor1;
	protected int valor2;
	int valor3;
	private int valor4;
	
	public Modificador(int valor1, int valor2, int valor3, int valor4) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}
	//método con modificador público
	public int devolverValorVariablePrivada(){
		return this.valor4;
	}
	//método con modificador protected
	protected int devolverValorVariableProtected(){
		return this.valor4;
	}
	//método con modificador (default)
	int devolverValorVariableDefault(){
		return this.valor4;
	}
	//método con modificaodr private
	private int devolverValorVariableConPrivado(){
		return this.valor4;
	}
	
	
}
