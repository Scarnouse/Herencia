import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPersona {

	public static void main(String[] args) {
		
		Set<Persona> sPersona = new HashSet<Persona>();
		List<Persona> lPersona = new ArrayList<Persona>();
		
		Persona p1 = new Persona("12345", 32, "Sofia");
		Persona p2 = new Persona("12374", 6, "Laura");
		Persona p3 = new Persona("12785", 67, "Viernes");
		Persona p4 = new Persona("12345", 32, "Sofia");
		Persona p5 = new Persona("39732", 74, "Julian");
		Persona p6 = new Persona("12383", 22, "Benito");
		Persona p7 = new Persona("12345", 12, "Helena");
		Persona p8 = new Persona("45975", 18, "Gabriel");
		
		sPersona.add(p1); lPersona.add(p1);
		sPersona.add(p2); lPersona.add(p2);
		sPersona.add(p3); lPersona.add(p3);
		sPersona.add(p4); lPersona.add(p4);
		sPersona.add(p5); lPersona.add(p5);
		sPersona.add(p6); lPersona.add(p6);
		sPersona.add(p7); lPersona.add(p7);
		sPersona.add(p8); lPersona.add(p8);
		sPersona.add(p5); lPersona.add(p5);
		
		System.out.println("Numero personas en Set: "+sPersona.size());
		System.out.println("Numero personas en List: "+lPersona.size());
		
		
	}

}
