package entidades;

import java.time.LocalTime;
import java.util.Scanner;

import utils.Utilidades;
import validaciones.Validaciones;

public class Responsable {
	

	private long id;
	private String telefonoProf;
	private LocalTime horarioIni;
	private LocalTime horarioFin;
	
	private DatosPersona persona;

	public Responsable() {

	}

	public Responsable(long id, String telefonoProf, LocalTime horarioIni, LocalTime horarioFin) {
		super();
		this.id = id;
		this.telefonoProf = telefonoProf;
		this.horarioIni = horarioIni;
		this.horarioFin = horarioFin;
	}
	
	
	
	
	public Responsable(Responsable entResponsable) {

		this.id = entResponsable.id;
		this.telefonoProf = entResponsable.telefonoProf;
		this.horarioIni = entResponsable.horarioIni;
		this.horarioFin = entResponsable.horarioFin;

	}
	

	public long getId() {
		return id;
	}

	public String getTelefonoProf() {
		return telefonoProf;
	}

	public LocalTime getHorarioIni() {
		return horarioIni;
	}

	public LocalTime getHorarioFin() {
		return horarioFin;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTelefonoProf(String telefonoProf) {
		this.telefonoProf = telefonoProf;
	}

	public void setHorarioIni(LocalTime horarioIni) {
		this.horarioIni = horarioIni;
	}

	public void setHorarioFin(LocalTime horarioFin) {
		this.horarioFin = horarioFin;
	}

	public static Responsable nuevoResponsable() {
		Responsable ret = null;
		long id = -1;
		String telefonoProf = "";
		Scanner in;
		boolean valido = false;
		do {
			System.out.println("Introduzca el id del nuevo Responsable:");
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
			System.out.println("Introduzca el telefono");
			telefonoProf = in.nextLine();
			valido = Validaciones.validarTelefono(telefonoProf);
			if (!valido)
				System.out.println("ERROR: El valor introducido para el telefono no es válido.");
		} while (!valido);
		valido = false;
		System.out.println("Introduzca el tiempo del horario inicial");
		LocalTime time = Utilidades.leerHora();
		System.out.println("Introduzca el tiempo del horario final");
		LocalTime time2 = Utilidades.leerHora();

		ret = new Responsable(id, telefonoProf, time, time2);

		return ret;

	}
	
	
	@Override
	public String toString() {
		return "" + id + ". " + persona.getNombre() + " (" + persona.getNifnie().mostrar() + ")" + " horario de:" + 
				+ this.getHorarioIni().getHour() + this.getHorarioFin().getHour();
	}
	
	
	
	public String data() {
		return "" + this.getId() + persona.getId() + "|" + this.getTelefonoProf()+ "|"  
		+ this.getHorarioIni() + "|" + this.getHorarioFin(); 
	}
	
	
	
	

}
