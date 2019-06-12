package aplicacion.modelo.dominio;
// Generated 08/06/2019 20:22:06 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private TipoUsuario tipoUsuario;
     private String nombre;
     private String apellido;
     private String username;
     private String password;
     private String correo;
     private String dni;
     private Date fechaDeNacimiento;
     private Boolean estado;
     private Set ventasForCliente = new HashSet(0);
     private Set ventasForVendedor = new HashSet(0);

    public Usuario() {
    }

    public Usuario(TipoUsuario tipoUsuario, String nombre, String apellido, String username, String password, String correo, String dni, Date fechaDeNacimiento, Boolean estado) {
       this.tipoUsuario = tipoUsuario;
       this.nombre = nombre;
       this.apellido = apellido;
       this.username = username;
       this.password = password;
       this.correo = correo;
       this.dni = dni;
       this.fechaDeNacimiento = fechaDeNacimiento;
       this.estado = estado;
    }
    public Usuario(Set ventasForCliente, Set ventasForVendedor, TipoUsuario tipoUsuario, String nombre, String apellido, String username, String password, String correo, String dni, Date fechaDeNacimiento, Boolean estado) {
       this.tipoUsuario = tipoUsuario;
       this.nombre = nombre;
       this.apellido = apellido;
       this.username = username;
       this.password = password;
       this.correo = correo;
       this.dni = dni;
       this.fechaDeNacimiento = fechaDeNacimiento;
       this.estado = estado;
       this.ventasForCliente = ventasForCliente;
       this.ventasForVendedor= ventasForVendedor;
    }
    
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public Set getVentasForCliente() {
        return ventasForCliente;
    }

    public void setVentasForCliente(Set ventasForCliente) {
        this.ventasForCliente = ventasForCliente;
    }

    public Set getVentasForVendedor() {
        return ventasForVendedor;
    }

    public void setVentasForVendedor(Set ventasForVendedor) {
        this.ventasForVendedor = ventasForVendedor;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}


