/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author ramiro
 */
@Entity
@Data
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String nombre;

    private String pass;
    
    private String razonSocial, domicilio, cuit, codigo, ciudad, provincia, telefono, tipoDoc, nroDoc, codigoPEC;

    @OneToOne(cascade = CascadeType.ALL)
    private Rol rol;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<Alerta> alertas;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonManagedReference
    private List<SolicitudOblea> solicitudesOblea;

    @OneToOne(cascade = CascadeType.ALL)
    private CuentaCorriente cuentaCorriente;
    
    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<ProductoTienda> productos;
    
    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Pec> pecs;
    
    @OneToMany(mappedBy = "usuario")
    private List<CartaCompromiso> cartasCompromiso;
    
    @OneToOne(cascade = CascadeType.ALL)
    private ResponsableTecnico responsableTecnico;
    
    private String email;

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuario[ id=" + id + " ]";
    }

    public Usuario() {
    }

    public Usuario(String nombre, String pass, String razonSocial, String domicilio, String cuit, String codigo, String email) {
        this.nombre = nombre;
        this.pass = pass;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.cuit = cuit;
        this.codigo = codigo;
        this.email = email;
    }
    
    

}
