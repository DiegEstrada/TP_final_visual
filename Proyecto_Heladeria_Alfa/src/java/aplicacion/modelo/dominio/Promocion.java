package aplicacion.modelo.dominio;
// Generated 12/06/2019 18:02:32 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Promocion  implements java.io.Serializable {


     private Integer idPromocion;
     private String nombre;
     private Date fechaInicio;
     private Date fechaFin;
     private Double descuento;
     private Set catalogos = new HashSet(0);

    public Promocion() {
    }

    public Promocion(String nombre, Date fechaInicio, Date fechaFin, Double descuento, Set catalogos) {
       this.nombre = nombre;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.descuento = descuento;
       this.catalogos = catalogos;
    }
   
    public Integer getIdPromocion() {
        return this.idPromocion;
    }
    
    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Double getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    public Set getCatalogos() {
        return this.catalogos;
    }
    
    public void setCatalogos(Set catalogos) {
        this.catalogos = catalogos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idPromocion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Promocion other = (Promocion) obj;
        if (!Objects.equals(this.idPromocion, other.idPromocion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Promocion{" + "idPromocion=" + idPromocion + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descuento=" + descuento + ", catalogos=" + catalogos + '}';
    }




}


