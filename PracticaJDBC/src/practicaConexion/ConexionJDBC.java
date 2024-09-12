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
    
}
