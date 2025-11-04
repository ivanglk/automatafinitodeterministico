import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
//AFD GLINKA & PARRAL
public class Validar {
	public static <K, V> K getSingleKeyFromValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
	
	public boolean validarAutomata(String [][] matrizTransiciones,HashMap<Integer, String> DiccionarioAlfabeto,HashMap<Integer, String> DiccionarioEstado,List<String> ListaAutomata, String EstadoInicial, List<String> EstadosFinal) {
			Boolean resultado = true;
			System.out.println("Se imprime algunas posiciones de matriz: ");
			System.out.println(matrizTransiciones[0][0]);
			
			String estado = EstadoInicial;
			System.out.println("Imprime key:" + getSingleKeyFromValue(DiccionarioEstado,estado));
			System.out.println("Imprimo estado inicial: " + estado);
			String estadoNuevo = null;
			for (int x = 0;x<ListaAutomata.size();x++) {
				estadoNuevo = matrizTransiciones[getSingleKeyFromValue(DiccionarioEstado,estado)][getSingleKeyFromValue(DiccionarioAlfabeto,ListaAutomata.get(x))];
				System.out.println("Imprimo estado nuevo: " + estadoNuevo);
				if(!estadoNuevo.equals(null)) {
					estado = estadoNuevo;
				}
				else {
					resultado = false;
				}
				System.out.println(resultado);
			}
			int enlista = 0;
			
			for(int j=0;j<EstadosFinal.size();j++) {
				System.out.println("Imprimo for");
				System.out.println("Imprimo estado inicial: " + EstadoInicial);
				System.out.println(estado);
				System.out.println(EstadosFinal.get(j));
				if(EstadosFinal.get(j).equals(estado)) {
					enlista++;
				}
				System.out.println(enlista);
			}
			if(enlista > 0) {
				resultado = true;
			}
			else {
				resultado = false;
			}
			return resultado;
		
	};
	
	
	
	
	
	
	
}
