package Proyecto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import Datos.DatabaseException;
import Datos.ManejadorBaseDatos;

/**
 * Esta clase crea la base de datos, solo debe ser usada 
 * cuando se crea la misma
 * 
 * @author Eduardo
 *
 */
public class CreadorBaseDeDatos {
	
	// El logger
	static Logger log = Logger.getRootLogger();

	
	/**
	 * Al ejecutar este metodo se crea la base de datos. NOTA: solo se puede crear una vez.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try
	    {
			log.info("Creando base de datos");
		
			Connection connection = ManejadorBaseDatos.getConnection();
	
			Statement statement = connection.createStatement();
			
			log.info("Creando tabla ProductoManufacturado");                
	
	        statement.execute("CREATE TABLE ProductoManufacturado(" +
	        		"Id INTEGER PRIMARY KEY not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
	        		"Nombre VARCHAR(100),"+
	            	"Tipo VARCHAR(100),"+
	            	"Descripcion VARCHAR(100), " +
	    			"Costo DOUBLE(5,2))");
	        
	
	        ManejadorBaseDatos.shutdown();
	    }
	    catch(DatabaseException ex)
	    {
	            log.error("Excepcion de la base de datos",ex.getRealException());
	    }
	    catch(SQLException e){
	    	log.error("Excepcion de la base de datos",e);
	    }	
	}

}
