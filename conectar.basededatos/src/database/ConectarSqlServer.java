package database;

import java.sql.*;

import org.testng.annotations.Test;


public class ConectarSqlServer {

	@Test
	public void testBD() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	
		System.out.println("Driver cargado");
	
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=Northwind;integratedSecurity=true;");
	
		System.out.println("Conectando con mi base de datos SqlServer\n\n");
	
		Statement stm = con.createStatement();
	
		ResultSet rs = stm.executeQuery("select * from dbo.Categories where CategoryName ='Beverages'");
		ResultSetMetaData rsmd = rs.getMetaData() ;
	
			while (rs.next()) {
		
				String CategoryName = rs.getString("CategoryName");
				String Description = rs.getString("Description");
				
					
					System.out.println( " | " + CategoryName +  "  | " + Description + " | "); 
			
			}
			
			
			
			/* Para obtener numerp de columnas de 
			 * while (rs.next()) {
				int i = rsmd.getColumnCount() ;
				
				System.out.println("La tabla tiene " + i + " columnas " ) ;
				
			} */
							
}
}
