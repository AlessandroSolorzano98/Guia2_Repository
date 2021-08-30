
package dao;

import conexion.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.Usuario;


public class UsuarioDao {
    
    Conexion conn;
    
    public UsuarioDao(Conexion conn){
        this.conn = conn;
    }
    
    public boolean insertar (Usuario user){
        
        String sql = "insert into usuario values (?,?,?,?,?)";
        try {
              PreparedStatement ps = conn.conectar().prepareStatement(sql);
              ps.setInt(1, user.getId_user());
              ps.setString(2, user.getNombre());
              ps.setString(3, user.getApellido());
              ps.setInt(4, user.getTelefono());
              ps.setDate(5, (Date) user.getFecha_creacion());
              ps.executeUpdate();
              return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public List<Usuario> selectAll(){
        
        String sql = "select * from usuario";
        
        try {
             PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Usuario user;
            List<Usuario> lista = new LinkedList<>();
            while(rs.next()){
                user = new Usuario(rs.getInt("id_user"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setTelefono(rs.getInt("telefono"));
                user.setFecha_creacion(rs.getDate("fecha_creacion"));
                lista.add(user);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    
}
