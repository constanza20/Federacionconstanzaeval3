package entidades;

import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Tiempo implements Comparable <Tiempo> {
	private int hora;
	private int minutos;
	private int segundos;
	private int centesimas;
	
	
	public Tiempo() {
	}

	public Tiempo(int hora, int minutos, int segundos, int centesimas) {
		super();
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
		this.centesimas = centesimas;

	}

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public int getCentesimas() {
		return centesimas;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void setCentisimas(int centesimas) {
		this.centesimas = centesimas;
	}

	@Override
	public String toString() {

		return "" + hora +  ":" + minutos + ":" + segundos + "," + centesimas ;
	}
	
	
	
	public static Tiempo nuevoTiempo() {
		Tiempo ret = null;
		int hora;
		int minutos;
		int segundos;
		int centesimas;
		Scanner in;
		boolean valido = false;
		do {
			System.out.println("Introduzca la hora:");
			in = new Scanner(System.in);
			hora = in.nextInt();
			if (hora >= 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para la hora.");
		} while (!valido);

		valido = false;
		do {
			System.out.println("Introduzca los minutos:");
			in = new Scanner(System.in);
			minutos = in.nextInt();
			if (minutos >= 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para los minutos");
		} while (!valido);

		valido = false;
		do {
			System.out.println("Introduzca los segundos:");
			in = new Scanner(System.in);
			segundos = in.nextInt();
			if (segundos >= 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para los segundos");
		} while (!valido);

		valido = false;
		do {
			System.out.println("Introduzca las centesimas:");
			in = new Scanner(System.in);
			centesimas = in.nextInt();
			if (centesimas >= 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para las centesimas");
		} while (!valido);

		valido = false;

	

		ret = new Tiempo(hora, minutos, segundos, centesimas);
		return ret;
	}

	@Override
	public int compareTo(Tiempo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
}
