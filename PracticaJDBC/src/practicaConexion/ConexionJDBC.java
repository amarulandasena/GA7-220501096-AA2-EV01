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
            
            // Instanciamos el objeto Connection con la cadena de conexión.
            conectar = DriverManager.getConnection(url, user, password);
            
            // Instanciamos el objeto Statement para realizar las consultas SQL.
            statement = conectar.createStatement();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // Método para crear los usuarios.
    public void crear () {
        try{
            String query = "INSERT INTO usuarios VALUES ('14785', 'Julian', 'Carmona', 'Segregador', 'jcx137')";
            
            // Ya que esta es una consulta que no retornará ninúgn dato, usamos el Statement ExcuteUpdate.
            statement.executeUpdate(query);
            
            // Generamos un mensaje que nos indique que el usuario fue creado correctamente.
            System.out.println("Usuario creado exitosamente \n");
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    // Método para modificar los usuarios.
    public void modificar () {
        try{
            // Instanciar una variable para la madificación de cada uno de los datos.
            String queryNombres = "UPDATE usuarios SET nombres = 'Juan Camilo' WHERE numIdentificacion = '12345'";
            statement.executeUpdate(queryNombres);
            
            String queryApellidos = "UPDATE usuarios SET apellidos = 'Pulido' WHERE numIdentificacion = '13579'";
            statement.executeUpdate(queryApellidos);
            
            String queryRol = "UPDATE usuarios SET rol = 'Gerente retail' WHERE numIdentificacion = '67890'";
            statement.executeUpdate(queryRol);
            
            String queryContrasegna = "UPDATE usuarios SET contrasegna = 'jcx147' WHERE numIdentificacion = '14785'";
            statement.executeUpdate(queryContrasegna);
            
            // Generamos un mensaje que nos indique que el usuario fue actualizado correctamente.
            System.out.println("Usuario actualizado exitosamente \n");
  
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    // Método para eliminar usuarios.
    public void eliminar () {
        try{
            String query = "DELETE FROM usuarios WHERE numIdentificacion = '12345'";
            
            // executeUpdtae ejecuta las consultas SQL para INSERT, UPDATE y DELETE.
            statement.executeUpdate(query);
            
            // Generamos un mensaje que nos indique que el usuario fue eliminado correctamente.
            System.out.println("Usuario eliminado exitosamente \n");
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    // Método para consultar usuarios.
    public void consultar () {
        try{
            // Instanciamos la variable para crear la consulta.
            String query = "SELECT * FROM usuarios";
            
            // Utilizamos el método executeQuery de la interfaz statement ya que este nos retorna los datos de la tabla.
            rs = statement.executeQuery(query);
            
            // Creamos un ciclo para poder iterar en todos los registros de la tabla.
            while (rs.next()) {
                
                String id = rs.getString("numIdentificacion");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String rol = rs.getString("rol");
                // String contrasegna = rs.getString("contrasegna");
                
                // Imprimimos en la consola cada uno de los registros.
                System.out.println("Número de identificación: " + id + "\n" + 
                                   "Nombres: " + nombres + "\n" + 
                                   "Apellidos: " + apellidos + "\n" + 
                                   "Rol: " + rol + "\n");
            }
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    
}
