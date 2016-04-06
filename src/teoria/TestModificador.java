package teoria;

import Modificadores.Modificador;

public class TestModificador {
		public static void main(String[] args) {
			Modificador m = new Modificador(1,2,3,4);
			//accedo al valor1 porque es publico
			System.out.println(m.valor1);
			//no accedo al valor2 porque es protected y está a nivel de package
			//System.out.println(m.valor2);
			//no accedo al valor3 por que es (default) y está a nivel de package
			//System.out.println(m.valor3);
			//no puedo accerder al valor4 porque es private
			//System.out.println(m.valor4);
			//los valores se pueden modificar
			m.valor1 *= 2; //no puedo modificar m.valor2 *= 2; m.valor3 *= 2;
			System.out.println(m.valor1);
			//System.out.println(m.valor2);
			//System.out.println(m.valor3);
			//accedo a la variable privada desde un método publico
			System.out.println(m.devolverValorVariablePrivada());
			//no accedo a la variable privada desde un método protected
			//System.out.println(m.devolverValorVariableProtected());
			//no accedo a la variable privada desde un método (default)
			//System.out.println(m.devolverValorVariableDefault());
			//no accedo a la variable privada desde un método privado
			//System.out.println(m.devolverValorVariablePrivado());
		}
}
