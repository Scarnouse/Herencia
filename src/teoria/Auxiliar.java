package teoria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Auxiliar {
	private static File archivo = new File("recursos/motocicletas.csv");
	static public boolean guardar(List<Motocicleta> lista){
		boolean validado = false;
		try (PrintWriter pWriter = new PrintWriter(new FileWriter(archivo));){
			pWriter.printf("%s, %s, %s, %s, %s%n","PROPIETARIO","NUMERO DE PASAJEROS","CILINDRADA","FECHA COMPRA","PASAJEROS");
			for (int i = 0; i < lista.size(); i++) {
				pWriter.printf("%s, %s, %s, %s, %s%n",lista.get(i).getPropietario(),lista.get(i).getNumeroPasajeros(),lista.get(i).getCilindrada(),lista.get(i).getFechaCompra(),lista.get(i).getNumeroRuedas());
				pWriter.flush();
				validado = true;
			}
			//lógica de extracción de datos de la lista
			//y escritura en 'archivo'
		} catch (IOException e) {
			System.err.println("Error de escritura");
		}
		return validado;
		
	}
}
