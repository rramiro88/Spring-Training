/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ramiro
 */
@Entity
public class Valvula implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    private String numeroDeSerie;

   
    private String codigoHomologado, marca, modelo;

    public Valvula(String numeroDeSerie, String codigoHomologado, String marca) {
        this.numeroDeSerie = numeroDeSerie;
        this.codigoHomologado = codigoHomologado;
        this.marca = marca;
    }

    public Valvula() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getCodigoHomologado() {
        return codigoHomologado;
    }

    public void setCodigoHomologado(String codigoHomologado) {
        this.codigoHomologado = codigoHomologado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
