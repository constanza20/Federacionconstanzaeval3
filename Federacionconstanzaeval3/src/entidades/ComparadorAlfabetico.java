package entidades;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import utils.Datos;

public class ComparadorAlfabetico implements Comparator<DatosPersona>{
	
	@Override
	public int compare(DatosPersona o1, DatosPersona o2) {
		return 0;

	}

	public void nombreOrdenAlfa() {
		LinkedList<DatosPersona> ret = new LinkedList<DatosPersona>();
		for (DatosPersona n : Datos.PERSONAS) {
			ret.add(n);
		}
		for (DatosPersona n : Datos.PERSONAS) {
			ret.add(n);
		}
		Collections.sort(ret, new ComparadorAlfabetico());
		System.out.println("La lista de los nombres ordenados alfabeticamente:");
		Iterator<DatosPersona> it = ret.iterator();
		int i = 1;
		while (it.hasNext()) {
			System.out.println(i + ": " + ((DatosPersona)it.next()).toString() + " ");
			i++;
		}
	}









}
