import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//AFD GLINKA & PARRAL
public class Alfabeto {
	
	private Scanner insertar = new Scanner(System.in);
	private Scanner Longitud = new Scanner(System.in);
	private String ingreso;
	
	public List<String> Alfabetos() {
		List<String>ListaAlfabeto = new ArrayList<String>();
		try {
		System.out.println("Ingrese longitud del alfabeto: ");
		int longitudAlf = Longitud.nextInt(); 
		
		for(int i = 0; i<longitudAlf; i++) {
			System.out.println("Ingrese un valor del alfabeto: ");
			ingreso = insertar.nextLine();
			ListaAlfabeto.add(ingreso);
			
		}
		
		System.out.println("Lista Alfabeto Completa");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ListaAlfabeto;
	}
	
}
