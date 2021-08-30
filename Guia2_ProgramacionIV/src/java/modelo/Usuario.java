
package modelo;

import java.sql.Date;


public class Usuario {
    
  private int id_user;
  private String nombre;
  private String apellido;
  private int telefono;
  private Date fecha_creacion;

    public Usuario(int id_user) {
       this.id_user = id_user;
    }

  
  
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_cracion) {
        this.fecha_creacion = fecha_cracion;
    }
   
    
}
