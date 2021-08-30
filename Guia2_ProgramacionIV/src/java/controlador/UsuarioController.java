
package controlador;

import conexion.Conexion;
import dao.UsuarioDao;
import java.util.List;
import java.util.Scanner;
import modelo.Usuario;


public class UsuarioController {
    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         Usuario user = new Usuario(0);
         Conexion conn = new Conexion();
         UsuarioDao userD = new UsuarioDao(conn);
         java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        user.setFecha_creacion(sqlDate);
        
        
        System.out.println("Ingrese el nombre");
        user.setNombre(scan.next());
        System.out.println("Ingrese el apellido");
        user.setApellido(scan.next());
        System.out.println("Ingrese el telefono");
        user.setTelefono(scan.nextInt());
        System.out.println("Ingrese la fecha de creacion "+sqlDate);
        
        boolean respuesta = userD.insertar(user);
        
          if (respuesta) {
            System.out.println("Su registro fue guardado con exito");
        } else {
            System.out.println("error al guardar registro");
        }
        List<Usuario> list = userD.selectAll();
        for (Usuario user2 : list) {
            System.out.println("------------------------------------------");
            System.out.println("el id del libro es : " + user2.getId_user());
            System.out.println("el nombre del libro es : " + user2.getNombre());
            System.out.println("la fecha de ingreso es : " + user2.getApellido());
            System.out.println("la categoria del libro es : " + user2.getTelefono());
            System.out.println("el stock del libro: " + user2.getFecha_creacion());
            
        }
        
    }
    
}
