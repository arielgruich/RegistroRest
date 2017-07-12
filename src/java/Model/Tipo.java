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
@Table(name = "tipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipo.findAll", query = "SELECT t FROM Tipo t")
    , @NamedQuery(name = "Tipo.findByIdtipo", query = "SELECT t FROM Tipo t WHERE t.idtipo = :idtipo")
    , @NamedQuery(name = "Tipo.findByNombretipo", query = "SELECT t FROM Tipo t WHERE t.nombretipo = :nombretipo")
    , @NamedQuery(name = "Tipo.findByUsuarioBitacora", query = "SELECT t FROM Tipo t WHERE t.usuarioBitacora = :usuarioBitacora")
    , @NamedQuery(name = "Tipo.findByFechaBitacora", query = "SELECT t FROM Tipo t WHERE t.fechaBitacora = :fechaBitacora")
    , @NamedQuery(name = "Tipo.findByRegistroBitacora", query = "SELECT t FROM Tipo t WHERE t.registroBitacora = :registroBitacora")})
public class Tipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idtipo")
    private int idtipo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombretipo")
    private String nombretipo;
    @Size(max = 50)
    @Column(name = "usuario_bitacora")
    private String usuarioBitacora;
    @Column(name = "fecha_bitacora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBitacora;
    @Size(max = 50)
    @Column(name = "registro_bitacora")
    private String registroBitacora;
    @OneToMany(mappedBy = "tipo")
    private Collection<Peticion> peticionCollection;

    public Tipo() {
    }

    public Tipo(String nombretipo) {
        this.nombretipo = nombretipo;
    }

    public Tipo(String nombretipo, int idtipo) {
        this.nombretipo = nombretipo;
        this.idtipo = idtipo;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombretipo() {
        return nombretipo;
    }

    public void setNombretipo(String nombretipo) {
        this.nombretipo = nombretipo;
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
        hash += (nombretipo != null ? nombretipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo)) {
            return false;
        }
        Tipo other = (Tipo) object;
        if ((this.nombretipo == null && other.nombretipo != null) || (this.nombretipo != null && !this.nombretipo.equals(other.nombretipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Tipo[ nombretipo=" + nombretipo + " ]";
    }
    
}
