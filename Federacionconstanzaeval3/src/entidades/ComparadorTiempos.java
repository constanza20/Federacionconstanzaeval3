package entidades;

import java.util.Comparator;

public class ComparadorTiempos implements Comparator<Tiempo>  {

	@Override
	public int compare(Tiempo o1, Tiempo o2) {
		return Integer.parseUnsignedInt(String.valueOf(o1.getHora() - (o2.getHora())));
	}

	

}
