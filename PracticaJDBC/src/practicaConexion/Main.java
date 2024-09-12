/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaConexion;

/**@author Andres_Marulanda*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciamos el objeto para conectarnos a la BBDD.
        ConexionJDBC objetoUsuarios = new ConexionJDBC();
        
        // Llamar el método para la creación de los usuarios.
        objetoUsuarios.crear();
        
        // Llamar el método para cosultar los usuarios y poder validar los cambios.
        objetoUsuarios.consultar();
    }
    
}
