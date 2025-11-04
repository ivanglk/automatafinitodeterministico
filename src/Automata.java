import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//AFD GLINKA & PARRAL
public class Automata {
	private Scanner insertar = new Scanner(System.in);
	private Scanner Longitud = new Scanner(System.in);
	private String ingreso;
	
	public List<String> ListaAutomata(List<String>ListaAlfabeto) {
		List<String>ListaAutomata = new ArrayList<String>();
		try {
			System.out.println("Ingrese longitud de automata: ");
			int longitudEst = Longitud.nextInt(); 
			
			for(int i = 0; i<longitudEst; i++) {
				System.out.println("Ingrese un valor: ");
				ingreso = insertar.nextLine();
				while(!ListaAlfabeto.contains(ingreso)) {
					System.out.println("Error, ese elemento no pertenece al alfabeto.");
					System.out.println("Ingrese otro valor del automata: ");
					ingreso = insertar.nextLine();
				}
				ListaAutomata.add(ingreso);
				
			}
			System.out.println("Automata completo.");
		}catch(Exception e) {
			System.out.println(e);
		}

		return ListaAutomata;
	}

}
