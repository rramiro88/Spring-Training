/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author ramiro
 */
@Entity
public class SolicitudOblea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    String numeroDeObleaAsignado;

    @OneToOne(cascade = CascadeType.MERGE)
    private Vehiculo vehiculo;

    @OneToOne(cascade = CascadeType.MERGE)
    private Persona propietario;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String operacion = "";
    private String obleaAnterior = "";
    private Boolean inyeccion;

    @OneToOne(cascade = CascadeType.MERGE)
    private Regulador regulador;
    
    private String manometroC, manometroN, tubAltaPC, tubAltaPN, accPTubC, accPTubN;

    private String dispSujCilC = "", dispSujCilN = "",
            eleValNafC = "", eleValNafN = "",
            eleValGncC = "", eleValGncN = "",
            dosifMezC = "", dosifMezN = "",
            sisVenteoC = "", sisVenteoN = "",
            valvCarInterC = "", valvCarInterN = "",
            valvCarExterC = "", valvCarExterN = "",
            mangBajaPresC = "", mangBajaPresN = "",
            canoAltaPresC = "", canoAltaPresN = "",
            llaveConmutadoraC = "", llaveConmutadoraN = "";

    private String operacionRegulador;
    
    private Boolean reguladorNuevo;
    
    private String observaciones, nroCertificado1, nroCertificado2, nroCertificado3, nroCertificado4;

    @Transient
    private Boolean incluirEnGeneracionTXT = true;

    @Lob
    @Column(length = 100000)
    private byte[] imagenRegulador;

    @Lob
    @Column(length = 100000)
    private byte[] imagenRegulador2;

    @Lob
    @Column(length = 100000)
    private byte[] imagenRegulador3;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL2;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL3;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL4;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL5;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL6;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL7;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL8;

    @Lob
    @Column(length = 100000)
    private byte[] imagenCIL9;

    @Lob
    @Column(length = 100000)
    private byte[] imagenVALCIL;

    @Lob
    @Column(length = 100000)
    private byte[] imagenVALCIL2;

    @Lob
    @Column(length = 100000)
    private byte[] imagenVALCIL3;

    private Boolean aprobada;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaAprobacion;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaVencimientoOblea;

    private String motivoRechazo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

    public String getNumeroDeObleaAsignado() {
        return numeroDeObleaAsignado;
    }

    public void setNumeroDeObleaAsignado(String numeroDeObleaAsignado) {
        this.numeroDeObleaAsignado = numeroDeObleaAsignado;
    }
    
    

    public Boolean getReguladorNuevo() {
        return reguladorNuevo;
    }

    public void setReguladorNuevo(Boolean reguladorNuevo) {
        this.reguladorNuevo = reguladorNuevo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNroCertificado1() {
        return nroCertificado1;
    }

    public void setNroCertificado1(String nroCertificado1) {
        this.nroCertificado1 = nroCertificado1;
    }

    public String getNroCertificado2() {
        return nroCertificado2;
    }

    public void setNroCertificado2(String nroCertificado2) {
        this.nroCertificado2 = nroCertificado2;
    }

    public String getNroCertificado3() {
        return nroCertificado3;
    }

    public void setNroCertificado3(String nroCertificado3) {
        this.nroCertificado3 = nroCertificado3;
    }

    public String getNroCertificado4() {
        return nroCertificado4;
    }

    public void setNroCertificado4(String nroCertificado4) {
        this.nroCertificado4 = nroCertificado4;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getObleaAnterior() {
        return obleaAnterior;
    }

    public void setObleaAnterior(String obleaAnterior) {
        this.obleaAnterior = obleaAnterior;
    }

    public Boolean getInyeccion() {
        return inyeccion;
    }

    public void setInyeccion(Boolean inyeccion) {
        this.inyeccion = inyeccion;
    }

    public Regulador getRegulador() {
        return regulador;
    }

    public void setRegulador(Regulador regulador) {
        this.regulador = regulador;
    }

    public String getDispSujCilC() {
        return dispSujCilC;
    }

    public void setDispSujCilC(String dispSujCilC) {
        this.dispSujCilC = dispSujCilC;
    }

    public String getDispSujCilN() {
        return dispSujCilN;
    }

    public void setDispSujCilN(String dispSujCilN) {
        this.dispSujCilN = dispSujCilN;
    }

    public String getEleValNafC() {
        return eleValNafC;
    }

    public void setEleValNafC(String eleValNafC) {
        this.eleValNafC = eleValNafC;
    }

    public String getEleValNafN() {
        return eleValNafN;
    }

    public void setEleValNafN(String eleValNafN) {
        this.eleValNafN = eleValNafN;
    }

    public String getEleValGncC() {
        return eleValGncC;
    }

    public void setEleValGncC(String eleValGncC) {
        this.eleValGncC = eleValGncC;
    }

    public String getEleValGncN() {
        return eleValGncN;
    }

    public void setEleValGncN(String eleValGncN) {
        this.eleValGncN = eleValGncN;
    }

    public String getDosifMezC() {
        return dosifMezC;
    }

    public void setDosifMezC(String dosifMezC) {
        this.dosifMezC = dosifMezC;
    }

    public String getDosifMezN() {
        return dosifMezN;
    }

    public void setDosifMezN(String dosifMezN) {
        this.dosifMezN = dosifMezN;
    }

    public String getSisVenteoC() {
        return sisVenteoC;
    }

    public void setSisVenteoC(String sisVenteoC) {
        this.sisVenteoC = sisVenteoC;
    }

    public String getSisVenteoN() {
        return sisVenteoN;
    }

    public void setSisVenteoN(String sisVenteoN) {
        this.sisVenteoN = sisVenteoN;
    }

    public String getValvCarInterC() {
        return valvCarInterC;
    }

    public void setValvCarInterC(String valvCarInterC) {
        this.valvCarInterC = valvCarInterC;
    }

    public String getValvCarInterN() {
        return valvCarInterN;
    }

    public void setValvCarInterN(String valvCarInterN) {
        this.valvCarInterN = valvCarInterN;
    }

    public String getValvCarExterC() {
        return valvCarExterC;
    }

    public void setValvCarExterC(String valvCarExterC) {
        this.valvCarExterC = valvCarExterC;
    }

    public String getValvCarExterN() {
        return valvCarExterN;
    }

    public void setValvCarExterN(String valvCarExterN) {
        this.valvCarExterN = valvCarExterN;
    }

    public String getMangBajaPresC() {
        return mangBajaPresC;
    }

    public void setMangBajaPresC(String mangBajaPresC) {
        this.mangBajaPresC = mangBajaPresC;
    }

    public String getMangBajaPresN() {
        return mangBajaPresN;
    }

    public void setMangBajaPresN(String mangBajaPresN) {
        this.mangBajaPresN = mangBajaPresN;
    }

    public String getManometroC() {
        return manometroC;
    }

    public void setManometroC(String manometroC) {
        this.manometroC = manometroC;
    }

    public String getManometroN() {
        return manometroN;
    }

    public void setManometroN(String manometroN) {
        this.manometroN = manometroN;
    }

    public String getTubAltaPC() {
        return tubAltaPC;
    }

    public void setTubAltaPC(String tubAltaPC) {
        this.tubAltaPC = tubAltaPC;
    }

    public String getTubAltaPN() {
        return tubAltaPN;
    }

    public void setTubAltaPN(String tubAltaPN) {
        this.tubAltaPN = tubAltaPN;
    }

    public String getAccPTubC() {
        return accPTubC;
    }

    public void setAccPTubC(String accPTubC) {
        this.accPTubC = accPTubC;
    }

    public String getAccPTubN() {
        return accPTubN;
    }

    public void setAccPTubN(String accPTubN) {
        this.accPTubN = accPTubN;
    }
    
    

    public String getCanoAltaPresC() {
        return canoAltaPresC;
    }

    public void setCanoAltaPresC(String canoAltaPresC) {
        this.canoAltaPresC = canoAltaPresC;
    }

    public String getCanoAltaPresN() {
        return canoAltaPresN;
    }

    public void setCanoAltaPresN(String canoAltaPresN) {
        this.canoAltaPresN = canoAltaPresN;
    }

    public String getLlaveConmutadoraC() {
        return llaveConmutadoraC;
    }

    public void setLlaveConmutadoraC(String llaveConmutadoraC) {
        this.llaveConmutadoraC = llaveConmutadoraC;
    }

    public String getLlaveConmutadoraN() {
        return llaveConmutadoraN;
    }

    public void setLlaveConmutadoraN(String llaveConmutadoraN) {
        this.llaveConmutadoraN = llaveConmutadoraN;
    }

    public String getOperacionRegulador() {
        return operacionRegulador;
    }

    public void setOperacionRegulador(String operacionRegulador) {
        this.operacionRegulador = operacionRegulador;
    }

    public Boolean getIncluirEnGeneracionTXT() {
        return incluirEnGeneracionTXT;
    }

    public void setIncluirEnGeneracionTXT(Boolean incluirEnGeneracionTXT) {
        this.incluirEnGeneracionTXT = incluirEnGeneracionTXT;
    }

    public byte[] getImagenRegulador() {
        return imagenRegulador;
    }

    public void setImagenRegulador(byte[] imagenRegulador) {
        this.imagenRegulador = imagenRegulador;
    }

    public byte[] getImagenRegulador2() {
        return imagenRegulador2;
    }

    public void setImagenRegulador2(byte[] imagenRegulador2) {
        this.imagenRegulador2 = imagenRegulador2;
    }

    public byte[] getImagenRegulador3() {
        return imagenRegulador3;
    }

    public void setImagenRegulador3(byte[] imagenRegulador3) {
        this.imagenRegulador3 = imagenRegulador3;
    }

    public byte[] getImagenCIL() {
        return imagenCIL;
    }

    public void setImagenCIL(byte[] imagenCIL) {
        this.imagenCIL = imagenCIL;
    }

    public byte[] getImagenCIL2() {
        return imagenCIL2;
    }

    public void setImagenCIL2(byte[] imagenCIL2) {
        this.imagenCIL2 = imagenCIL2;
    }

    public byte[] getImagenCIL3() {
        return imagenCIL3;
    }

    public void setImagenCIL3(byte[] imagenCIL3) {
        this.imagenCIL3 = imagenCIL3;
    }

    public byte[] getImagenCIL4() {
        return imagenCIL4;
    }

    public void setImagenCIL4(byte[] imagenCIL4) {
        this.imagenCIL4 = imagenCIL4;
    }

    public byte[] getImagenCIL5() {
        return imagenCIL5;
    }

    public void setImagenCIL5(byte[] imagenCIL5) {
        this.imagenCIL5 = imagenCIL5;
    }

    public byte[] getImagenCIL6() {
        return imagenCIL6;
    }

    public void setImagenCIL6(byte[] imagenCIL6) {
        this.imagenCIL6 = imagenCIL6;
    }

    public byte[] getImagenCIL7() {
        return imagenCIL7;
    }

    public void setImagenCIL7(byte[] imagenCIL7) {
        this.imagenCIL7 = imagenCIL7;
    }

    public byte[] getImagenCIL8() {
        return imagenCIL8;
    }

    public void setImagenCIL8(byte[] imagenCIL8) {
        this.imagenCIL8 = imagenCIL8;
    }

    public byte[] getImagenCIL9() {
        return imagenCIL9;
    }

    public void setImagenCIL9(byte[] imagenCIL9) {
        this.imagenCIL9 = imagenCIL9;
    }

    public byte[] getImagenVALCIL() {
        return imagenVALCIL;
    }

    public void setImagenVALCIL(byte[] imagenVALCIL) {
        this.imagenVALCIL = imagenVALCIL;
    }

    public byte[] getImagenVALCIL2() {
        return imagenVALCIL2;
    }

    public void setImagenVALCIL2(byte[] imagenVALCIL2) {
        this.imagenVALCIL2 = imagenVALCIL2;
    }

    public byte[] getImagenVALCIL3() {
        return imagenVALCIL3;
    }

    public void setImagenVALCIL3(byte[] imagenVALCIL3) {
        this.imagenVALCIL3 = imagenVALCIL3;
    }

    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = aprobada;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Date getFechaVencimientoOblea() {
        return fechaVencimientoOblea;
    }

    public void setFechaVencimientoOblea(Date fechaVencimientoOblea) {
        this.fechaVencimientoOblea = fechaVencimientoOblea;
    }

    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final SolicitudOblea other = (SolicitudOblea) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
