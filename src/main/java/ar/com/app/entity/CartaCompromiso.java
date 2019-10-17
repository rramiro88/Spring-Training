/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author ramiro
 */
@Entity
public class CartaCompromiso implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @OneToOne(cascade = CascadeType.MERGE)
    private Persona propietario;
    
    @OneToOne(cascade = CascadeType.MERGE)
    private Vehiculo vehiculo;
    
    private String 
            tdmDesmontoCil, 
            codigoTDM, direccionTDM, codigoPEC, nombrePEC, telefonoTDM, numeroOblea, tipoDeOperacion,
            lugarEncabezado;
    
    
    private String estado, motivoRechazo;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEncabezado;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    private Boolean incluirEnTxt = true;

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }

    public Boolean getIncluirEnTxt() {
        return incluirEnTxt;
    }

    public void setIncluirEnTxt(Boolean incluirEnTxt) {
        this.incluirEnTxt = incluirEnTxt;
    }
    

    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTdmDesmontoCil() {
        return tdmDesmontoCil;
    }

    public void setTdmDesmontoCil(String tdmDesmontoCil) {
        this.tdmDesmontoCil = tdmDesmontoCil;
    }

    public String getCodigoTDM() {
        return codigoTDM;
    }

    public void setCodigoTDM(String codigoTDM) {
        this.codigoTDM = codigoTDM;
    }

    public String getDireccionTDM() {
        return direccionTDM;
    }

    public void setDireccionTDM(String direccionTDM) {
        this.direccionTDM = direccionTDM;
    }

    public String getCodigoPEC() {
        return codigoPEC;
    }

    public void setCodigoPEC(String codigoPEC) {
        this.codigoPEC = codigoPEC;
    }

    public String getNombrePEC() {
        return nombrePEC;
    }

    public void setNombrePEC(String nombrePEC) {
        this.nombrePEC = nombrePEC;
    }

    public String getTelefonoTDM() {
        return telefonoTDM;
    }

    public void setTelefonoTDM(String telefonoTDM) {
        this.telefonoTDM = telefonoTDM;
    }
    
    public String getNumeroOblea() {
        return numeroOblea;
    }

    public void setNumeroOblea(String numeroOblea) {
        this.numeroOblea = numeroOblea;
    }

    public String getTipoDeOperacion() {
        return tipoDeOperacion;
    }

    public void setTipoDeOperacion(String tipoDeOperacion) {
        this.tipoDeOperacion = tipoDeOperacion;
    }

    public String getLugarEncabezado() {
        return lugarEncabezado;
    }

    public void setLugarEncabezado(String lugarEncabezado) {
        this.lugarEncabezado = lugarEncabezado;
    }

    public Date getFechaEncabezado() {
        return fechaEncabezado;
    }

    public void setFechaEncabezado(Date fechaEncabezado) {
        this.fechaEncabezado = fechaEncabezado;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartaCompromiso)) {
            return false;
        }
        CartaCompromiso other = (CartaCompromiso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gncingenieria.entidades.CartaCompromiso[ id=" + id + " ]";
    }
    
}
