package teoria;

import Modificadores.Modificador;

public class TestModificador2 extends Modificador{
	public TestModificador2(int valor1, int valor2, int valor3, int valor4) {
		super(valor1, valor2, valor3, valor4);
	}

	public static void main(String[] args) {
		TestModificador2 m = new TestModificador2(1,2,3,4);
		//accedo al valor1 porque es publico
		System.out.println(m.valor1);
		//accedo al valor2 porque es protected y está a nivel de package
		System.out.println(m.valor2);
		//no accedo al valor3 por que es (default) y está a nivel de package
		//System.out.println(m.valor3);
		//no puedo accerder al valor4 porque es private
		//System.out.println(m.valor4);
		//los valores se pueden modificar
		m.valor1 *= 2;m.valor2 *= 2; //no puedo modificar  m.valor3 *= 2;
		System.out.println(m.valor1);
		System.out.println(m.valor2);
		//System.out.println(m.valor3);
		//accedo a la variable privada desde un método publico
		System.out.println(m.devolverValorVariablePrivada());
		//accedo a la variable privada desde un método protected
		System.out.println(m.devolverValorVariableProtected());
		//no accedo a la variable privada desde un método (default)
		//System.out.println(m.devolverValorVariableDefault());
		//no accedo a la variable privada desde un método privado
		//System.out.println(m.devolverValorVariablePrivado());
	}
}
