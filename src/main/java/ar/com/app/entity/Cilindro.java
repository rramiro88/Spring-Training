/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author ramiro
 */
@Entity
public class Cilindro implements Serializable {

    @Id
    private String numeroDeSerie;

    private String codigoHomologado, capacidad, material, marca, nroCertificado, observaciones, crpc, msdb;

    
    private String fechaFabricacion;

    
    private String fechaUltimaRevision;

    @OneToOne(cascade = CascadeType.ALL)
    private Valvula valvula;

    @OneToOne(mappedBy = "cilindro", cascade = CascadeType.ALL)
    private OrdenDeTrabajo ordenDeTrabajo;

    private Boolean nuevo;

    public OrdenDeTrabajo getOrdenDeTrabajo() {
        return ordenDeTrabajo;
    }

    public void setOrdenDeTrabajo(OrdenDeTrabajo ordenDeTrabajo) {
        this.ordenDeTrabajo = ordenDeTrabajo;
    }

    public Cilindro() {
        valvula = new Valvula();
    }

    public Cilindro(String numeroDeSerie, String codigoHomologado, String capacidad, String material, String marca, String nroCertificado, String fechaFabricacion, String fechaUltimaRevision, Valvula valvula) {
        this.numeroDeSerie = numeroDeSerie;
        this.codigoHomologado = codigoHomologado;
        this.capacidad = capacidad;
        this.material = material;
        this.marca = marca;
        this.nroCertificado = nroCertificado;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaUltimaRevision = fechaUltimaRevision;
        this.valvula = valvula;
    }

    public String getMsdb() {
        return msdb;
    }

    public void setMsdb(String msdb) {
        this.msdb = msdb;
    }

    public Boolean getNuevo() {
        return nuevo;
    }

    public void setNuevo(Boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String getCrpc() {
        return crpc;
    }

    public void setCrpc(String crpc) {
        this.crpc = crpc;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNroCertificado() {
        return nroCertificado;
    }

    public void setNroCertificado(String nroCertificado) {
        this.nroCertificado = nroCertificado;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public void setFechaUltimaRevision(String fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }

    public Valvula getValvula() {
        return valvula;
    }

    public void setValvula(Valvula valvula) {
        this.valvula = valvula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigoHomologado() {
        return codigoHomologado;
    }

    public void setCodigoHomologado(String codigoHomologado) {
        this.codigoHomologado = codigoHomologado;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getAnioFabricacion() {
        return fechaFabricacion.split("/")[1];
    }

    public String getMesFabricacion() {
        return fechaFabricacion.split("/")[0];
    }

    public String getAnioRevision() {
        return fechaUltimaRevision.split("/")[1];
    }

    public String getMesRevision() {
        return fechaUltimaRevision.split("/")[0];
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.numeroDeSerie);
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
        final Cilindro other = (Cilindro) obj;
        if (!Objects.equals(this.numeroDeSerie, other.numeroDeSerie)) {
            return false;
        }
        return true;
    }

}
