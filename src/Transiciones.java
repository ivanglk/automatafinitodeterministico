//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
//AFD GLINKA & PARRAL
public class Transiciones {
	private Scanner insertar = new Scanner(System.in);
	private String ingreso;
	
	public HashMap<Integer, String> DiccionarioEstado(List<String> ListaEstado) {
		HashMap<Integer, String>DicEstado = new HashMap<Integer, String>();
		int i = 0;
		try {
		for(int x = 0; x < ListaEstado.size() ;x++) {
			DicEstado.put(i, ListaEstado.get(x));
			i++;
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		return DicEstado;
	}
	
	public HashMap<Integer, String> DiccionarioAlfabeto(List<String> ListaAlfabeto) {
		HashMap<Integer, String>DicAlfabeto = new HashMap<Integer, String>();
		int j = 0;
		
		try {

		for(int x = 0; x < ListaAlfabeto.size() ;x++) {
			DicAlfabeto.put(j, ListaAlfabeto.get(x));
			j++;
			
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		return DicAlfabeto;
	}
	
	public String [][] matrizTransiciones(HashMap<Integer, String> dicEst,HashMap<Integer, String> dicAlf, List<String>ListaEstado){
		
		String [][] matrizTransicion = new String[dicEst.size()][dicAlf.size()];
		try {
		for(int i = 0; i<(dicEst.size()-1);i++) {
			for(int j = 0; j<dicAlf.size();j++) {
				System.out.println("Ingrese estado al que se llega desde " + dicEst.get(i) + " por medio de " + dicAlf.get(j) + ": ");
				ingreso = insertar.nextLine();
				while(!ListaEstado.contains(ingreso)) {
					System.out.println("Error, estado no se encuentra en lista de estados.");
					System.out.println("Ingrese un estado que se encuentre en la lista de estados: ");
					ingreso = insertar.nextLine();
				}
				matrizTransicion[i][j] = ingreso;
				
			}
		}
		System.out.println("Transiciones completas");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return matrizTransicion;
		
	}
	
}
