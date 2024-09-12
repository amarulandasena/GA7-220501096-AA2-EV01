/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaConexion;

/**@author Andres_Marulanda*/

// Importamos el paquete que contiene las clases e interfaces necesarias para la conexión.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConexionJDBC {
    
    // Atributos de la clase.
    private String url = "jdbc:mysql://localhost:3306/ga7_220501096_aa2_ev01";
    private String user = "root";
    private String password = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conectar;
    private Statement statement;
    private ResultSet rs;

    // Constructor.
    public ConexionJDBC() {
        
        try {
            // Instanciamos y cargamos el driver en memoria.
            Class.forName(driver);
            
            // Instanciamos el objeto conexión con la cadena de conexión.
            conectar = DriverManager.getConnection(url, user, password);
            
            // Instanciamos el objeto statement para realizar las consultas SQL.
            statement = conectar.createStatement();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // Método para crear los usuarios.
    public void crear () {
        try{
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    // Método para modificar los usuarios.
    public void modificar () {
        try{
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    // Método para eliminar usuarios.
    public void eliminar () {
        try{
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    // Método para consultar usuarios.
    public void consultar () {
        try{
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    
}
