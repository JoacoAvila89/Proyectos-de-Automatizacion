package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
public class ConectarMysql {
	
	@Test
	public void testBD() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
	
		System.out.println("Driver cargado");
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libreria_cf", "root", "1989ingeniero+");
	
		System.out.println("Conectando con mi base de datos Mysql");
	
		Statement stm = con.createStatement();
	
		ResultSet rs = stm.executeQuery("select * from autores");
	
			while (rs.next()) {
		
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				
					System.out.println(nombre + " " + apellido);
			}
																 
	} 
	
		
}
