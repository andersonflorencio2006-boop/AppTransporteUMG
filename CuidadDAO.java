
package umg.DAO;
import umg.modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException
import java.sql.Statement;

import java.util.List;
import java.util.ArrayList;

public class CuidadDAO {
    public void insertar (Cuidad ciudad) throws SQLException{
       
        String sql = "INSERT INTO ciudad (Nombre) VALUES (?)";
        
        try (Connection cn = ConexionDB.abrir();
                      PreparedStatement ps = cn.prepareStatement (sql)) {
            
            ps.setString(1, cuidad.getNombre());
            
            int filas = ps.executeUpdate();
            if (filas = 0) {
                throw new SWLException("No se pudo insertar el registro.");
            }
            
        }
    }
}
