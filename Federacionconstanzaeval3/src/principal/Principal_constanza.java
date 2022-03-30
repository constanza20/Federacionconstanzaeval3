package principal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConexBD;

public class Principal_constanza {

	public static void main(String[] args) {

		Connection conex = null;
		Statement consulta = null;
		ResultSet resultado = null;
		
		try {
		
		conex = ConexBD.establecerConexion();
		String consultaStr1 = "SELECT * FROM Personas";
		if (conex == null)
			conex = ConexBD.getCon();
		consulta = conex.createStatement();
		resultado = consulta.executeQuery(consultaStr1);
		while (resultado.next()) {
			int id = resultado.getInt(1);
			String nombre = resultado.getString(2);
			String telefono = resultado.getString(3);
			String nifnie = resultado.getString(4);
	
		}
	} catch (SQLException e) {
		System.out.println("Se ha producido una Excepcion:" + e.getMessage());
		e.printStackTrace();
	}

}
}
