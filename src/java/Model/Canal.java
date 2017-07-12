/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "canal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canal.findAll", query = "SELECT c FROM Canal c")
    , @NamedQuery(name = "Canal.findByIdcanal", query = "SELECT c FROM Canal c WHERE c.idcanal = :idcanal")
    , @NamedQuery(name = "Canal.findByNombrecanal", query = "SELECT c FROM Canal c WHERE c.nombrecanal = :nombrecanal")
    , @NamedQuery(name = "Canal.findByUsuarioBitacora", query = "SELECT c FROM Canal c WHERE c.usuarioBitacora = :usuarioBitacora")
    , @NamedQuery(name = "Canal.findByFechaBitacora", query = "SELECT c FROM Canal c WHERE c.fechaBitacora = :fechaBitacora")
    , @NamedQuery(name = "Canal.findByRegistroBitacora", query = "SELECT c FROM Canal c WHERE c.registroBitacora = :registroBitacora")})
public class Canal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idcanal")
    private int idcanal;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombrecanal")
    private String nombrecanal;
    @Size(max = 50)
    @Column(name = "usuario_bitacora")
    private String usuarioBitacora;
    @Column(name = "fecha_bitacora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBitacora;
    @Size(max = 50)
    @Column(name = "registro_bitacora")
    private String registroBitacora;
    @OneToMany(mappedBy = "canal")
    private Collection<Peticion> peticionCollection;

    public Canal() {
    }

    public Canal(String nombrecanal) {
        this.nombrecanal = nombrecanal;
    }

    public Canal(String nombrecanal, int idcanal) {
        this.nombrecanal = nombrecanal;
        this.idcanal = idcanal;
    }

    public int getIdcanal() {
        return idcanal;
    }

    public void setIdcanal(int idcanal) {
        this.idcanal = idcanal;
    }

    public String getNombrecanal() {
        return nombrecanal;
    }

    public void setNombrecanal(String nombrecanal) {
        this.nombrecanal = nombrecanal;
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

    @XmlTransient
    public Collection<Peticion> getPeticionCollection() {
        return peticionCollection;
    }

    public void setPeticionCollection(Collection<Peticion> peticionCollection) {
        this.peticionCollection = peticionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombrecanal != null ? nombrecanal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canal)) {
            return false;
        }
        Canal other = (Canal) object;
        if ((this.nombrecanal == null && other.nombrecanal != null) || (this.nombrecanal != null && !this.nombrecanal.equals(other.nombrecanal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Canal[ nombrecanal=" + nombrecanal + " ]";
    }
    
}
