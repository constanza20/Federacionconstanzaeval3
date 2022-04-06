package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import utils.Utilidades;
import validaciones.Validaciones;

public class Patrocinador {
	
	private long idPatrocinador;
	private String nombre;
	private String web;
	private double dotacion;
	
	
	private Responsable responsable;

	public Patrocinador() {

	}

	public Patrocinador(long id, String nombre, String web, double dotacion) {

		super();
		this.idPatrocinador = idPatrocinador;
		this.nombre = nombre;
		this.web = web;
		this.dotacion = dotacion;

	}
	
	
	
	public Patrocinador(Patrocinador entPatrocinador) {

		this.idPatrocinador = entPatrocinador.idPatrocinador;
		this.nombre = entPatrocinador.nombre;
		this.web = entPatrocinador.web;
		this.dotacion = entPatrocinador.dotacion;

	}

	

	public long getIdPatrocinador() {
		return idPatrocinador;
	}

	public void setIdPatrocinador(long idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}

	public String getNombre() {
		return nombre;
	}

	public String getWeb() {
		return web;
	}

	public double getDotacion() {
		return dotacion;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public void setDotacion(double dotacion) {
		this.dotacion = dotacion;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public static Patrocinador nuevoPatrocinador() {
		Patrocinador ret = null;
		long id = -1;
		String nombre = "";
		String web = "";
		double dotacion = 0.0;

		Scanner in;
		boolean valido = false;
		do {
			System.out.println("Introduzca el id del nuevo Patrocinador:");
			in = new Scanner(System.in);
			id = in.nextInt();
			if (id > 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para el identificador.");
		} while (!valido);

		valido = false;
		do {
			in = new Scanner(System.in);
			System.out.println("Introduzca el telefono de empresa del nuevo Patrocinador");
			nombre = in.nextLine();
			valido = Validaciones.validarNombre(nombre);
			if (!valido)
				System.out.println("ERROR: El valor introducido para el nombre no es válido.");
		} while (!valido);

		valido = false;
		do {
			in = new Scanner(System.in);
			System.out.println("Introduzca la dirección del nuevo Patrocinador:");
			web = in.next();
			valido = Validaciones.validarweb(web);
			if (!valido)
				System.out.println("ERROR: El valor introducido para la dirección no es válido.");
		} while (!valido);
		valido = false;
		do {
			System.out.println("Introduzca un valor decimal (xx.xx)");
			in = new Scanner(System.in, "ISO-8859-1");
			try {
				dotacion = in.nextDouble();
				valido = true;
			} catch (InputMismatchException ime) {
				System.out.println("Formato introducido incorrecto.");
				valido = false;
			}
		} while (!valido);

		ret = new Patrocinador(id, nombre, web, dotacion);
		return ret;
	}
	
	
	
	
	public void mostrarBasico() {
		System.out.println(""+ idPatrocinador + nombre + web);
	}



	public void mostrarCompleto() {
		System.out.println(""+ idPatrocinador + nombre + web + dotacion + "(xx.xx euros)" + responsable.data() );
	}
	
	

	
	public String data() {
		return "" + this.getIdPatrocinador() + responsable.getId() + "|" + this.getNombre()+ "|"  
		+ this.getDotacion() + "|" + this.getWeb(); 
	}
	
	
	
	
	
}
