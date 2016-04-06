package Ejercicios;

public class PruebaInformaticos {

	public static void main(String[] args) {
		
		InformaticoAbs iA1 = new Analista("Esija Informática", "Auditor");
		InformaticoAbs iA4 = new Programador("Ciset", "Python");
		
		iA1.setSueldo(9.4);
		System.out.println(iA1);
		System.out.println(iA1.pagarSueldo(15));
		
		iA4.setSueldo(1.9);
		System.out.println(iA4);
		System.out.println(iA4.pagarSueldo(16));
		
		iA1.setEmpresa("Ofimática");
		iA1.setSueldo(9.3);
		System.out.println(iA1);

	}

}
