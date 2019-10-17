/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author ramiro
 */
@Entity
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String dominio;
    
    private String 
            marca, modelo, anio, tipo;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehiculo_id")
    private List<Cilindro> cilindros;

    public Vehiculo() {
    }
    
    

    public Vehiculo(String dominio, String marca, String modelo, String anio, List<Cilindro> cilindros) {
        this.dominio = dominio;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.cilindros = cilindros;
    }

    
    public void addCilindro(Cilindro c){
        if(cilindros==null){
            cilindros = new ArrayList<>();
        }
        
        cilindros.add(c);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    public List<Cilindro> getCilindros() {
        return cilindros;
    }

    public void setCilindros(List<Cilindro> cilindros) {
        this.cilindros = cilindros;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    
    
    
    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.dominio);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!this.dominio.equalsIgnoreCase(other.dominio)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
