/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "peticion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peticion.findAll", query = "SELECT p FROM Peticion p")
    , @NamedQuery(name = "Peticion.findByIdpeticion", query = "SELECT p FROM Peticion p WHERE p.idpeticion = :idpeticion")
    , @NamedQuery(name = "Peticion.findByNombre", query = "SELECT p FROM Peticion p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Peticion.findByTelefono1", query = "SELECT p FROM Peticion p WHERE p.telefono1 = :telefono1")
    , @NamedQuery(name = "Peticion.findByUsuarioBitacora", query = "SELECT p FROM Peticion p WHERE p.usuarioBitacora = :usuarioBitacora")
    , @NamedQuery(name = "Peticion.findByFechaBitacora", query = "SELECT p FROM Peticion p WHERE p.fechaBitacora = :fechaBitacora")
    , @NamedQuery(name = "Peticion.findByRegistroBitacora", query = "SELECT p FROM Peticion p WHERE p.registroBitacora = :registroBitacora")})
public class Peticion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpeticion")
    private Integer idpeticion;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "telefono1")
    private String telefono1;
    @Size(max = 50)
    @Column(name = "usuario_bitacora")
    private String usuarioBitacora;
    @Column(name = "fecha_bitacora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBitacora;
    @Size(max = 50)
    @Column(name = "registro_bitacora")
    private String registroBitacora;
    @JoinColumn(name = "canal", referencedColumnName = "nombrecanal")
    @ManyToOne
    private Canal canal;
    @JoinColumn(name = "tipo", referencedColumnName = "nombretipo")
    @ManyToOne
    private Tipo tipo;

    public Peticion() {
    }

    public Peticion(Integer idpeticion) {
        this.idpeticion = idpeticion;
    }

    public Integer getIdpeticion() {
        return idpeticion;
    }

    public void setIdpeticion(Integer idpeticion) {
        this.idpeticion = idpeticion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getUsuarioBitacora() {
        return usuarioBitacora;
    }

    public void setUsuarioBitacora(String usuarioBitacora) {
        this.usuarioBitacora = usuarioBitacora;
    }

    public Date getFechaBitacora() {
        return fechaBitacora;
    }

    public void setFechaBitacora(Date fechaBitacora) {
        this.fechaBitacora = fechaBitacora;
    }

    public String getRegistroBitacora() {
        return registroBitacora;
    }

    public void setRegistroBitacora(String registroBitacora) {
        this.registroBitacora = registroBitacora;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpeticion != null ? idpeticion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peticion)) {
            return false;
        }
        Peticion other = (Peticion) object;
        if ((this.idpeticion == null && other.idpeticion != null) || (this.idpeticion != null && !this.idpeticion.equals(other.idpeticion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Peticion[ idpeticion=" + idpeticion + " ]";
    }
    
}
