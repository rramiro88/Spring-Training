/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author ramiro
 */
@Entity
public class OrdenDeTrabajo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String
            cliente, marca, codigo;
    
    @OneToOne
    private Cilindro cilindro;
    
    private Integer
            volumen, numero, masa;
    
    private String 
            fondo, venteo, desvalvuladoInertizado, verificacionValvula, tipoRosca,
            limpiezaInterior, limpiezaExterior, despintado, inspeccionVisualExterna,
            inspeccionVisualInterna,otrosDefectosA, otrosDefectosB;
    
    private Integer 
            roscaLargo,roscaMinimoPermitido,roscaSinDano, perimetro, longitud;
    
    private Double 
            espesorPared1, espesorPared2, espesorPared3, espesorPared4, espesorPared5,
            espesorFondo1, espesorFondo2, espesorFondo3,
            controlDeMasa1,controlDeMasa2,controlDeMasa3,
            ovalizacion1,ovalizacion2,ovalizacion3,ovalizacion4,ovalizacion5,ovalizacion6,ovalizacion7,ovalizacion8,ovalizacion9,
            pesoLleno,
            dureza, presionTrabajo, presionPrueba, temperaturaPrueba, aguaIngresada, expansionPermanente;

    private Date fecha;
    
    private Boolean 
            globos, abolladuras, abolladurasConEstrias, fisuras, laminado, pinchaduras, defectoRosca, desgaste, 
            corrosion, ovalado, faltaODeformacionEstampado, expansionVolumetricaExcesiva, perdidaDeMasa, danoPorFuegoOCalor;
    
    private Boolean aprobadaAdmin;

    public Boolean getAprobadaAdmin() {
        return aprobadaAdmin;
    }

    public void setAprobadaAdmin(Boolean aprobadaAdmin) {
        this.aprobadaAdmin = aprobadaAdmin;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cilindro getCilindro() {
        return cilindro;
    }

    public void setCilindro(Cilindro cilindro) {
        this.cilindro = cilindro;
    }

    public Boolean getGlobos() {
        return globos;
    }

    public void setGlobos(Boolean globos) {
        this.globos = globos;
    }

    public Boolean getAbolladuras() {
        return abolladuras;
    }

    public void setAbolladuras(Boolean abolladuras) {
        this.abolladuras = abolladuras;
    }

    public Boolean getAbolladurasConEstrias() {
        return abolladurasConEstrias;
    }

    public void setAbolladurasConEstrias(Boolean abolladurasConEstrias) {
        this.abolladurasConEstrias = abolladurasConEstrias;
    }

    public Boolean getFisuras() {
        return fisuras;
    }

    public void setFisuras(Boolean fisuras) {
        this.fisuras = fisuras;
    }

    public Boolean getLaminado() {
        return laminado;
    }

    public void setLaminado(Boolean laminado) {
        this.laminado = laminado;
    }

    public Boolean getPinchaduras() {
        return pinchaduras;
    }

    public void setPinchaduras(Boolean pinchaduras) {
        this.pinchaduras = pinchaduras;
    }

    public Boolean getDefectoRosca() {
        return defectoRosca;
    }

    public void setDefectoRosca(Boolean defectoRosca) {
        this.defectoRosca = defectoRosca;
    }

    public Boolean getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(Boolean desgaste) {
        this.desgaste = desgaste;
    }

    public Boolean getCorrosion() {
        return corrosion;
    }

    public void setCorrosion(Boolean corrosion) {
        this.corrosion = corrosion;
    }

    public Boolean getOvalado() {
        return ovalado;
    }

    public void setOvalado(Boolean ovalado) {
        this.ovalado = ovalado;
    }

    public Boolean getFaltaODeformacionEstampado() {
        return faltaODeformacionEstampado;
    }

    public void setFaltaODeformacionEstampado(Boolean faltaODeformacionEstampado) {
        this.faltaODeformacionEstampado = faltaODeformacionEstampado;
    }

    public Boolean getExpansionVolumetricaExcesiva() {
        return expansionVolumetricaExcesiva;
    }

    public void setExpansionVolumetricaExcesiva(Boolean expansionVolumetricaExcesiva) {
        this.expansionVolumetricaExcesiva = expansionVolumetricaExcesiva;
    }

    public Boolean getPerdidaDeMasa() {
        return perdidaDeMasa;
    }

    public void setPerdidaDeMasa(Boolean perdidaDeMasa) {
        this.perdidaDeMasa = perdidaDeMasa;
    }

    public Boolean getDanoPorFuegoOCalor() {
        return danoPorFuegoOCalor;
    }

    public void setDanoPorFuegoOCalor(Boolean danoPorFuegoOCalor) {
        this.danoPorFuegoOCalor = danoPorFuegoOCalor;
    }

    public String getOtrosDefectosA() {
        return otrosDefectosA;
    }

    public void setOtrosDefectosA(String otrosDefectosA) {
        this.otrosDefectosA = otrosDefectosA;
    }

    public String getOtrosDefectosB() {
        return otrosDefectosB;
    }

    public void setOtrosDefectosB(String otrosDefectosB) {
        this.otrosDefectosB = otrosDefectosB;
    }

   
   
    public Double getControlDeMasa1() {
        return controlDeMasa1;
    }

    public void setControlDeMasa1(Double controlDeMasa1) {
        this.controlDeMasa1 = controlDeMasa1;
    }

    public Double getControlDeMasa2() {
        return controlDeMasa2;
    }

    public void setControlDeMasa2(Double controlDeMasa2) {
        this.controlDeMasa2 = controlDeMasa2;
    }

    public Double getControlDeMasa3() {
        return controlDeMasa3;
    }

    public void setControlDeMasa3(Double controlDeMasa3) {
        this.controlDeMasa3 = controlDeMasa3;
    }
    
    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getMasa() {
        return masa;
    }

    public void setMasa(Integer masa) {
        this.masa = masa;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public String getVenteo() {
        return venteo;
    }

    public void setVenteo(String venteo) {
        this.venteo = venteo;
    }

    public String getDesvalvuladoInertizado() {
        return desvalvuladoInertizado;
    }

    public void setDesvalvuladoInertizado(String desvalvuladoInertizado) {
        this.desvalvuladoInertizado = desvalvuladoInertizado;
    }

    public String getVerificacionValvula() {
        return verificacionValvula;
    }

    public void setVerificacionValvula(String verificacionValvula) {
        this.verificacionValvula = verificacionValvula;
    }

    public String getTipoRosca() {
        return tipoRosca;
    }

    public void setTipoRosca(String tipoRosca) {
        this.tipoRosca = tipoRosca;
    }

    public String getLimpiezaInterior() {
        return limpiezaInterior;
    }

    public void setLimpiezaInterior(String limpiezaInterior) {
        this.limpiezaInterior = limpiezaInterior;
    }

    public String getLimpiezaExterior() {
        return limpiezaExterior;
    }

    public void setLimpiezaExterior(String limpiezaExterior) {
        this.limpiezaExterior = limpiezaExterior;
    }

    public String getDespintado() {
        return despintado;
    }

    public void setDespintado(String despintado) {
        this.despintado = despintado;
    }

    public String getInspeccionVisualExterna() {
        return inspeccionVisualExterna;
    }

    public void setInspeccionVisualExterna(String inspeccionVisualExterna) {
        this.inspeccionVisualExterna = inspeccionVisualExterna;
    }

    public String getInspeccionVisualInterna() {
        return inspeccionVisualInterna;
    }

    public void setInspeccionVisualInterna(String inspeccionVisualInterna) {
        this.inspeccionVisualInterna = inspeccionVisualInterna;
    }

    public Integer getRoscaLargo() {
        return roscaLargo;
    }

    public void setRoscaLargo(Integer roscaLargo) {
        this.roscaLargo = roscaLargo;
    }

    public Integer getRoscaMinimoPermitido() {
        return roscaMinimoPermitido;
    }

    public void setRoscaMinimoPermitido(Integer roscaMinimoPermitido) {
        this.roscaMinimoPermitido = roscaMinimoPermitido;
    }

    public Integer getRoscaSinDano() {
        return roscaSinDano;
    }

    public void setRoscaSinDano(Integer roscaSinDano) {
        this.roscaSinDano = roscaSinDano;
    }

    public Integer getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Integer perimetro) {
        this.perimetro = perimetro;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Double getEspesorPared1() {
        return espesorPared1;
    }

    public void setEspesorPared1(Double espesorPared1) {
        this.espesorPared1 = espesorPared1;
    }

    public Double getEspesorPared2() {
        return espesorPared2;
    }

    public void setEspesorPared2(Double espesorPared2) {
        this.espesorPared2 = espesorPared2;
    }

    public Double getEspesorPared3() {
        return espesorPared3;
    }

    public void setEspesorPared3(Double espesorPared3) {
        this.espesorPared3 = espesorPared3;
    }

    public Double getEspesorPared4() {
        return espesorPared4;
    }

    public void setEspesorPared4(Double espesorPared4) {
        this.espesorPared4 = espesorPared4;
    }

    public Double getEspesorPared5() {
        return espesorPared5;
    }

    public void setEspesorPared5(Double espesorPared5) {
        this.espesorPared5 = espesorPared5;
    }

    public Double getEspesorFondo1() {
        return espesorFondo1;
    }

    public void setEspesorFondo1(Double espesorFondo1) {
        this.espesorFondo1 = espesorFondo1;
    }

    public Double getEspesorFondo2() {
        return espesorFondo2;
    }

    public void setEspesorFondo2(Double espesorFondo2) {
        this.espesorFondo2 = espesorFondo2;
    }

    public Double getEspesorFondo3() {
        return espesorFondo3;
    }

    public void setEspesorFondo3(Double espesorFondo3) {
        this.espesorFondo3 = espesorFondo3;
    }

   

    public Double getOvalizacion1() {
        return ovalizacion1;
    }

    public void setOvalizacion1(Double ovalizacion1) {
        this.ovalizacion1 = ovalizacion1;
    }

    public Double getOvalizacion2() {
        return ovalizacion2;
    }

    public void setOvalizacion2(Double ovalizacion2) {
        this.ovalizacion2 = ovalizacion2;
    }

    public Double getOvalizacion3() {
        return ovalizacion3;
    }

    public void setOvalizacion3(Double ovalizacion3) {
        this.ovalizacion3 = ovalizacion3;
    }

    public Double getOvalizacion4() {
        return ovalizacion4;
    }

    public void setOvalizacion4(Double ovalizacion4) {
        this.ovalizacion4 = ovalizacion4;
    }

    public Double getOvalizacion5() {
        return ovalizacion5;
    }

    public void setOvalizacion5(Double ovalizacion5) {
        this.ovalizacion5 = ovalizacion5;
    }

    public Double getOvalizacion6() {
        return ovalizacion6;
    }

    public void setOvalizacion6(Double ovalizacion6) {
        this.ovalizacion6 = ovalizacion6;
    }

    public Double getOvalizacion7() {
        return ovalizacion7;
    }

    public void setOvalizacion7(Double ovalizacion7) {
        this.ovalizacion7 = ovalizacion7;
    }

    public Double getOvalizacion8() {
        return ovalizacion8;
    }

    public void setOvalizacion8(Double ovalizacion8) {
        this.ovalizacion8 = ovalizacion8;
    }

    public Double getOvalizacion9() {
        return ovalizacion9;
    }

    public void setOvalizacion9(Double ovalizacion9) {
        this.ovalizacion9 = ovalizacion9;
    }

    public Double getPesoLleno() {
        return pesoLleno;
    }

    public void setPesoLleno(Double pesoLleno) {
        this.pesoLleno = pesoLleno;
    }

    public Double getDureza() {
        return dureza;
    }

    public void setDureza(Double dureza) {
        this.dureza = dureza;
    }

    public Double getPresionTrabajo() {
        return presionTrabajo;
    }

    public void setPresionTrabajo(Double presionTrabajo) {
        this.presionTrabajo = presionTrabajo;
    }

    public Double getPresionPrueba() {
        return presionPrueba;
    }

    public void setPresionPrueba(Double presionPrueba) {
        this.presionPrueba = presionPrueba;
    }

    public Double getTemperaturaPrueba() {
        return temperaturaPrueba;
    }

    public void setTemperaturaPrueba(Double temperaturaPrueba) {
        this.temperaturaPrueba = temperaturaPrueba;
    }

    public Double getAguaIngresada() {
        return aguaIngresada;
    }

    public void setAguaIngresada(Double aguaIngresada) {
        this.aguaIngresada = aguaIngresada;
    }

    public Double getExpansionPermanente() {
        return expansionPermanente;
    }

    public void setExpansionPermanente(Double expansionPermanente) {
        this.expansionPermanente = expansionPermanente;
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
        if (!(object instanceof OrdenDeTrabajo)) {
            return false;
        }
        OrdenDeTrabajo other = (OrdenDeTrabajo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gncingenieria.entidades.OrdenDeTrabajo[ id=" + id + " ]";
    }
    
}
