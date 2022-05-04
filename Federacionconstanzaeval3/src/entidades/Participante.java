package entidades;

import java.util.Scanner;

import utils.Utilidades;
import validaciones.Validaciones;

public class Participante {
	protected long id;
	protected int dorsal; // valor entre 001 y 150
	protected char calle;
	protected Tiempo tiempo;
	protected boolean penalizacion;
	protected String otros;
	

	public Participante(long id, int dorsal, char calle) {
		super();
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
	}
	public Participante(long id, int dorsal, char calle,Tiempo tiempo, boolean penalizacion, String otros) {
		super();
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
		this.tiempo=tiempo;
		this.penalizacion=penalizacion;
		this.otros=otros;
	}

	public Participante() {
	}

	
	

	public boolean isPenalizacion() {
		return penalizacion;
	}
	public String getOtros() {
		return otros;
	}

	public Tiempo getTiempo() {
		return tiempo;
	}
	public void setTiempo(Tiempo tiempo) {
		this.tiempo = tiempo;
	}
	public void setPenalizacion(boolean penalizacion) {
		this.penalizacion = penalizacion;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public char getCalle() {
		return calle;
	}

	public void setCalle(char calle) {
		this.calle = calle;
	}

	public static Participante nuevoParticipante() {
		Participante ret = null;

		long id = -1;
		int dorsal =000; 
		char calle=' ';
		Tiempo tiempo= null; 
		boolean penalizacion= false;
		String otros= " ";
		Scanner in;
		boolean valido = false;
		do {
			System.out.println("Introduzca el id del nuevo Participante:");
			in = new Scanner(System.in);
			id = in.nextInt();
			valido = Validaciones.validarId(id);
			if (!valido)
				System.out.println("ERROR: Valor incorrecto para el identificador.");
			else
				valido = true;
		} while (!valido);

		valido = false;
		do {
			System.out.println("Introduzca el numero del dorsal:");
			in = new Scanner(System.in);
			dorsal = in.nextInt();
			valido = Validaciones.validarDorsal(dorsal);
			if (!valido)
				System.out.println("ERROR: Valor incorrecto para el dorsal");
			else
				valido = true;
		} while (!valido);

		valido = false;
		do {
			System.out.println("Introduzca la letra que identifica la calle:");
			in = new Scanner(System.in);
			calle = in.nextLine().charAt(0);
			valido = Validaciones.validarCalle(calle);
			if (!valido)
				System.out.println("ERROR: Valor incorrecto para la calle");
			else
				valido = true;
		} while (!valido);

		valido = false;
		
		System.out.println("Introduzca el tiempo:");
		in = new Scanner(System.in);
		tiempo = Tiempo.nuevoTiempo();

		System.out.println("¿esta penalizado el participante? (pulse 'S' par SÍ o 'N' para No)");
	
		boolean confirmacion = Utilidades.leerBoolean();
		if (confirmacion) {
			do {
				System.out.println(
						"Introduce una descripcion  (hasta 500 caracteres alfabéticos o numéricos solamente):");
				otros = in.nextLine();
				valido = Validaciones.validarotros(otros);
				if (!valido) {
					System.out.println("El valor introducido para el comentario es inválido.");
					continue;
				} else
					valido = true;
			} while (!valido);
		}
		valido = false;
		

		ret = new Participante(id,dorsal,calle,tiempo,penalizacion,otros );
		return ret;
	}
	@Override
	public String toString() {
		return "Participante [id=" + id + ", dorsal=" + dorsal + ", calle=" + calle + ", tiempo=" + tiempo
				+ ", penalizacion=" + penalizacion + ", otros=" + otros + "]";
	}



	
}
