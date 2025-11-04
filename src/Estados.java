import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//AFD GLINKA & PARRAL
public class Estados {
	private Scanner insertar = new Scanner(System.in);
	private Scanner Longitud = new Scanner(System.in);
	private String ingreso;
	
	public List<String> Estado() {
		List<String>ListaEstado = new ArrayList<String>();
		try {
			System.out.println("Ingrese cantidad de estados: ");
			int longitudEst = Longitud.nextInt(); 
			
			for(int i = 0; i<longitudEst; i++) {
				System.out.println("Ingrese un estado: ");
				ingreso = insertar.nextLine();
				ListaEstado.add(ingreso);
				
			}
			ListaEstado.add("");
			System.out.println("Lista Estados completa.");
		}catch(Exception e) {
			System.out.println(e);
		}

		return ListaEstado;
	}
}
