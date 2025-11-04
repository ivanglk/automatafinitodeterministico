import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//AFD GLINKA & PARRAL
public class EstadoFinal {
	
	private Scanner insertar = new Scanner(System.in);
	private Scanner Longitud = new Scanner(System.in);
	private String ingreso;
	
	public List<String> EstadosFinal(List<String>ListaEstado) {
		List<String>ListaEstadoFinal = new ArrayList<String>();
		try{
			System.out.println("Ingrese cantidad de estados finales: ");
			int longitudEF = Longitud.nextInt(); 
			for(int i = 0; i<longitudEF; i++) {
				System.out.println("Ingrese un estado final: ");
				ingreso = insertar.nextLine();
				while(!ListaEstado.contains(ingreso)) {
					System.out.println("Error, estado no se encuentra en lista de estados.");
					System.out.println("Ingrese un estado final: ");
					ingreso = insertar.nextLine();
				}
				
				ListaEstadoFinal.add(ingreso);
				
			}
			System.out.println("Estados finales completo");
		
		}catch(Exception e) {
			System.out.println(e);
		}
		return ListaEstadoFinal;
	}
	
	
}
