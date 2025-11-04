import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//AFD GLINKA & PARRAL
public class Main {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner insertar = new Scanner(System.in);
		Alfabeto IngresoAlf = new Alfabeto();
		EstadoFinal EstadoFin = new EstadoFinal();
		Estados ListEstado = new Estados();
		Transiciones MatrizTrans = new Transiciones();
		Automata ListaAutomata = new Automata();
		Validar validarAutomata = new Validar();
		
		
		//Construction automata.
		System.out.println("¡Bienvenido!");
		List<String> ListaAlfabeto = IngresoAlf.Alfabetos();
		List<String> ListaEstado = ListEstado.Estado();
		List<String> ListEstFin = EstadoFin.EstadosFinal(ListaEstado);
		HashMap<Integer, String> DicAlf = MatrizTrans.DiccionarioAlfabeto(ListaAlfabeto);
		HashMap<Integer, String> DicEst = MatrizTrans.DiccionarioEstado(ListaEstado);
		
		String [][] MatrizTransicion = MatrizTrans.matrizTransiciones(DicEst, DicAlf, ListaEstado);
		
		System.out.println("Ingrese estado inicial: ");
		try{
			boolean continuar = true;
			String EstadoInicial = insertar.nextLine();
			while((!ListaEstado.contains(EstadoInicial))||((EstadoInicial == "")&&(ListaEstado.contains(EstadoInicial)))) {
				System.out.println("Error, estado no se encuentra en lista de estados.");
				System.out.println("Ingrese el estado inicial: ");
				EstadoInicial = insertar.nextLine();
			}
			
			while(continuar == true) {
				System.out.println("Ingreso automata a validar ");
				List<String> ListAuto = ListaAutomata.ListaAutomata(ListaAlfabeto);
			
				System.out.println("Se procede a validar automata");
				boolean validado = validarAutomata.validarAutomata(MatrizTransicion, DicAlf, DicEst, ListAuto, EstadoInicial, ListEstFin);
				if(validado == true) {
					System.out.println("Pertenece al automata!");
				}else {
					System.out.println("No pertenece al automata!");
				}
				System.out.println("Desea continuar? (n/s)");
				String respuesta =  insertar.nextLine();
				if (respuesta.equalsIgnoreCase("n")) {
					System.out.println("¡Hasta Luego!");
					continuar = false;
				}
				else if(respuesta.equalsIgnoreCase("s")) {
					System.out.println("Se continua con ingreso de automata");
					continuar = true; 
				}
				else {
					System.out.println("Ingreso equivocado, se sale del programa.");

					continuar = false;
				}	
					
			}
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Se sale del programa, automata no válido");
		}
		
		
	}

}
